package com.xwx.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xwx.cms.pojo.Collect;
import com.xwx.cms.pojo.User;

public interface CollectDao extends BaseDao<Collect>{

	List<Collect> List(Collect collect);
	
	User ListById(@Param("id")Integer id);
	
	int insert(Collect collect);
	
	int Update(Collect collect);
	
	int Deletes(@Param("ids")String ids);

}
