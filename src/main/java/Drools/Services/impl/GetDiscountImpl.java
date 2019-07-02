package Drools.Services.impl;

import Drools.DTO.Customer;
import Drools.DroolsServices.DroolService;
import Drools.Services.GetDiscountInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetDiscountImpl implements GetDiscountInterface {

    @Autowired
    DroolService droolService;
    @Override
    public int getDiscounts(Customer customer) {
        droolService.insertCustomer(customer);
        return customer.getDiscount();
    }
}
