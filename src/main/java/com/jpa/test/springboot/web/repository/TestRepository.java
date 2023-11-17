package com.jpa.test.springboot.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.springboot.web.domain.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
    Optional<Test> findById(Integer id);
}