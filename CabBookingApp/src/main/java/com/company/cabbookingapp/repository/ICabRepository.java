package com.company.cabbookingapp.repository;

import com.company.cabbookingapp.dao.ICabDao;
import com.company.cabbookingapp.models.Cab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICabRepository extends ICabDao, JpaRepository<Cab, Integer> {

}
