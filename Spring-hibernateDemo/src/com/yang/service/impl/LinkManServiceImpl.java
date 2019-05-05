package com.yang.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yang.dao.InterLinkManDao;
import com.yang.dao.impl.LinkManDaoImpl;
import com.yang.domain.LinkMan;
import com.yang.service.InterLinkManService;
import com.yang.utils.HibernateUtils;

public class LinkManServiceImpl implements InterLinkManService {
	private InterLinkManDao linkManDao = new LinkManDaoImpl();
	@Override
	public List<LinkMan> findAllLinkMan() {
		Session session = null;
		Transaction tr = null;
		try {
			session = HibernateUtils.getSession();
			tr = session.beginTransaction();
			List<LinkMan> linkMans = linkManDao.findAllLinkMan();
			tr.commit();
			return linkMans;
		}catch (Exception e) {
			tr.rollback();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void saveLinkMan(LinkMan linkman) {
			Session session = null;
			Transaction tr = null;
		try {
			session = HibernateUtils.getSession();
			tr = session.beginTransaction();
			linkManDao.saveLinkMan(linkman);
			tr.commit();
			
		}catch (Exception e) {
			tr.rollback();
			throw new RuntimeException(e);
		}
	}

	@Override
	public void deleteLinKman(LinkMan linkman) {
			Session session = null;
			Transaction tr = null;
		try {
			session = HibernateUtils.getSession();
			tr = session.beginTransaction();
			linkManDao.deleteLinKman(linkman);;
			tr.commit();
			
		} catch (Exception e) {
			tr.rollback();
			throw new RuntimeException(e);
		}
	}

}
