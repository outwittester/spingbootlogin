package com.xikai.repository;

import com.xikai.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xikaixiong on 6/11/17.
 */
public interface UserRepository  extends JpaRepository<User,Integer>{
    User findByEmail(String email);
}
