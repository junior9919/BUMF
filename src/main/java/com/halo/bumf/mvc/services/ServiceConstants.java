/**
 * 
 */
package com.halo.bumf.mvc.services;

/**
 * Service层中用到的常量定义
 * 
 * @author zyl
 * @date 2016年7月5日 下午7:58:35
 * @version
 * @since
 */
public class ServiceConstants {

	/**
	 * 在Session中保存的已登录用户的ID
	 */
	public static final String SESSION_ID_USER = "logon_user";

	/**
	 * 在Session中保存的当前用户有权限的菜单的ID
	 */
	public static final String SESSION_ID_MENU = "user_menu";

	/**
	 * 用户登录成功时的返回值
	 */
	public static final String RETURN_LOGIN_GRANTED = "ok";

}
