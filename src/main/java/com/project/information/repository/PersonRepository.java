package com.project.information.repository;

import com.project.information.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<User, Long> {
    User getById(Long id);
}
