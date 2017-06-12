package com.xikai.repository;

import com.xikai.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xikaixiong on 6/11/17.
 */
public interface RoleRepository extends JpaRepository<Role,Integer>{
    Role findByRole(String role);
}
