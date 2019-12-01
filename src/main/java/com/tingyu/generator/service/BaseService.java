package com.tingyu.generator.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
	public void save(T t);

	public void delete(Serializable id);

	public void update(T t);

	public T get(Serializable id);

	public List<T> list();

}
