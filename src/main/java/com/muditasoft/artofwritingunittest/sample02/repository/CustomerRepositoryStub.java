package com.muditasoft.artofwritingunittest.sample02.repository;

import com.muditasoft.artofwritingunittest.sample02.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryStub extends CustomerRepository {

    private Map<Long, Customer> customerMap = new HashMap<>();

    @Override
    public void save(Customer customer) {
        customerMap.put(customer.getId(), customer);
    }

    @Override
    public void delete(Long customerId) {
        customerMap.remove(customerId);
    }

    @Override
    public Customer find(Long customerId) {
        return customerMap.get(customerId);
    }
}
