package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorDao extends JpaRepository<Vendor, Integer> {

}
