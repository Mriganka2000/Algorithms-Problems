package com.company.cabbookingapp.repository;

import com.company.cabbookingapp.dao.ICustomerDao;
import com.company.cabbookingapp.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("cDao")
public interface ICustomerRepository extends ICustomerDao, JpaRepository<Customer, Integer> {

}