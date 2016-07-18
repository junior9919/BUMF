/**
 * 
 */
package com.halo.bumf.mvc.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.halo.bumf.mvc.beans.Role;
import com.halo.bumf.mvc.daos.RoleDao;
import com.halo.bumf.mvc.services.RoleService;

/**
 * 角色的业务逻辑对象实现类
 * 
 * @author zyl
 * @date 2016年7月18日 下午8:19:00
 * @version
 * @since
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao<Role> roleDao;

	@Override
	public List<Role> selectAll() {
		List<Role> roles = roleDao.selectAll("com.halo.bumf.RoleMapper.selectAll");
		return roles;
	}

}
