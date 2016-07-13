/**
 * 
 */
package com.halo.bumf.mvc.daos;

import java.util.List;

/**
 * 
 * @author zyl
 * @date 2016年7月13日 下午9:00:59
 * @version
 * @since
 */
public interface DaoPage<E> extends Dao<E> {

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
	public List<E> selectPage(String selectPageId, String selectCountId, E e);

}
