package com.pk.android.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pk.android.domain.AndroidUserDomain;

@Repository
public class AndroidUserDAO {
	@Autowired 
	private SqlSession sqlSession;
	
	//로그인 처리 메소드 
	public AndroidUserDomain login(AndroidUserDomain androidUserDomain) {
		return sqlSession.selectOne("androiduser.login", androidUserDomain);
	}
}
