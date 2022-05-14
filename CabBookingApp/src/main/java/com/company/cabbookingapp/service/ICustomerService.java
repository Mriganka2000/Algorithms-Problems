package com.company.cabbookingapp.service;

import com.company.cabbookingapp.models.Customer;

import java.util.List;

public interface ICustomerService {
    Customer insertCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    Customer deleteCustomer(Customer customer);

    List<Customer> viewCustomers();

    Customer viewCustomer(int customerId);

    Customer validateCustomer(String username, String password);
}
