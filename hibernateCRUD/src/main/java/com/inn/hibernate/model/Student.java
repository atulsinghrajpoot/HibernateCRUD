package com.inn.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 432889829478052655L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="rollNumber")
	private int rollNumber;
	@Column(name="cource")
	private String cource;
	@Column(name="name")
	private String name;
	
	public Student(int id, int rollNumber, String cource, String name) {
		super();
		this.id = id;
		this.rollNumber = rollNumber;
		this.cource = cource;
		this.name = name;
	}
	public Student() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNumber=" + rollNumber + ", cource="
				+ cource + ", name=" + name + "]";
	}
	
}
