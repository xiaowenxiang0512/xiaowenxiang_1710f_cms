package com.xwx.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xwx.cms.dao.UserDao;
import com.xwx.cms.pojo.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class UserDemo {
	
	@Autowired
	private UserDao userdao;
	
	@Test
	public void DemoUser() {
		List<User> users = userdao.select(null);
//		System.out.println(users);

		User user = new User();
		
		//数据
		user.setUsername("贺旭东修改的");
		user.setRole("1");
		//添加
//		userdao.insert(user);
		//修改,需要加上id
		user.setId(202);
//		userdao.update(user);

//		userdao.delete("201");//删除
		
		User selectById = userdao.selectById(202);
		System.out.println(selectById);
		
	}
	
}
