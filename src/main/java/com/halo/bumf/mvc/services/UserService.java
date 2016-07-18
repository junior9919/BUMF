/**
 * 
 */
package com.halo.bumf.mvc.services;

import java.util.List;

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

	/**
	 * 分页查询用户信息
	 * 
	 * @param user
	 *            含有查询条件的用户信息
	 * @return 当前页上的用户信息列表
	 */
	public List<User> selectPage(User user);

	/**
	 * 根据序号精确查询用户
	 * 
	 * @param id
	 *            序号
	 * @return 唯一的用户对象
	 */
	public User selectUserById(int id);

}
