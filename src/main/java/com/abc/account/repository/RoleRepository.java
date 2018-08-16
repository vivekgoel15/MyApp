package com.abc.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
