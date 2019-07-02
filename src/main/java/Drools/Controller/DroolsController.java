package Drools.Controller;

import Drools.DTO.Customer;
import Drools.Services.GetDiscountInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DroolsController {

    @Autowired
    GetDiscountInterface discountInterface;

    @PostMapping(value = "/drools")
    public int getDiscount(@RequestBody Customer customer){
            return discountInterface.getDiscounts(customer);
    }

    @GetMapping(value = "/drools/new")
    public int getsomething(@RequestParam int a){
        return 0;
    }

}
