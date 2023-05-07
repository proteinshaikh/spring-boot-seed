package com.saib.springbootseed.repositories;

import com.saib.springbootseed.entity.Role;
import com.saib.springbootseed.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}



