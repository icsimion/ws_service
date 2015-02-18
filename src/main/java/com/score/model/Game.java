package com.score.model;

public class Game {
	private String name;
	private String description;
	private short releaseMonth;
	private short releaseYear;
	private long bugdet;

	public Game(){

	}

	public Game(String name, String description, short releaseMonth, short releaseYear, long bugdet){
		this.name = name;
		this.description = description;
		this.releaseMonth = releaseMonth;
		this.releaseYear = releaseYear;
		this.bugdet = bugdet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getReleaseMonth() {
		return releaseMonth;
	}

	public void setReleaseMonth(short releaseMonth) {
		this.releaseMonth = releaseMonth;
	}

	public short getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(short releaseYear) {
		this.releaseYear = releaseYear;
	}

	public long getBugdet() {
		return bugdet;
	}

	public void setBugdet(long bugdet) {
		this.bugdet = bugdet;
	}
}
