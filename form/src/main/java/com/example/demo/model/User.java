package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
public class User {
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	@Id
	private String firstname;
	private String lastname;
	private int age;
	public String getFirstname() {
		return firstname;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
