package com.saib.springbootseed.repositories;

import com.saib.springbootseed.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
