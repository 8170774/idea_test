package com.test.service.impl;

import com.beans.Customer;
import com.test.dao.CustomerDao;
import com.test.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: zhaoce
 * @create: 2018-08-29 17:21
 **/
@Service
@Transactional
public class CustomerSerivceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public void save(Customer customer) throws Exception {
        customerDao.save(customer);
    }
}
