package com.mycomp.crud.model;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mycomp.crud.model.User;

public class UserDaoImpl  implements UserDao {
	
	private SessionFactory sessionFactory;
		
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void create(User user) {		
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		 //do some work	 
	     session.save(user);
	     tx.commit();
	     
	     session.close();
		 
	     //try {
		 //    tx = session.beginTransaction();
		 //    
		 //    //do some work	 
		 //    session.save(user);
		     
		 //    tx.commit();
		// }
		//catch (Exception e) {
		//     if (tx!=null) tx.rollback();		    
		// }
		// finally {
		//	 session.close();			
		// }
	}

	public void update(Integer id, User newUser) {
		Session session = sessionFactory.openSession();			
		Transaction tx = session.beginTransaction();
		
		User updatingUser = session.get(User.class, id);
		
		updatingUser.setName(newUser.getName());
		updatingUser.setAge(newUser.getAge());
		updatingUser.setAdmin(newUser.getAdmin());
		//updatingUser.setCreatedDate(newUser.getCreatedDate());
		
		//do some work	
		session.update(updatingUser);	
		
		tx.commit(); 
		session.close();	
	}

	public void delete(User user) {
	
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
						
		 //do some work	 
		User deletingUser = session.get(User.class, user.getId());
		session.delete(deletingUser);
						
	     tx.commit();	     
	     session.close();
			
	}

	@SuppressWarnings("deprecation")
	public List<User> showAllUsers() {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		 //do some work	 
	     Query query = session.createQuery("FROM User");	     
	     List<User> users = query.list(); 
	     tx.commit();	     
	     session.close();
	     return users;		
	}

	@SuppressWarnings("rawtypes")
	public List<User> searhUser(User user) {
			
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		 //do some work	 
		String strQuery = String.format("SELECT * FROM Persons WHERE name = '%s' AND age = %d ", user.getName(), user.getAge());
		
		SQLQuery query = session.createSQLQuery(strQuery);
		query.addEntity(User.class);
		
	    List<User> users = query.list();
	    
	   // Query query = session.createQuery(sb.toString()); "FROM Developer D WHERE D.id = 1");
	     
	    tx.commit();	     
	    session.close();	    
		return users;		
	}

	
	
	
	
}
