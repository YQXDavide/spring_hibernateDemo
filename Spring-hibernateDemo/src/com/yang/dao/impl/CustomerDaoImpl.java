package com.yang.dao.impl;

import java.util.List;

import com.yang.dao.InterCustomerDao;
import com.yang.domain.Customer;
import com.yang.utils.HibernateUtils;

/**
 * 模拟持久层实现类
 * @author yang
 *
 */
public class CustomerDaoImpl implements InterCustomerDao {

	@Override
	public List<Customer> findAllCustomer() {
		
		return HibernateUtils.getSession().createQuery("from Customer").list();
	}

	@Override
	public void saveCustomer(Customer customer) {
		HibernateUtils.getSession().save(customer);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		HibernateUtils.getSession().delete(customer);
	}

}
