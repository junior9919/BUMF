/**
 * 
 */
package com.halo.bumf.mvc.beans;

/**
 * 角色数据对象
 * 
 * @author zyl
 * @date 2016年7月18日 下午8:06:02
 * @version
 * @since
 */
public class Role extends PageModule {

	private int id;

	private String roleName;

	private String remark;

	/**
	 * @return int 序号
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param int
	 *            id 序号
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return String 角色名称
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param String
	 *            roleName 角色名称
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return String 备注
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param String
	 *            remark 备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
