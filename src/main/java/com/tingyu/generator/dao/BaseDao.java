package com.tingyu.generator.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 1、抽取通用Dao
 * 2、T 泛型代表实体类
 * @author Essionshy
 *
 */
public interface BaseDao<T> {
	
	public void save(T t);
	
	public void delete(Serializable id);
	
	public void update(T t);
	
	public T get(Serializable id);
	
	public List<T> list();
	
	
	
}

