package com.yang.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.yang.service.InterCustomerService;
import com.yang.service.impl.CustomerServiceImpl;
import com.yang.utils.TransactionManager;

/**
 * 用于生成bean对象
 * @author yang
 *
 */
public class BeanFactory {
		public static InterCustomerService getCustomerService() {
			InterCustomerService cs = new CustomerServiceImpl();
			//使用动态代理增强
			InterCustomerService proxyCS = (InterCustomerService) Proxy.newProxyInstance(cs.getClass().getClassLoader(),cs.getClass().getInterfaces(),
					new InvocationHandler() {

						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							try{
								//1.开启事务
								TransactionManager.beginTransaction();
								//2.执行操作
								Object rtValue = method.invoke(cs, args);
								//3.提交事务
								TransactionManager.commitTransaction();
								//4.返回结果
								return rtValue;
							}catch(Exception e){
								//回滚事务
								TransactionManager.rollBackTransaction();
								//处理异常
								throw new RuntimeException(e);
							}finally {
								//关闭资源
							}
						}
				
			});
			return proxyCS;
		}
}
