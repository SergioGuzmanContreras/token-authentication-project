package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderDao extends JpaRepository<PurchaseOrder, Long> {

}
