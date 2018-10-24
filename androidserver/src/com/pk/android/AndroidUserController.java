package com.pk.android;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pk.android.domain.AndroidUserDomain;
import com.pk.android.service.AndroidUserService;

@RestController
public class AndroidUserController {

	@Autowired 
	private AndroidUserService androidUserService;
	
	/*
	 //Map 형식 
	@RequestMapping(value="login", method=RequestMethod.GET)
	public Map<String, String> androidUserLogin(HttpServletRequest request){
		Map<String, String> map = new HashMap<>();
		
		//Service 메소드 호출 
		AndroidUserDomain androidUserDomain = androidUserService.login(request);
		
		//로그인 실패시 
		if(androidUserDomain == null) {
			map.put("userid", null);
		}
		
		//로그인 성공시 
		else {
			map.put("userid", androidUserDomain.getUserid());
			map.put("userpw", androidUserDomain.getUserpw());
		}
		return map;
	}
	*/
	
	
	//VO클래스로 받아오는 경우
	@RequestMapping(value="login", method=RequestMethod.GET)
	public AndroidUserDomain androiduserlogin (HttpServletRequest request, AndroidUserDomain androidUserDomain) {	
		
	AndroidUserDomain android1 = new AndroidUserDomain();
	AndroidUserDomain android = androidUserService.login(request);
	//로그인 성공시 
	//참조형은 처음 객체 생성 시 null이 들어가 있기 때문에 if(android == null){}을 만들 필요가 없다. 
			if(android != null) {
				android1.setUserid(androidUserDomain.getUserid());
				android1.setUserpw(androidUserDomain.getUserpw());
			}
					
			return android1;
	}	
}
