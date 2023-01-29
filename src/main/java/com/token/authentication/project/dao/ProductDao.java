package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Long> {

}
