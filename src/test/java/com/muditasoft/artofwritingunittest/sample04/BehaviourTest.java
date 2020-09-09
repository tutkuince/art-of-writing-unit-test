package com.muditasoft.artofwritingunittest.sample04;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class BehaviourTest {

    @Test
    void test_behaviour() {
        DummyCustomerService dummyCustomerService = Mockito.mock(DummyCustomerService.class);

        dummyCustomerService.addCustomer("Istanbul");
        dummyCustomerService.addCustomer("Izmir");

        verify(dummyCustomerService).addCustomer("Istanbul");
        verify(dummyCustomerService).addCustomer("Izmir");
    }
}
