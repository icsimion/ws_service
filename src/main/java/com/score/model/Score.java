package com.score.model;

import java.util.Date;

public class Score {
	private long score;
	private Date date;
	private Person person;
	private Game game;

	public Score(){}

	public Score(long score, Date date, Person person, Game game){
		this.score = score;
		this.date = date;
		this.person = person;
		this.game = game;
	}
	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
}
