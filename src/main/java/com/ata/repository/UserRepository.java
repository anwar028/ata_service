package com.ata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ata.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
