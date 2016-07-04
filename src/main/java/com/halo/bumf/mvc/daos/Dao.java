/**
 * 
 */
package com.halo.bumf.mvc.daos;

import java.util.List;

/**
 * 所有用户Dao接口均继承自本接口，本接口中定义了Dao的所有常用操作
 * 
 * @author zyl
 * @date 2016年7月1日 下午8:09:41
 * @version
 * @since
 */
public interface Dao<E> {

	/**
	 * 查询单条记录，返回实体对象
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return 查询结果的实体对象
	 */
	public E selectOne(String mybatisId);

	/**
	 * 根据条件查询单条记录，返回实体对象
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括查询条件的实体对象
	 * @return 查询结果的实体对象
	 */
	public E selectOne(String mybatisId, E e);

	/**
	 * 查询多条记录，返回实体对象的集合
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return 查询结果的实体对象集合
	 */
	public List<E> selectList(String mybatisId);

	/**
	 * 查询多条记录，返回实体对象的集合
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括查询条件的实体对象
	 * @return 查询结果的实体对象集合
	 */
	public List<E> selectList(String mybatisId, E e);

	/**
	 * 查询满足条件的总记录数
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括查询条件的实体对象
	 * @return 满足条件的总记录数
	 */
	public int getCount(String mybatisId, E e);

	/**
	 * 插入记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return
	 */
	public int insert(String mybatisId);

	/**
	 * 插入记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括插入内容的实体对象
	 * @return
	 */
	public int insert(String mybatisId, E e);

	/**
	 * 更新记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return
	 */
	public int update(String mybatisId);

	/**
	 * 更新记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            包括更新内容的实体对象
	 * @return
	 */
	public int update(String mybatisId, E e);

	/**
	 * 删除记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @return
	 */
	public int delete(String mybatisId);

	/**
	 * 删除记录
	 * 
	 * @param mybatisId
	 *            Mybatis的mapper文件中的SQL语句的id
	 * @param e
	 *            要删除的实体对象
	 * @return
	 */
	public int delete(String mybatisId, E e);

}
