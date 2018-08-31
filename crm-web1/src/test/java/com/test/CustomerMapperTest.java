package com.test;


import com.beans.Customer;
import com.test.dao.CustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CustomerMapperTest {
    @Autowired
    private CustomerDao customerMapper;

    @Test
    public void testCustomerMapper(){
        Customer cus = new Customer();
        cus.setName("李四");
        cus.setGender("男");
        cus.setAge(30);
        customerMapper.save(cus);
    }

}
