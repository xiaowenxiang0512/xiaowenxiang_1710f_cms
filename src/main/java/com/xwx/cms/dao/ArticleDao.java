package com.xwx.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xwx.cms.pojo.Article;

import com.xwx.cms.pojo.User; 

public interface ArticleDao extends BaseDao<Article>{

	List<Article> List(Article article);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Article atricle);
	
	int Update(Article atricle);
	
	int Deletes(@Param("ids")String ids);

}
