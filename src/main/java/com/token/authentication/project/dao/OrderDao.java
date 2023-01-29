package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order,Long > {


}
