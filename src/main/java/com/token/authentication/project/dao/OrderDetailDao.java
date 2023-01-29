package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Long> {

}
