package com.xwx.cms.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xwx.cms.dao.CommentDao;
import com.xwx.cms.dao.UserDao;
import com.xwx.cms.pojo.Comment;
import com.xwx.cms.pojo.User;
import com.xwx.cms.service.ArticleService;
import com.xwx.cms.service.CommentService;
import com.xwx.cms.service.UserService;
import com.xwx.common.utils.DataUtil;
import com.xwx.common.utils.RandomUtil;
import com.xwx.common.utils.StringUtil;
@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentDao commentDao;
	@Autowired
	private UserDao userDao;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private UserService userService;

	@Override
	public boolean add(Comment comment) {
		comment.setCreated(new Date());
		boolean result = commentDao.insert(comment)>0;
		/** 修改文章的评论数 **/
		boolean result2 = articleService.updateCommentCnt(comment.getArticleId());
		return result && result2;
	}

	@Override
	public PageInfo<Comment> getPageInfo(Integer articleId, Integer pageNo, Integer pageSize) {
		Comment comment = new Comment();
		comment.setArticleId(articleId);
		PageHelper.startPage(pageNo, pageSize);
		List<Comment> commentList = commentDao.select(comment);
		commentList.forEach(c->{
			User user = userDao.selectById(c.getUserId());
			c.setNickname(user.getNickname());
			c.setHeadimg(user.getHeadimg());
		});
		return new PageInfo<>(commentList);
	}

	@Override
	public Comment getRandomComment() {
		Comment comment = new Comment();
		/** 文章Id **/
		Integer randomArticleId = articleService.getRandomArticleId();
		comment.setArticleId(randomArticleId);
		/** 用户Id **/
		Integer randomUserId = userService.getRandomUserId();
		comment.setUserId(randomUserId);
		/** 评论内容 **/
		int random = RandomUtil.random(10, 200);
		String randomChineseString = StringUtil.randomChineseString(random);
		comment.setContent(randomChineseString);
		/** 评论时间 **/
		System.out.println(randomChineseString);
		Date date1 = DataUtil.parse("2020-01-01 00:00:00", "yyyy-MM-dd HH:mm:ss");
		Date date2 = new Date();
		Date randomDate = DataUtil.getRandomDate(date1, date2);
		comment.setCreated(randomDate);
		return comment;
	}

}
