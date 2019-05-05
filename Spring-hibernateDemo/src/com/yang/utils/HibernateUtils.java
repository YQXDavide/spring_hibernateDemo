package com.yang.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * hibernate的工具类
 * @author yang
 *
 */
public class HibernateUtils {
	private static SessionFactory factory=null;
	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}
	public static Session getSession() {
		return factory.openSession();
	}
}
