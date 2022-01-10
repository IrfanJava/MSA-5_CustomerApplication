package net.Irfan.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private String age;
	
	@Column(name="preferred_food")
	private String preferredFood;
	
	public Customer(){
		
	}
	
	public Customer(String name, String gender, String age, String preferredFood) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.preferredFood = preferredFood;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPreferredFood() {
		return preferredFood;
	}

	public void setPreferredFood(String preferredFood) {
		this.preferredFood = preferredFood;
	}
	
	
	
	
}
