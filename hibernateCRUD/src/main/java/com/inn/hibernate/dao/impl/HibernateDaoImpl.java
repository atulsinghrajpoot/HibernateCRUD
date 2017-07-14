package com.inn.hibernate.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.inn.hibernate.dao.IHibernateDao;
import com.inn.hibernate.util.HibernateUtility;

public class HibernateDaoImpl<Entity> implements IHibernateDao<Entity> {

	Class<Entity> type;
	
	public HibernateDaoImpl(Class<Entity> type){
		this.type = type;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Entity save(Entity entity) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		entity = (Entity) session.merge(entity);
		
		session.getTransaction().commit();
		session.close();
		
		return entity;
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Entity update(Entity entity) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		entity = (Entity) session.merge(entity);
		
		session.getTransaction().commit();
		session.close();
		
		return entity;
		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public Entity findByPrimaryKey(int  id) {
		SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Entity entity = (Entity) session.get(type, id);
//		Query query =session.createQuery("from Student where id="+id); 
//		Entity entity = (Entity) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		
		return entity;
		
	}

}
