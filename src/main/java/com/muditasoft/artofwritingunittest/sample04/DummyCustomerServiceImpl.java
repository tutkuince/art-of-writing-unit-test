package com.muditasoft.artofwritingunittest.sample04;

public class DummyCustomerServiceImpl implements DummyCustomerService {
    @Override
    public void addCustomer(String customerName) {
        System.out.println(String.format("addCustomer(%s)",customerName));
    }

    @Override
    public void removeCustomer(String customerName) {
        System.out.println(String.format("removeCustomer(%s)", customerName));
    }

    @Override
    public void updateCustomer(String customerName) {
        System.out.println(String.format("updateCustomer(%s)", customerName));
    }

    @Override
    public String getCustomer(String customerName) {
        return customerName;
    }
}
