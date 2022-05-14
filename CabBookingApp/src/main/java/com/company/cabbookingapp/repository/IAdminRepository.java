package com.company.cabbookingapp.repository;

import com.company.cabbookingapp.dao.IAdminDao;
import com.company.cabbookingapp.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepository extends IAdminDao, JpaRepository<Admin, Integer> {

}