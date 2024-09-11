package com.springboot_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot_project.entity.UserData;

public interface UserRepository extends JpaRepository<UserData, Integer> {

}
