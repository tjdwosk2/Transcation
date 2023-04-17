package com.ict.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.model.dao.DAO;
import com.ict.model.vo.VO;

@Service
public class MyServiceImpl implements MyService{
	@Autowired
	private DAO dao;
	public void setDao(DAO dao) {
		this.dao = dao;
	}

	@Override
	public int getInsert(VO vo) {
		return dao.getInsert(vo);
	}
}
