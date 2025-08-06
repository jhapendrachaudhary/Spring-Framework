package com.mypackage.springorm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mypackage.springorm.model.Product;

public class ProductDaoImpl {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public int createProduct(Product p) {
		Integer r = (Integer) this.hibernateTemplate.save(p);
		return r;
	}

}
