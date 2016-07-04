package com.halo.bumf.mvc.daos.impl;

import java.util.List;

import com.halo.bumf.mvc.beans.PageModule;

public class DaoPageSupport<E extends PageModule> extends DaoBasicSupport<E> {

	public List<E> selectPage(String selectPageId, String selectCountId, E e) {
		List<E> es = selectList(selectPageId, e);
		int totalRow = Integer.parseInt(String.valueOf(getSqlSession().selectOne(selectCountId, e)));
		for (E element : es) {
			element.setCurrentPage(e.getCurrentPage());
			element.setFirstRow(e.getFirstRow());
			element.setTotalRow(totalRow);
		}

		return es;
	}

}
