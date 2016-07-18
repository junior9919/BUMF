package com.halo.bumf.mvc.services;

import java.util.List;

import com.halo.bumf.mvc.beans.Role;

/**
 * 角色的业务逻辑对象
 *  
 * @author zyl
 * @date 2016年7月18日 下午8:17:21
 * @version 
 * @since
 */
public interface RoleService {

	public List<Role> selectAll();
	
}
