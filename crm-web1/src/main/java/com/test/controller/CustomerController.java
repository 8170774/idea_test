package com.test.controller;

import com.beans.Customer;
import com.test.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
            System.out.println("vvvvvvvvvv");
            customerService.save(customer);
            return "succ";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping(value = "/doGet", method = RequestMethod.GET)
    public String doGet(){
        System.out.println("doGet ...............");
        return "succ";
    }

    @RequestMapping(value = "/doPost", method = RequestMethod.POST)
    public String doPost(Customer customer){
        System.out.println("doPost ..............." + customer);
        return "succ";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String doPost(Integer id){
        System.out.println("delete ..............." + id);
        return "succ";
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public String put(){
        System.out.println("put ...............");
        return "succ";
    }
}
