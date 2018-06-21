package com.javatechie.derby.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="USER_DB2")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private int id;
	private String name;
	private String[] address;

}
