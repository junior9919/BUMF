package com.halo.bumf.mvc.daos.impl;

import java.util.List;

import com.halo.bumf.mvc.beans.PageModule;
import com.halo.bumf.mvc.daos.DaoPage;

public class DaoPageSupport<E extends PageModule> extends DaoBasicSupport<E> implements DaoPage<E> {

	/**
	 * 分页查询列表的方法
	 * 
	 * @param selectPageId
	 *            分页查询的mapper的id
	 * @param selectCountId
	 *            查询总记录数的mapper的id
	 * @param e
	 *            含有查询条件的实体对象
	 * @return 当前页上的实体列表
	 */
	@Override
	public List<E> selectPage(String selectPageId, String selectCountId, E e) {
		List<E> es = selectList(selectPageId, e);
		int totalRow = Integer.parseInt(String.valueOf(getSqlSession().selectOne(selectCountId, e)));
		for (E element : es) {
			element.setCurrentPage(e.getCurrentPage());
			element.setTotalRow(totalRow);
		}

		return es;
	}

}
