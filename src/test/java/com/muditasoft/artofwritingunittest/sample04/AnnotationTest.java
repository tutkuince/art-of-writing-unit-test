package com.muditasoft.artofwritingunittest.sample04;

import com.muditasoft.artofwritingunittest.sample02.model.Customer;
import com.muditasoft.artofwritingunittest.sample02.repository.CustomerRepository;
import com.muditasoft.artofwritingunittest.sample02.service.CustomerService;
import com.muditasoft.artofwritingunittest.sample02.service.InformationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class AnnotationTest {

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;
    @Mock
    private InformationService informationService;

    @Test
    void test_annotation() {

        customerService.saveCustomer(new Customer(1L));
    }


}
