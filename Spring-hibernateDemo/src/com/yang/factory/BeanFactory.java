package com.yang.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.yang.service.InterCustomerService;
import com.yang.service.impl.CustomerServiceImpl;
import com.yang.utils.TransactionManager;

/**
 * ��������bean����
 * @author yang
 *
 */
public class BeanFactory {
		public static InterCustomerService getCustomerService() {
			InterCustomerService cs = new CustomerServiceImpl();
			//ʹ�ö�̬������ǿ
			InterCustomerService proxyCS = (InterCustomerService) Proxy.newProxyInstance(cs.getClass().getClassLoader(),cs.getClass().getInterfaces(),
					new InvocationHandler() {

						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							try{
								//1.��������
								TransactionManager.beginTransaction();
								//2.ִ�в���
								Object rtValue = method.invoke(cs, args);
								//3.�ύ����
								TransactionManager.commitTransaction();
								//4.���ؽ��
								return rtValue;
							}catch(Exception e){
								//�ع�����
								TransactionManager.rollBackTransaction();
								//�����쳣
								throw new RuntimeException(e);
							}finally {
								//�ر���Դ
							}
						}
				
			});
			return proxyCS;
		}
}
