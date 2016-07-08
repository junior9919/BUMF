package com.halo.bumf.mvc.daos.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.halo.bumf.mvc.beans.PageModule;
import com.halo.bumf.mvc.daos.MenuDao;

/**
 * 
 * 菜单的数据访问对象接口实现
 * 
 * @author zyl
 * @date 2016年7月6日 下午3:34:41
 * @version
 * @since
 */
@Repository("menuDao")
public class MenuDaoImpl<E extends PageModule> extends DaoPageSupport<E> implements MenuDao<E> {

	@Override
	public List<E> selectList(String mybatisId, int userId) {
		return getSqlSession().selectList(mybatisId, userId);
	}

}
