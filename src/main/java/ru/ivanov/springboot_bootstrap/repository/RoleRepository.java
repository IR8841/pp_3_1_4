package ru.ivanov.springboot_bootstrap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ivanov.springboot_bootstrap.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
