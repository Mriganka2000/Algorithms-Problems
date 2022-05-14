package com.example.stockmarketapp.repository;

import com.example.stockmarketapp.model.StockPriceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPriceDetails, Long> {


}