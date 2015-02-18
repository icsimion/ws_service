package com.score.data;

import com.score.model.Game;
import com.score.model.Person;
import com.score.model.Score;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoreCollection {

	private ArrayList<Score> scoreList = new ArrayList<Score>();
	private ArrayList<Game> gameList = new ArrayList<Game>();

	private static ScoreCollection instance = null;
	protected ScoreCollection() {
		generateGames();
		generateScores();
	}
	public static ScoreCollection getInstance() {
		if(instance == null) {
			instance = new ScoreCollection();
		}
		return instance;
	}

	private void generateScores() {
		List<Person> persons = getPersons();
		int i = 0;

		for(Person person:persons) {
			long score = (long)(Math.random()*10000);
			Date date = getDate(""+ ((int)(Math.random()*30)) + "07-Jan-2015");
			scoreList.add(new Score(score, date, person, gameList.get(i++ % 2)));
		}
	}

	public ArrayList<Score> getScoreList(){
		return scoreList;
	}

	public ArrayList<Game> getGameList(){
		return gameList;
	}

	private List<Person> getPersons() {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("John", "Oliver", "oliver", getDate("07-Jun-2013")));
		list.add(new Person("Anton", "Privette", "anton", getDate("03-Jun-2012")));
		list.add(new Person("Sergio", "Pettey", "sergiop", getDate("01-Jun-2014")));
		list.add(new Person("Esta", "Garrels", "estag", getDate("05-Jun-2014")));
		list.add(new Person("Petrina", "Bitton", "petrina", getDate("12-Jun-2013")));
		list.add(new Person("Milford", "Cusic", "milcus", getDate("02-Jun-2011")));
		list.add(new Person("Royce", "Heskett", "rouc", getDate("25-Jun-2013")));
		list.add(new Person("Andre", "Tull", "andree", getDate("04-Jun-2013")));
		list.add(new Person("Margaretta", "Harwood", "hardwo", getDate("17-Jun-2013")));

		return list;
	}

	private void generateGames() {
		gameList.add(new Game("Pool", "mobile game simulating pool", (short)12, (short)13, 5000));
		gameList.add(new Game("DoodleJump", "mobile jumpy jumpy game", (short)10, (short)14, 3000));
	}

	private Date getDate(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String dateInString = date ;
		try {
			formatter.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}