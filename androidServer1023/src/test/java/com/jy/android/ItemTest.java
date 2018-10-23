package com.jy.android;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jy.android.dao.ItemDAO;
import com.jy.android.service.ItemServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class ItemTest {
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired 
	private ItemDAO dao;
	private ItemServiceImpl impl;
	
	@Test
	public void connectTest() {
		//System.out.println(sqlSession);
		//System.out.println(sqlSession.selectList("item.itemAll"));
		//System.out.println(sqlSession.selectOne("item.itemSelected"));
		//System.out.println(sqlSession.selectOne("item.itemSelected",1)+"");
		System.out.println(impl.itemAll(null));
		System.out.println(impl.itemSelected(null));
		
	}
}
