package com.innocv.springboot.ptrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.innocv.springboot.ptrest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
