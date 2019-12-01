package com.tingyu.generator.test;

import org.junit.Before;
import org.junit.Test;

import com.tingyu.generator.dao.UserDao;
import com.tingyu.generator.dao.impl.UserDaoImpl;

public class UserDaoTest {

	UserDao userDao=null;
	
	@Before
	public void init() {
		userDao=(UserDao) new UserDaoImpl();
	}
	@Test
	public void testDelete() {
		System.out.println("============测试BaseDao========");
		
		Integer uuid=12121;
		
		userDao.delete(uuid);
		
		Long id=12121212121212L;		
		
		userDao.delete(id);
		
		Byte byte_id=1;
		userDao.delete(byte_id);
		
		
		
		
	}
}
