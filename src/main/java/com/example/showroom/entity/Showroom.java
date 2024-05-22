package com.example.showroom.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "showroom")
@Data
public class Showroom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	 private int id;
	
	@Column(name = "name")
	private String name;

	@OneToMany(targetEntity = Vehicle.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "showroom_id",referencedColumnName = "id")
	private List<Vehicle> lists;
}
