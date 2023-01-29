package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPriceDao extends JpaRepository<ProductPrice, Long> {

}
