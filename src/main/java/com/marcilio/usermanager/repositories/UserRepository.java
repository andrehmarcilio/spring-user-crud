package com.marcilio.usermanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcilio.usermanager.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
