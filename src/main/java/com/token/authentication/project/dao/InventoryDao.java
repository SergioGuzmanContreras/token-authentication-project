package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryDao extends JpaRepository<Inventory, Long> {

}
