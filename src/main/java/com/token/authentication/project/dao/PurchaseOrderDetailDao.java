package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.PurchaseOrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderDetailDao extends JpaRepository<PurchaseOrderDetail, Long> {

}
