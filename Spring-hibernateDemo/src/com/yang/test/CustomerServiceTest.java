package com.yang.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.yang.domain.Customer;
import com.yang.domain.LinkMan;
import com.yang.factory.BeanFactory;
import com.yang.service.InterCustomerService;
import com.yang.service.InterLinkManService;
import com.yang.service.impl.CustomerServiceImpl;
import com.yang.service.impl.LinkManServiceImpl;

/**
 * 测试客户的业务层和持久层
 * @author yang
 *
 */
public class CustomerServiceTest {

	@Test
	public void testFindAllCustomer() {
		InterCustomerService customers = BeanFactory.getCustomerService();
		List<Customer> list = customers.findAllCustomer();
		for(Customer c: list) {
			System.out.println(c);
		}
	}
	@Test
	public void testSaveCustomer() {
		InterCustomerService customerService = new CustomerServiceImpl();
		Customer customer =new Customer();
		customer.setCust_name("customer-save1");
		customerService.saveCustomer(customer);
		
	}
	@Test
	public void testDeleteCustomer() {
		InterCustomerService customerService = new CustomerServiceImpl();
		Customer customer = new Customer();
		
	}
	@Test
	public void testFindAllLinkMan() {
		InterLinkManService linkManService = new LinkManServiceImpl();
		List<LinkMan> linkMans = linkManService.findAllLinkMan();
		for(LinkMan c: linkMans) {
			System.out.println(c);
		}
	}
	@Test
	public void testSaveLinkMan() {
		InterLinkManService linkManService = new LinkManServiceImpl();
		LinkMan linkman = new LinkMan();
		linkman.setLkmName("linkmanSave");
		linkManService.saveLinkMan(linkman);
		System.out.println(linkman);
	}
	@Test
	public void testDeleteLinkMan() {
		InterLinkManService linkManService = new LinkManServiceImpl();
		LinkMan linkman = new LinkMan();
		linkManService.deleteLinKman(linkman);
	}
}
