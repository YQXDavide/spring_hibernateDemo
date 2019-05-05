package com.yang.dao.impl;

import java.util.List;

import com.yang.dao.InterLinkManDao;
import com.yang.domain.LinkMan;
import com.yang.utils.HibernateUtils;

public class LinkManDaoImpl implements InterLinkManDao {

	@Override
	public List<LinkMan> findAllLinkMan() {
		
		return HibernateUtils.getSession().createQuery("from LinkMan").list();
	}

	@Override
	public void saveLinkMan(LinkMan linkman) {
			HibernateUtils.getSession().save(linkman);
		
	}

	@Override
	public void deleteLinKman(LinkMan linkman) {
			HibernateUtils.getSession().delete(linkman);
	}

}
