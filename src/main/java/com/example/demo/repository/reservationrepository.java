package com.example.demo.repository;

import com.example.demo.entity.*; 
import org.springframework.data.jpa.repository.JpaRepository; 


public interface reservationrepository extends JpaRepository<reservationentity, Long> {

}
