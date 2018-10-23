package com.jy.android;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jy.android.service.ItemService;
import com.jy.android.vo.ItemVO;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	//url은 모두 소문자로.
	@RequestMapping(value="itemall", method=RequestMethod.GET)
	public List<ItemVO> itemAll (HttpServletRequest request){
		
		return itemService.itemAll(request);		
	}
	
	@RequestMapping(value="itemselected", method=RequestMethod.GET)
	public ItemVO itemSelected (HttpServletRequest request){
		
		return itemService.itemSelected(request);	
	}	
}
