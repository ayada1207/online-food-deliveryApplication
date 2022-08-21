package com.foodservice.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.foodservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	 Page<User> findByUsername(@RequestParam("username") String username, Pageable pageable);
	 
}
