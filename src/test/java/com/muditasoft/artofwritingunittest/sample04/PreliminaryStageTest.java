package com.muditasoft.artofwritingunittest.sample04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

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

    @Test
    void test_when_then_usage_for_void_return_types() {
        DummyCustomerService customerService = mock(DummyCustomerService.class);

        doNothing().when(customerService).addCustomer(anyString());

        doReturn("ankara").when(customerService).getCustomer("Izmir");

    }
}
