package com.muditasoft.artofwritingunittest.sample04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class SpyTest {

    @Test
    void test_spy() {
        DummyCustomerService service = Mockito.spy(new DummyCustomerServiceImpl());

        // just for Istanbul
        doNothing().when(service).addCustomer("Istanbul");

        // throw error when removeCustomer method has been invoked.
        doThrow(new IllegalArgumentException()).when(service).removeCustomer(anyString());

        doNothing().when(service).addCustomer("Istanbul");
        doNothing().when(service).addCustomer("Istanbul2");
        doCallRealMethod().when(service).updateCustomer("Istanbul3");

        service.addCustomer("Istanbul");
        service.addCustomer("Istanbul2");
        service.updateCustomer("Istanbul3");

        assertThrows(IllegalArgumentException.class, () -> service.removeCustomer("123"));
    }
}
