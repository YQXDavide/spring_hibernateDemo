package com.yang.dao;

import java.util.List;

import com.yang.domain.Customer;

/**ģ��־ò�ӿ�
 * @author yang
 *
 */
public interface InterCustomerDao {

	List<Customer> findAllCustomer();

	void saveCustomer(Customer customer);

	void deleteCustomer(Customer customer);
}
