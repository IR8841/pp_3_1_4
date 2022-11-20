package ru.ivanov.springboot_bootstrap.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ivanov.springboot_bootstrap.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = {"roles"})
    User findByUsername(String username);
}
