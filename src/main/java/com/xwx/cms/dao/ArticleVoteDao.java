package com.xwx.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xwx.cms.pojo.ArticleVote;
import com.xwx.cms.pojo.User;

public interface ArticleVoteDao extends BaseDao<ArticleVote> {

	List<ArticleVote> List(ArticleVote vote);
	
	User ListById(@Param("id")Integer id);
	
	int insert(ArticleVote vote);
	
	int Update(ArticleVote vote);
	
	int Deletes(@Param("ids")String ids);

}
