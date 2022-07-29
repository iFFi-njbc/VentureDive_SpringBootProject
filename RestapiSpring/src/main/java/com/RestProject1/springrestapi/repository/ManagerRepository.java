package com.RestProject1.springrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestProject1.springrestapi.model.Manager;


@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {
	public Manager findByNameAndId(String name, Long id);
}
