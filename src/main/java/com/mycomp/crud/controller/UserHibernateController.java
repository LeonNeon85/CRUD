package com.mycomp.crud.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserHibernateController {
	
	public static UserBo getUserBo() {
		ApplicationContext appContext =
		    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		UserBo userBo = (UserBo)appContext.getBean("userBo");
		
		return userBo;
	}

}
