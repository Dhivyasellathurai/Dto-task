package com.example.showroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.showroom.dto.ShowroomDto;
import com.example.showroom.service.ShowroomService;

@RestController
public class ShowroomController {
@Autowired

private ShowroomService showroomService;

@PostMapping("/save")
public String create (@RequestBody ShowroomDto dto) {
	showroomService.save(dto);
	return "SUCCESS";
}
@PutMapping("update/{id}")
public String update(@PathVariable("id") Integer id,@RequestBody ShowroomDto dto) {
	showroomService.change(id,dto);
	return "SUCCESS";
}
}