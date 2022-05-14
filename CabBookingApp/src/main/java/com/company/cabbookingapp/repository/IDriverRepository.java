package com.company.cabbookingapp.repository;

import com.company.cabbookingapp.dao.IDriverDao;
import com.company.cabbookingapp.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("dDao")
public interface IDriverRepository extends IDriverDao, JpaRepository<Driver, Integer> {

}