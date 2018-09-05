package com.test.dao;

import com.beans.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao {

    void save(Customer customer);
}
