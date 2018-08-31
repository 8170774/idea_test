package com.test.controller;

import com.beans.Customer;
import com.test.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: zhaoce
 * @create: 2018-08-29 17:33
 **/
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     *  跳转到input.jsp
     * @return
     */
    @RequestMapping("/input")
    public String input(){
        System.out.println("zzzzzzzzzzzz");
        return "input";
    }

    @RequestMapping("/save")
    public String save(Customer customer){
        try {
            customerService.save(customer);
            return "succ";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
