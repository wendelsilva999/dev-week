package com.greyhat.devweekapi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="champions")
public class Champions implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String name;
	private String role;
	private String lore;
	private String imageUrl;
	
	
	public Champions() {
	}
	
	public Champions(Long id, String name, String role, String lore, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.lore = lore;
		this.imageUrl = imageUrl;
	}
	public Long getId() {

		return id;
	}
	public void setId(Long id) {

		this.id = id;
	}
	public String getName() {

		return name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public String getRole() {

		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}
