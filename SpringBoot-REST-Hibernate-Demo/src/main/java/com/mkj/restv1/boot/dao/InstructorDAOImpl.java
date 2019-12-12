package com.mkj.restv1.boot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mkj.restv1.boot.entity.Instructor;

@Repository
public class InstructorDAOImpl implements InstructorDAO {

	@Autowired
	EntityManager entityManager;
	
	public InstructorDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Instructor> getAllInstructors() {

		Session session = entityManager.unwrap(Session.class);
		Query<Instructor> query = session.createQuery("from Instructor",Instructor.class);
		return query.getResultList();
	}

}
