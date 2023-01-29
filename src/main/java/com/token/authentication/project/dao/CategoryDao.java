package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
