package com.yang.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yang.dao.InterCustomerDao;
import com.yang.dao.impl.CustomerDaoImpl;
import com.yang.domain.Customer;
import com.yang.service.InterCustomerService;
import com.yang.utils.HibernateUtils;
import com.yang.utils.TransactionManager;

/**
 * 模拟业务层实现类
 * @author yang
 *
 */
public class CustomerServiceImpl implements InterCustomerService {
	private InterCustomerDao customerDao = new CustomerDaoImpl();

	@Override
	public List<Customer> findAllCustomer() {
//		Session session=null;
//		Transaction tr = null;
//		try {
//			session = HibernateUtils.getSession();
//			tr = session.beginTransaction();
//			List<Customer> customers = customerDao.findAllCustomer();
//			tr.commit();
//			return customers;
//		}catch(Exception e) {
//			tr.commit();
//			throw new RuntimeException(e);
//		}
//		第一次抽取简化，把事务的开启，提交，和回滚抽取出来写成一个事务管理类
//		
//		try {
//			TransactionManager.beginTransaction();
//			List<Customer> customers = customerDao.findAllCustomer();
//			TransactionManager.commitTransaction();
//			return customers;
//		}catch(Exception e){
//			TransactionManager.rollBackTransaction();
//			throw new RuntimeException(e);
//		}
//		第三次抽取直接就返回结果,通过动态代理对业务层实现类进行增强
		return customerDao.findAllCustomer();
	}

	@Override
	public void saveCustomer(Customer customer) {
		
		
//		try {
//			
//			TransactionManager.beginTransaction();
//			 customerDao.saveCustomer(customer);
//			 TransactionManager.commitTransaction();
//			
//		}catch (Exception e) {
//			TransactionManager.rollBackTransaction();
//			throw new RuntimeException(e);
//		}
		
		customerDao.saveCustomer(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		
//		
//		try {
//			
//			TransactionManager.beginTransaction();
//			customerDao.deleteCustomer(customer);
//			TransactionManager.commitTransaction();
//		} catch (Exception e) {
//			TransactionManager.rollBackTransaction();
//			throw new RuntimeException(e);
//		}
		customerDao.deleteCustomer(customer);
	}
}
