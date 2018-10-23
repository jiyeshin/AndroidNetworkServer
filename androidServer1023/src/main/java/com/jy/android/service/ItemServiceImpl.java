package com.jy.android.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.android.dao.ItemDAO;
import com.jy.android.vo.ItemVO;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired 
	private ItemDAO itemDAO;
	
	@Override
	public List<ItemVO> itemAll(HttpServletRequest request) {		
		return itemDAO.itemAll();
	}

	@Override
	public ItemVO itemSelected(HttpServletRequest request) {
		//파라미터를 가져오기 
		String itemid = request.getParameter("itemid");
		
		//파라미터를 정수로 변환해서 dao 메소드에 전달. 
		//그래서 dao 만들 때 정수도 String 으로 만드는게 좋은 이유. 
		//HttpServletRequest는 String만 돌려줌. 
		return itemDAO.itemSelected(Integer.parseInt(itemid));
	}
}
