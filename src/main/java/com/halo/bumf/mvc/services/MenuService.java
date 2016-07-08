/**
 * 
 */
package com.halo.bumf.mvc.services;

/**
 * 菜单的业务逻辑对象接口
 * 
 * @author zyl
 * @date 2016年7月8日 下午8:45:36
 * @version
 * @since
 */
public interface MenuService {

	/**
	 * 根据用户序号查询该用户有权限的菜单
	 * 
	 * @param userId
	 *            用户序号
	 * @return 用户有权限的菜单列表
	 */
	public void getMenuByUserId(int userId);

}
