package com.tingyu.generator.service.impl;

import java.io.Serializable;
import java.util.List;

import com.tingyu.generator.dao.BaseDao;
import com.tingyu.generator.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {

	private BaseDao<T> baseDao;

	public void setBaseDao(BaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void save(T t) {
		baseDao.save(t);
	}

	@Override
	public void delete(Serializable id) {
		baseDao.delete(id);
	}

	@Override
	public void update(T t) {
		baseDao.update(t);
	}

	@Override
	public T get(Serializable id) {
		return baseDao.get(id);
	}

	@Override
	public List<T> list() {
		return baseDao.list();
	}

}
