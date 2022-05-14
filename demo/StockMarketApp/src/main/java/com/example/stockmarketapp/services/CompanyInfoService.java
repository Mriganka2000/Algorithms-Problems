package com.example.stockmarketapp.services;

import com.example.stockmarketapp.dto.CompanyDetailsDTO;

import java.util.List;


public interface CompanyInfoService {

    public CompanyDetailsDTO saveCompanyDetails(CompanyDetailsDTO companyDetailsDTO);
    public CompanyDetailsDTO deleteCompany(Long companyCode);
    //----------------------------------------------------------------------------
    public CompanyDetailsDTO getCompanyInfoById(Long companyCode);
    public List<CompanyDetailsDTO> getAllCompanies();
}