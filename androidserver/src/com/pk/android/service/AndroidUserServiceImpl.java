package com.pk.android.service;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pk.android.dao.AndroidUserDAO;
import com.pk.android.domain.AndroidUserDomain;

@Service
public class AndroidUserServiceImpl implements AndroidUserService {

	@Autowired 
	private AndroidUserDAO androidUserDAO;

	@Override
	public AndroidUserDomain login(HttpServletRequest request) {
		//파라미터 읽기 
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
		//필요한 로직 수행 
		
		//DAO 파라미터 만들기 
		AndroidUserDomain androidUserDomain = new AndroidUserDomain();	
		androidUserDomain.setUserid(userid);
		androidUserDomain.setUserpw(userpw);
		
		//DAO 메소드 호출
		AndroidUserDomain user = androidUserDAO.login(androidUserDomain);
				
		//리턴할 결과 만들기 		
		return user;
	}	
}
