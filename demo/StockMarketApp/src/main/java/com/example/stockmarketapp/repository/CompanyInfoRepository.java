package com.example.stockmarketapp.repository;

import com.example.stockmarketapp.model.CompanyDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInfoRepository extends JpaRepository<CompanyDetails, Long>
{

}