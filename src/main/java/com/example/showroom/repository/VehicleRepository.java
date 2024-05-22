package com.example.showroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.showroom.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	

}
