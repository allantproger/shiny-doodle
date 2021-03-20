package com.xatab.ez.repository;

import java.util.Optional;

import com.xatab.ez.models.ERole;
import com.xatab.ez.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
