package com.test.service;


import com.beans.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: 用户操作
 * @author: zhaoce
 * @create: 2018-08-29 16:18
 **/

public interface CustomerService {
    /**
    * @Description: testetsetest
    * @Param: [customer]
    * @return: void
    * @Author: zhaoce
    * @Date: 2018/8/29 17:18
    */
    void save(Customer customer) throws Exception;
}
