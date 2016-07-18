/**
 * 
 */
package com.halo.bumf.mvc.daos;

import java.util.List;

/**
 * 
 * @author zyl
 * @date 2016年7月18日 下午8:11:04
 * @version
 * @since
 */
public interface RoleDao<E> extends DaoPage<E> {

	/**
	 * 查询所有的角色列表
	 * 
	 * @return 角色列表
	 */
	public List<E> selectAll(String mybatisId);

}
