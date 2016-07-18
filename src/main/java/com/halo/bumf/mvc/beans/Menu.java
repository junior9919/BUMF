/**
 * 
 */
package com.halo.bumf.mvc.beans;

/**
 * 菜单数据对象
 * 
 * @author zyl
 * @date 2016年7月6日 下午3:21:49
 * @version
 * @since
 */
public class Menu extends PageModule {

	private int id;

	private String menuName;

	private String menuType;

	private String pageUrl;

	private String orderNum;

	/**
	 * @return int 菜单序号
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param int
	 *            id 菜单序号
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return String 菜单名称
	 */
	public String getMenuName() {
		return menuName;
	}

	/**
	 * @param String
	 *            menuName 菜单名称
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/**
	 * @return String 菜单类型，1：模块；2：页面；3：按钮；
	 */
	public String getMenuType() {
		return menuType;
	}

	/**
	 * @param String
	 *            menuType 菜单类型，1：模块；2：页面；3：按钮；
	 */
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	/**
	 * @return String 页面地址
	 */
	public String getPageUrl() {
		return pageUrl;
	}

	/**
	 * @param String
	 *            pageUrl 页面地址
	 */
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	/**
	 * @return String 排序编号
	 */
	public String getOrderNum() {
		return orderNum;
	}

	/**
	 * @param String
	 *            orderNum 排序编号
	 */
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

}
