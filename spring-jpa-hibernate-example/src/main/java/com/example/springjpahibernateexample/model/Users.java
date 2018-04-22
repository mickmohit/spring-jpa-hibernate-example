package com.example.springjpahibernateexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User", catalog= "dbservice")
public class Users {

	@Id
	@Column(name="id")
	private Integer id;
	private String name;
	private String teamName;
	private Integer Salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public Users(Integer id, String name, String teamName, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.teamName = teamName;
		Salary = salary;
	}
	
	public Users() {}
	
}
