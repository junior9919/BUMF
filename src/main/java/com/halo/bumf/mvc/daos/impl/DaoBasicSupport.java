/**
 * 
 */
package com.halo.bumf.mvc.daos.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.halo.bumf.mvc.daos.Dao;

/**
 * 所有用户Dao类均可继承本类，以获得基本CRUD方法的实现
 * 
 * @author zyl
 * @date 2016年7月1日 下午8:36:05
 * @version
 * @since
 */
public class DaoBasicSupport<E> extends SqlSessionDaoSupport implements Dao<E> {

	/**
	 * 查询单条记录，返回实体对象
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return 查询结果的实体对象
	 */
	@Override
	public E selectOne(String mybatisId) {
		return getSqlSession().selectOne(mybatisId);
	}

	/**
	 * 根据条件查询单条记录，返回实体对象
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括查询条件的实体对象
	 * @return 查询结果的实体对象
	 */
	@Override
	public E selectOne(String mybatisId, E e) {
		return getSqlSession().selectOne(mybatisId, e);
	}

	/**
	 * 查询多条记录，返回实体对象的集合
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return 查询结果的实体对象集合
	 */
	@Override
	public List<E> selectList(String mybatisId) {
		return getSqlSession().selectList(mybatisId);
	}

	/**
	 * 查询多条记录，返回实体对象的集合
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括查询条件的实体对象
	 * @return 查询结果的实体对象集合
	 */
	@Override
	public List<E> selectList(String mybatisId, E e) {
		return getSqlSession().selectList(mybatisId, e);
	}

	/**
	 * 查询满足条件的总记录数
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括查询条件的实体对象
	 * @return 满足条件的总记录数
	 */
	@Override
	public int getCount(String mybatisId, E e) {
		return Integer.parseInt(String.valueOf(getSqlSession().selectOne(mybatisId, e)));
	}

	/**
	 * 插入记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return
	 */
	@Override
	public int insert(String mybatisId) {
		return getSqlSession().insert(mybatisId);
	}

	/**
	 * 插入记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括插入内容的实体对象
	 * @return
	 */
	@Override
	public int insert(String mybatisId, E e) {
		return getSqlSession().insert(mybatisId, e);
	}

	/**
	 * 更新记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return
	 */
	@Override
	public int update(String mybatisId) {
		return getSqlSession().update(mybatisId);
	}

	/**
	 * 更新记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括更新内容的实体对象
	 * @return
	 */
	@Override
	public int update(String mybatisId, E e) {
		return getSqlSession().update(mybatisId, e);
	}

	/**
	 * 删除记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return
	 */
	@Override
	public int delete(String mybatisId) {
		return getSqlSession().delete(mybatisId);
	}

	/**
	 * 删除记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            要删除的实体对象
	 * @return
	 */
	@Override
	public int delete(String mybatisId, E e) {
		return getSqlSession().delete(mybatisId, e);
	}

}
