package com.tingyu.generator.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.tingyu.generator.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T> {

	
	@Override
	public void save(T t) {
	
	}

	@Override
	public void delete(Serializable id) {
		System.out.println("删除ID:"+id);
	}

	@Override
	public void update(T t) {
		
	}

	@Override
	public T get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
