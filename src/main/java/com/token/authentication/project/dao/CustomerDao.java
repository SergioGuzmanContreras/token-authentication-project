package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
