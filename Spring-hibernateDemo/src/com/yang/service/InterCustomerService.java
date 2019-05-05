package com.yang.service;

import java.util.List;

import com.yang.domain.Customer;

/**
 * ģ��ҵ���ӿ�
 * @author yang
 *
 */
public interface InterCustomerService {
	
	/**
	 * �������пͻ�
	 * @return
	 */
	List<Customer> findAllCustomer();
	
	/**
	 * �洢�ͻ�
	 * @param customer
	 * @return
	 */
	void saveCustomer(Customer customer);
	
	/**ɾ���ͻ�
	 * @param customer
	 */
	void deleteCustomer(Customer customer);
}
