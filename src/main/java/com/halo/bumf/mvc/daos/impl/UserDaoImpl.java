package com.halo.bumf.mvc.daos.impl;

import org.springframework.stereotype.Repository;
import com.halo.bumf.mvc.beans.PageModule;
import com.halo.bumf.mvc.daos.UserDao;

/**
 * 用户的数据对象接口实现
 * 
 * @author zyl
 * @date 2016年7月6日 下午3:58:24
 * @version
 * @since
 */
@Repository("userDao")
public class UserDaoImpl<E extends PageModule> extends DaoPageSupport<E> implements UserDao<E> {

}
