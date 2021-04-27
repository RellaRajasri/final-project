package com.example.demo.empdao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.compensation.Compensation;

public interface CompDao extends JpaRepository<Compensation, Integer>{

}
