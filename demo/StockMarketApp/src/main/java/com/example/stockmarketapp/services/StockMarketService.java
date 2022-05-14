package com.example.stockmarketapp.services;

import com.example.stockmarketapp.dto.StockPriceDetailsDTO;
import com.example.stockmarketapp.dto.StockPriceIndexDTO;

import java.time.LocalDate;
import java.util.List;

public interface StockMarketService {
    public StockPriceDetailsDTO saveStockPriceDetails(StockPriceDetailsDTO stockPriceDetailsDTO);
    public List<StockPriceDetailsDTO> deleteStock(Long companyCode);
    //----------------------------------------------------------------------------------------
    public List<StockPriceDetailsDTO> getStockByCode(Long companyCode);
    //----------------------------------------------------------------------------------------
    public StockPriceIndexDTO getStockPriceIndex(Long companyCode, LocalDate startDate, LocalDate endDate);
}
