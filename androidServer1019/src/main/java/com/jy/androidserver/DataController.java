package com.jy.androidserver;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//html 대신에 csv 나 json을 리턴하는 컨트롤러를 만들어주는 어노테이션.
//임포트 안되면 pom.xml에서 스프링 버전을 4.1.0이상으로 바꿔보기 
@RestController
public class DataController {
	
	@RequestMapping(value = "jbj95.csv", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
			
		return "kenta, sanggyun, guntae, yamaguchi";
	}	
}
