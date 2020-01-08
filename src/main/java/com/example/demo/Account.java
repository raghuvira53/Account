package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc1")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="acc_no")
	private Long acc_No;
	@Column(name="acc_name")
	private String acc_Name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getAcc_No() {
		return acc_No;
	}
	public void setAcc_No(Long acc_No) {
		this.acc_No = acc_No;
	}
	public String getAcc_Name() {
		return acc_Name;
	}
	public void setAcc_Name(String acc_Name) {
		this.acc_Name = acc_Name;
	}
	
}
