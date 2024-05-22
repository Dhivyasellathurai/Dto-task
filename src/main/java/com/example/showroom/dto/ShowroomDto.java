package com.example.showroom.dto;

import java.util.List;

import lombok.Data;

@Data
public class ShowroomDto {
	
private int id;

private String Name;
 
private List<VehicleDto> vehicle;


}
