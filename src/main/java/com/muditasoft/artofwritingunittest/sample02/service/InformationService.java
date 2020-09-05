package com.muditasoft.artofwritingunittest.sample02.service;

import com.muditasoft.artofwritingunittest.sample02.model.Customer;

public class InformationService {

    public void sendMailFromNewCustomer(Customer customer) {
        System.out.println(String.format("Mail has been sent. New %s is saved", customer));
    }
}
