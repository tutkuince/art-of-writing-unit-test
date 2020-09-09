package com.muditasoft.artofwritingunittest.sample04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PreliminaryStageTest {

    @Test
    void test_when() {
        DummyCustomerService customerService = mock(DummyCustomerService.class);

        when(customerService.getCustomer(eq("Izmir"))).thenReturn("CustomerIzmir");

        String customer = customerService.getCustomer("Izmir");

        Assertions.assertEquals("CustomerIzmir", customer);
    }

    @Test
    void test_throws_exception_with_usage_of_when() {
        DummyCustomerService customerService = mock(DummyCustomerService.class);
        when(customerService.getCustomer("ankara")).thenThrow(new IllegalArgumentException("EXCEPTION"));

        Assertions.assertThrows(IllegalArgumentException.class, () -> customerService.getCustomer("ankara"));
    }
}
