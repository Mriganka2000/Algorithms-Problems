package com.example.stockmarketapp.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.stockmarketapp.dto.CompanyDetailsDTO;
import com.example.stockmarketapp.model.CompanyDetails;
import com.example.stockmarketapp.repository.CompanyInfoRepository;
import com.example.stockmarketapp.utils.StockMarketUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    private CompanyInfoRepository repository;

    public CompanyDetailsDTO saveCompanyDetails(CompanyDetailsDTO companyDetailsDTO) {

        CompanyDetails companyDetails = StockMarketUtility.convertToCompanyDetails(companyDetailsDTO);

        repository.saveAndFlush(companyDetails);

        return companyDetailsDTO;
    };
    //----------------------------------------------------------------------------
    public CompanyDetailsDTO deleteCompany(Long companyCode) {

        CompanyDetails companyDetails = repository.findById(companyCode).get();
        repository.deleteById(companyCode);

        return StockMarketUtility.convertToCompanyDetailsDTO(companyDetails);
    };

    //---------------------------------------------------------------------------
    public CompanyDetailsDTO getCompanyInfoById(Long companyCode) {

        CompanyDetails companyDetails = repository.findById(companyCode).get();

        return StockMarketUtility.convertToCompanyDetailsDTO(companyDetails);
    };

    //----------------------------------------------------------------------------
    public List<CompanyDetailsDTO> getAllCompanies() {

        List<CompanyDetails> list = repository.findAll();
        return StockMarketUtility.convertToCompanyDetailsDtoList(list);
    };
}