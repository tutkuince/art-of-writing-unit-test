package com.muditasoft.artofwritingunittest.sample02.service;

import com.muditasoft.artofwritingunittest.sample02.model.Customer;
import com.muditasoft.artofwritingunittest.sample02.repository.CustomerRepository;

public class CustomerService {

    private CustomerRepository customerRepository;

    private InformationService informationService;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void setInformationService(InformationService informationService) {
        this.informationService = informationService;
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
        informationService.sendMailFromNewCustomer(customer);
    }


}
