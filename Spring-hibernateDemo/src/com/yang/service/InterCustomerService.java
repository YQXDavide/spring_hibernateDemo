package com.yang.service;

import java.util.List;

import com.yang.domain.Customer;

/**
 * 模拟业务层接口
 * @author yang
 *
 */
public interface InterCustomerService {
	
	/**
	 * 查找所有客户
	 * @return
	 */
	List<Customer> findAllCustomer();
	
	/**
	 * 存储客户
	 * @param customer
	 * @return
	 */
	void saveCustomer(Customer customer);
	
	/**删除客户
	 * @param customer
	 */
	void deleteCustomer(Customer customer);
}
