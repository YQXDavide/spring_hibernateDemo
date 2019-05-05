package com.yang.service;

import java.util.List;

import com.yang.domain.LinkMan;

public interface InterLinkManService {
	/**
	 * 查询所有联系人
	 * @return
	 */
	List<LinkMan> findAllLinkMan();
	
	/**
	 * 保存一个联系人
	 * @param linkman
	 */
	void saveLinkMan(LinkMan linkman);
	
	/**
	 * 删除一个联系人
	 * @param linkman
	 */
	void deleteLinKman(LinkMan linkman);
}
