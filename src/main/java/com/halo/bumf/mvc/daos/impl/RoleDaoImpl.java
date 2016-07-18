/**
 * 
 */
package com.halo.bumf.mvc.daos.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.halo.bumf.mvc.beans.PageModule;
import com.halo.bumf.mvc.daos.RoleDao;

/**
 * 角色的数据访问对象
 * 
 * @author zyl
 * @date 2016年7月18日 下午8:14:08
 * @version
 * @since
 */
@Repository("roleDao")
public class RoleDaoImpl<E extends PageModule> extends DaoPageSupport<E> implements RoleDao<E> {

	@Override
	public List<E> selectAll(String mybatisId) {
		List<E> es = getSqlSession().selectList(mybatisId);
		return es;
	}

}
