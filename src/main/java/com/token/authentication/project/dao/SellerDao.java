package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerDao extends JpaRepository<Seller, Long> {

}
