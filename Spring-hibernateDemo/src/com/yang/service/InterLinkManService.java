package com.yang.service;

import java.util.List;

import com.yang.domain.LinkMan;

public interface InterLinkManService {
	/**
	 * ��ѯ������ϵ��
	 * @return
	 */
	List<LinkMan> findAllLinkMan();
	
	/**
	 * ����һ����ϵ��
	 * @param linkman
	 */
	void saveLinkMan(LinkMan linkman);
	
	/**
	 * ɾ��һ����ϵ��
	 * @param linkman
	 */
	void deleteLinKman(LinkMan linkman);
}
