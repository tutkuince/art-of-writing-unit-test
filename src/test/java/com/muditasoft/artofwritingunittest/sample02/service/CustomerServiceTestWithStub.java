package com.muditasoft.artofwritingunittest.sample02.service;

import com.muditasoft.artofwritingunittest.sample02.model.Customer;
import com.muditasoft.artofwritingunittest.sample02.repository.CustomerRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


public class CustomerServiceTestWithStub {

    private CustomerService customerService;
    private CustomerRepositoryStub customerRepositoryStub;
    private InformationService informationService;


    @BeforeEach
    void setUp() {
        customerService = new CustomerService();
        customerRepositoryStub = new CustomerRepositoryStub();
        informationService = mock(InformationService.class);

        customerService.setCustomerRepository(customerRepositoryStub);
        customerService.setInformationService(informationService);
    }

    @Test
    void test_customer_save() {
        Customer customer = new Customer(1L);

        customerService.saveCustomer(customer);

        assertAll("Customer Service Test with Stub",
                () -> assertNotNull(customerRepositoryStub.find(customer.getId())),
                () -> assertEquals(customer, customerRepositoryStub.find(customer.getId()))
                );



        Mockito.verify(informationService).sendMailFromNewCustomer(customer);
    }

    @Test
    void test_customer_delete() {
        customerService.saveCustomer(new Customer(1L));

        customerService.deleteCustomer(1L);

        assertNull(customerRepositoryStub.find(1L));
    }
}
