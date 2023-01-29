package com.token.authentication.project.dao;

import com.token.authentication.project.dao.entity.Role;
import com.token.authentication.project.utils.enums.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleDao extends JpaRepository<Role, Integer> {

    Optional<Role> findByRole(RoleEnum role);

}
