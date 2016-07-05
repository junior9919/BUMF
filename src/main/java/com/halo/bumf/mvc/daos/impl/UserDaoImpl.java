/**
 * 
 */
package com.halo.bumf.mvc.daos.impl;

import org.springframework.stereotype.Repository;

import com.halo.bumf.mvc.daos.UserDao;

/**
 * 
 * @author zyl
 * @date 2016年7月5日 下午7:39:38
 * @version
 * @since
 */
@Repository("userDao")
public class UserDaoImpl<User> extends DaoBasicSupport<User> implements UserDao<User> {

}
