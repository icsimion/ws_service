package com.webserv.rest.score;

import com.score.data.ScoreCollection;
import com.score.model.Game;
import com.score.model.Score;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import java.util.ArrayList;

@Path("/score")
@RequestScoped
public class ScoreRESTfulService {
	public ArrayList<Score> scoreList = ScoreCollection.getInstance().getScoreList();
	public ArrayList<Game> gameList = ScoreCollection.getInstance().getGameList();

	/**
	 * Return number of games with title 'name'
	 * @param name
	 * @return
	 */
	@GET
	@Path("/game/{name}")
	@Produces("text/plain")
	public int get(@PathParam("name") String name) {
		int i = 0;
		for (Score score : scoreList) {
			if (score.getGame().getName().toUpperCase().equals(name.toUpperCase())) {
				i++;
			}
		}
		return i;
	}

	@GET
	@Path("/getJson")
	@Produces("application/json")
	public String getExampleJSON() {
		return "{\"value\": \"Example text response.\"}";
	}

	@GET
	@Path("/getXml")
	@Produces("application/xml")
	public String getExampleXML() {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<value>Example text response.<\\value>";
	}

	/**
	 * Returns all scores
	 * @param
	 * @return
	 */
	@GET
	@Path("/scores")
	@Produces("application/json")
	public ArrayList<Score> getAllScores() {
		return scoreList;
	}

	/**
	 * add game
	 * @param game
	 * @return
	 */
	@POST
	@Path("/addGame")
	@Produces("application/json")
	public ArrayList<Game> addNewGame(Game game){
		gameList.add(game);
		return gameList;
	}

	/**
	 * update first score
	 * @param score
	 * @return
	 */
	@PUT
	@Path("/updateScore")
	@Produces("application/json")
	public ArrayList<Score> updateFirstScore(long score){
		scoreList.get(0).setScore(score);
		return scoreList;
	}

	/**
	 * delete game number
	 * @param number
	 * @return
	 */
	@DELETE
	@Path("/deleteGame/{number}")
	@Produces("application/json")
	public ArrayList<Game> deleteGame(@PathParam("number")int number){
		gameList.remove(number);
		return gameList;
	}


}
