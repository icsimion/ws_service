package com.score.model;

import java.util.Date;

public class Person {
	private String firstname;
	private String surname;
	private String nickname;
	private Date startingDate;

	public Person(){
	}

	public Person(String firstname, String surname, String nickname, Date startingDate) {
		this.firstname = firstname;
		this.surname = surname;
		this.nickname = nickname;
		this.startingDate = startingDate;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}
}
