package com.yang.utils;

/**
 * 事务管理抽取
 * @author yang
 *
 */
public class TransactionManager {
	
	/**
	 * 开启事务
	 */
	public static void beginTransaction() {
		HibernateUtils.getSession().beginTransaction();
	}
	
	/**
	 * 提交事务
	 */
	public static void commitTransaction() {
		HibernateUtils.getSession().beginTransaction().commit();
	}
	public static void rollBackTransaction() {
		HibernateUtils.getSession().beginTransaction().rollback();
	}
}
