package com.example.stockmarketapp.controller;

import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import com.example.stockmarketapp.dto.InvalidStockExceptionResponse;
import com.example.stockmarketapp.dto.StockPriceDetailsDTO;
import com.example.stockmarketapp.dto.StockPriceIndexDTO;
import com.example.stockmarketapp.exception.InvalidStockException;
import com.example.stockmarketapp.exception.StockNotFoundException;
import com.example.stockmarketapp.services.StockMarketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/stock")
public class StockPriceController {

    @Autowired
    private StockMarketService stockMarketService;

    //-------------------------------------------------------------------------------------------------------------------------------
    @PostMapping(value="/addStock")																						// 2. WORKING
    public ResponseEntity<StockPriceDetailsDTO> addStockDetails(@Valid @RequestBody StockPriceDetailsDTO stockPriceDetailsDTO, BindingResult bindingResult) throws InvalidStockException {
        return null;
    }
    //-------------------------------------------------------------------------------------------------------------------------------
    @DeleteMapping(value = "/deleteStock/{companyCode}")																// 3. WORKING
    public ResponseEntity<List<StockPriceDetailsDTO>> deleteStockByCompanyCode(@PathVariable Long companyCode) {
        return null;

    }
    //-------------------------------------------------------------------------------------------------------------------------------
    @GetMapping(value = "/getStockByCompanyCode/{companyCode}")															// 4. WORKING
    public ResponseEntity<List<StockPriceDetailsDTO>> getStockByCompanyCode(@PathVariable Long companyCode) {
        return null;
    }
    //-------------------------------------------------------------------------------------------------------------------------------
    @GetMapping(value = "/getStockPriceIndex/{companyCode}/{startDate}/{endDate}")										// 5. WORKING
    public ResponseEntity<StockPriceIndexDTO> displayStockPriceIndex(@PathVariable Long companyCode, @PathVariable Date startDate, @PathVariable Date endDate) {

        return null;
    }

    //===============================================================================================================================
    //			UTITLITY EXCEPTION HANDLERS - 2
    //===============================================================================================================================
    @ExceptionHandler(InvalidStockException.class)
    public ResponseEntity<InvalidStockExceptionResponse> companyHandler(InvalidStockException ex) {
        InvalidStockExceptionResponse resp = new InvalidStockExceptionResponse(ex.getMessage(),System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value());
        ResponseEntity<InvalidStockExceptionResponse> response =	new ResponseEntity<InvalidStockExceptionResponse>(resp, HttpStatus.BAD_REQUEST);
        return response;
    }
    //------------------------------------------------------------------------------------------------
    @ExceptionHandler(StockNotFoundException.class)
    public ResponseEntity<InvalidStockExceptionResponse> companyHandler(StockNotFoundException ex) {
        InvalidStockExceptionResponse resp = new InvalidStockExceptionResponse(ex.getMessage(),System.currentTimeMillis(), HttpStatus.NOT_FOUND.value());
        ResponseEntity<InvalidStockExceptionResponse> response = new ResponseEntity<InvalidStockExceptionResponse>(resp, HttpStatus.NOT_FOUND);
        return response;
    }
}
