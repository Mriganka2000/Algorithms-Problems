package com.androjava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class UserData 
{
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;

private String name,email,mobile,pass;

	
}
