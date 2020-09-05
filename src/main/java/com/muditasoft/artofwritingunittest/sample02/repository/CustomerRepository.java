package com.muditasoft.artofwritingunittest.sample02.repository;

import com.muditasoft.artofwritingunittest.sample02.model.Customer;

public class CustomerRepository {

    public void save(Customer customer) {
        System.out.println(String.format("%s has been saved", customer));
    }

    public void delete(Long customerId) {
        System.out.println(String.format("CustomerId: %s has been deleted", customerId));
    }

    public Customer find(Long customerId) {
        System.out.println(String.format("%s has been found", customerId));
        return null;
    }
}
