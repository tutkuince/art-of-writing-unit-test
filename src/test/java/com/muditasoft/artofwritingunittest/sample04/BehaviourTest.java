package com.muditasoft.artofwritingunittest.sample04;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class BehaviourTest {

    @Test
    void test_behaviour() {
        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        dummyCustomerService.addCustomer("Istanbul");
        dummyCustomerService.addCustomer("Izmir");

        verify(dummyCustomerService).addCustomer("Istanbul");
        verify(dummyCustomerService).addCustomer("Izmir");
    }

    @Test
    void test_how_many_times_called_that_methods() {
        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        dummyCustomerService.addCustomer("Istanbul");
        dummyCustomerService.addCustomer("Izmir");
        dummyCustomerService.addCustomer("Izmir");
        dummyCustomerService.addCustomer("Izmir");

        verify(dummyCustomerService, times(3)).addCustomer("Izmir");
        verify(dummyCustomerService, times(1)).addCustomer("Istanbul");

        verify(dummyCustomerService, never()).removeCustomer(anyString());
        verify(dummyCustomerService, never()).addCustomer("Ankara");

        verify(dummyCustomerService, atLeast(1)).addCustomer("Istanbul");
    }

    @Test
    void test_check_orders() {
        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        dummyCustomerService.addCustomer("Izmir");
        dummyCustomerService.addCustomer("Istanbul");
        dummyCustomerService.addCustomer("Ankara");

        InOrder inOrder = inOrder(dummyCustomerService);

        inOrder.verify(dummyCustomerService).addCustomer("Izmir");
        inOrder.verify(dummyCustomerService).addCustomer("Istanbul");
        inOrder.verify(dummyCustomerService).addCustomer("Ankara");
    }
}
