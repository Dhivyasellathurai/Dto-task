package com.example.showroom.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.showroom.dto.ShowroomDto;
import com.example.showroom.dto.VehicleDto;
import com.example.showroom.entity.Showroom;
import com.example.showroom.entity.Vehicle;
import com.example.showroom.repository.ShowroomRepository;

@Service
public class ShowroomService {
	@Autowired
	private ShowroomRepository showroomRepository;

	public void save(ShowroomDto showDto) {
		Showroom showroom = new Showroom();
		showroom.setName(showDto.getName());
		List<Vehicle> list = new ArrayList<>();
		for (VehicleDto vehicleDto : showDto.getVehicle()) {
			Vehicle vehicle = new Vehicle();
			vehicle.setVehicleName(vehicleDto.getVehicleName());
			list.add(vehicle);
		}
		showroom.setLists(list);
		showroomRepository.save(showroom);
	}

	public void change(Integer id, ShowroomDto showDto) {
		showroomRepository.findById(id);
		Showroom showroom1 = new Showroom();
		showroom1.setName(showDto.getName());

		List<Vehicle> list1 = new ArrayList<>();
		for (VehicleDto vehicleDto : showDto.getVehicle()) {
			Vehicle veh = new Vehicle();
			veh.setVehicleName(vehicleDto.getVehicleName());
			list1.add(veh);

		}
		showroom1.setLists(list1);

		showroomRepository.saveAndFlush(showroom1);

	}
}