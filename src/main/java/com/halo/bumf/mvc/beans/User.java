/**
 * 
 */
package com.halo.bumf.mvc.beans;

/**
 * 
 * @author zyl
 * @date 2016年6月27日 下午8:35:22
 * @version
 * @since
 */
public class User extends PageModule {

	private int id;

	private String userName;

	private String sex;

	private String userAccount;

	private String passwd;

	/**
	 * @return int 用户序号
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param int
	 *            id用户序号
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return String 用户名称，用户的真实姓名或昵称
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param String
	 *            userName 用户名称，用户的真实姓名或昵称
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return String 性别，0：女；1：男；
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param String
	 *            sex 性别，0：女；1：男；
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return String 用户帐号，用户登录系统的帐号
	 */
	public String getUserAccount() {
		return userAccount;
	}

	/**
	 * @param String
	 *            userAccount 用户帐号，用户登录系统的帐号
	 */
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	/**
	 * @return String 用户登录系统的密码
	 */
	public String getPasswd() {
		return passwd;
	}

	/**
	 * @param String
	 *            passwd 用户登录系统的密码
	 */
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
