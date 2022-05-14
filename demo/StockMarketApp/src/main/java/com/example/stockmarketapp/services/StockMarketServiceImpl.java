package com.example.stockmarketapp.services;

import javax.transaction.Transactional;

import com.example.stockmarketapp.dto.StockPriceDetailsDTO;
import com.example.stockmarketapp.dto.StockPriceIndexDTO;
import com.example.stockmarketapp.model.StockPriceDetails;
import com.example.stockmarketapp.repository.CompanyInfoRepository;
import com.example.stockmarketapp.repository.StockPriceRepository;
import com.example.stockmarketapp.utils.StockMarketUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StockMarketServiceImpl implements StockMarketService {

    @Autowired
    private StockPriceRepository stockRepository;

    @Autowired
    private CompanyInfoRepository companyRepository;

    //----------------------------------------------------------------------------
    public StockPriceDetailsDTO saveStockPriceDetails(StockPriceDetailsDTO stockPriceDetailsDTO) {

        StockPriceDetails stockPriceDetails = StockMarketUtility.convertToStockPriceDetails(stockPriceDetailsDTO);

        stockRepository.save(stockPriceDetails);

        return stockPriceDetailsDTO;
    };
    //----------------------------------------------------------------------------
    public List<StockPriceDetailsDTO> deleteStock(Long companyCode) {

        return null;
    };
    //----------------------------------------------------------------------------
    public List<StockPriceDetailsDTO> getStockByCode(Long companyCode){

        List<StockPriceDetails> list = stockRepository.findAll();

        List<StockPriceDetails> filter = new ArrayList<>();

        for (StockPriceDetails stockPriceDetails : list) {
            if(stockPriceDetails.getCompanyCode() == companyCode) {
                filter.add(stockPriceDetails);
            }
        }

        return StockMarketUtility.convertToStockPriceDetailsDtoList(filter);
    };
    //----------------------------------------------------------------------------
    public StockPriceDetailsDTO getStockPriceDetailsDTO(StockPriceDetails stockDetails)	{
        return new StockPriceDetailsDTO(stockDetails.getId(), stockDetails.getCompanyCode(), stockDetails.getCurrentStockPrice(), stockDetails.getStockPriceDate(), stockDetails.getStockPriceTime());
    };
    //----------------------------------------------------------------------------
    public Double getMaxStockPrice(Long companyCode, LocalDate startDate, LocalDate endDate) {
        return null;
    };
    public Double getAvgStockPrice(Long companyCode, LocalDate startDate, LocalDate endDate) {
        return null;
    };
    public Double getMinStockPrice(Long companyCode, LocalDate startDate, LocalDate endDate) {
        return null;
    };

    public StockPriceIndexDTO getStockPriceIndex(Long companyCode, LocalDate startDate, LocalDate endDate) {

        return null;
    };
}