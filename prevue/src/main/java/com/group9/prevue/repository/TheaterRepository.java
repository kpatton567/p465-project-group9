package com.group9.prevue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group9.prevue.model.Theater;
import com.group9.prevue.model.User;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long>{

	Theater findByManager(User manager);
}
