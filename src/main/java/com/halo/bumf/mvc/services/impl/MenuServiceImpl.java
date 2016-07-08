/**
 * 
 */
package com.halo.bumf.mvc.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.halo.bumf.mvc.beans.Menu;
import com.halo.bumf.mvc.daos.MenuDao;
import com.halo.bumf.mvc.services.MenuService;
import com.halo.bumf.mvc.services.ServiceConstants;
import com.halo.spring.utils.SpringUtils;

/**
 * 
 * @author zyl
 * @date 2016年7月8日 下午8:49:09
 * @version
 * @since
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao<Menu> menuDao;

	/**
	 * 根据用户序号查询该用户有权限的菜单
	 * 
	 * @param userId
	 *            用户序号
	 * @return 用户有权限的菜单列表
	 */
	@Override
	public void getMenuByUserId(int userId) {
		List<Menu> menus = menuDao.selectList("com.halo.bumf.MenuMapper.selectByUserId", userId);
		SpringUtils.addIntoServletContext(ServiceConstants.SESSION_ID_MENU, menus);
	}

}
