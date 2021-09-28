package com.example.demo.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users_tab")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	private Integer uid;
	@Column
	private String username;
	@Column
	private String password;
	@ElementCollection
	@CollectionTable(name = "roles_tab",joinColumns = @JoinColumn(name="uid"))
	@Column(name = "role")
	private List<String> roles;

}
