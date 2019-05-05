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
 * ģ��ҵ���ʵ����
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
//		��һ�γ�ȡ�򻯣�������Ŀ������ύ���ͻع���ȡ����д��һ�����������
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
//		�����γ�ȡֱ�Ӿͷ��ؽ��,ͨ����̬�����ҵ���ʵ���������ǿ
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
