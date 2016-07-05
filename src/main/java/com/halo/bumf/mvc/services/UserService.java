/**
 * 
 */
package com.halo.bumf.mvc.services;

import com.halo.bumf.mvc.beans.User;

/**
 * 用户的业务逻辑对象接口
 * 
 * @author zyl
 * @date 2016年7月5日 下午7:41:29
 * @version
 * @since
 */
public interface UserService {

	/**
	 * 用户登录认证方法
	 * 
	 * @param user
	 *            含有用户帐号和密码的用户对象
	 * @return 认证通过返回字符串“ok”，否则返回认证失败原因
	 */
	public String login(User user);

}
