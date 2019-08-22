package com.tcs.hospital.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {

	@Id
	//@GeneratedValue
	private int id;
	private String name;
	private String city;
	private float rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	public Object add(Hospital hospitals) {
        // TODO Auto-generated method stub
        return null;
	}
}
