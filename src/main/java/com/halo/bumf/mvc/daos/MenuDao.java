package com.halo.bumf.mvc.daos;

import java.util.List;

/**
 * 菜单的数据访问对象接口
 * 
 * @author zyl
 * @date 2016年7月6日 下午3:29:10
 * @version
 * @since
 */
public interface MenuDao<E> extends Dao<E> {

	/**
	 * 根据用户序号查询该用户有权限的菜单
	 * 
	 * @param mybatisId
	 *            SQL语句的ID
	 * @param userId
	 *            作为查询条件的用户序号
	 * @return 用户有权限的菜单列表
	 */
	public List<E> selectByUserId(String mybatisId, int userId);

}
