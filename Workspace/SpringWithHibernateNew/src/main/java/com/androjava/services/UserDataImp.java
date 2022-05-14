package com.androjava.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.androjava.models.UserData;

@Service
@Transactional
public class UserDataImp implements UserService
{

	@Autowired
	HibernateTemplate hibernatetemplate;
	
	@Override
	public void adduser(UserData data) 
	{
	 	
		System.out.println(hibernatetemplate);
		hibernatetemplate.save(data);
	
	}

}
