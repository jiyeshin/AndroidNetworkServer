package com.jy.android.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jy.android.vo.ItemVO;

@Repository
public class ItemDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	//테이블의 전체데이터를 가져오는 메소드 
	public List<ItemVO> itemAll (){
		return sqlSession.selectList("item.itemAll");
	}
	
	//itemid를 가지고 하나의 데이터를 가져오는 메소드 
	public ItemVO itemSelected(int itemid) {
		return sqlSession.selectOne("item.itemSelected", itemid);
	}
}
