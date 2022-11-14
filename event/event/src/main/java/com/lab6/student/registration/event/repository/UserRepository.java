package com.lab6.student.registration.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lab6.student.registration.event.entity.StudentUser;

@Repository
public interface UserRepository extends JpaRepository<StudentUser,Long> {
    @Query("SELECT u FROM StudentUser u WHERE u.username = ?1")
    public StudentUser getUserByUsername(String username);
}