package com.yang.utils;

/**
 * ��������ȡ
 * @author yang
 *
 */
public class TransactionManager {
	
	/**
	 * ��������
	 */
	public static void beginTransaction() {
		HibernateUtils.getSession().beginTransaction();
	}
	
	/**
	 * �ύ����
	 */
	public static void commitTransaction() {
		HibernateUtils.getSession().beginTransaction().commit();
	}
	public static void rollBackTransaction() {
		HibernateUtils.getSession().beginTransaction().rollback();
	}
}
