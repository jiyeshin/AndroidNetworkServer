package com.jy.android.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import com.jy.android.vo.ItemVO;

public interface ItemService {

	//리턴 타입은 보통의 경우는 dao 메소드와 일치 
	//매개변수는 제일 쉽게 하는 방법은 HttpServletReqeust 
	//파일이 있을 때는 앞에 Multipart 
	public List <ItemVO> itemAll(HttpServletRequest request);
	public ItemVO itemSelected(HttpServletRequest request);
}
