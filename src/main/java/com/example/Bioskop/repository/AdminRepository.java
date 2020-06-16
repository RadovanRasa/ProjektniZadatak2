package com.example.Bioskop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Bioskop.entity.Administrator;

public interface AdminRepository extends JpaRepository<Administrator, String> {

}
