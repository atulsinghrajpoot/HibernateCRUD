package com.inn.hibernate.dao;

public interface IHibernateDao<Entity> {
	
	public Entity save(Entity entity);

	public Entity update(Entity entity);

	public Entity findByPrimaryKey(int id);

}
