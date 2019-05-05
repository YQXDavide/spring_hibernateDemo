package com.yang.dao;

import java.util.List;

import com.yang.domain.LinkMan;

public interface InterLinkManDao {

	List<LinkMan> findAllLinkMan();
	
	
	void saveLinkMan(LinkMan linkman);
	
	
	void deleteLinKman(LinkMan linkman);
}
