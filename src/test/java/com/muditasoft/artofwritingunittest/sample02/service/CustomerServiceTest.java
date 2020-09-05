package com.muditasoft.artofwritingunittest.sample02.service;

import com.muditasoft.artofwritingunittest.sample02.model.Customer;
import com.muditasoft.artofwritingunittest.sample02.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

class CustomerServiceTest {

    private CustomerService customerService;
    private CustomerRepository customerRepository;
    private InformationService informationService;


    @BeforeEach
    void setUp() {
        customerService = new CustomerService();
        customerRepository = mock(CustomerRepository.class);
        informationService = mock(InformationService.class);

        customerService.setCustomerRepository(customerRepository);
        customerService.setInformationService(informationService);
    }

    @Test
    void test_save_customer() {
        final Customer customer = new Customer(1L);

        customerService.saveCustomer(customer);

        Mockito.verify(customerRepository).save(customer);
        Mockito.verify(informationService).sendMailFromNewCustomer(customer);

    }
}