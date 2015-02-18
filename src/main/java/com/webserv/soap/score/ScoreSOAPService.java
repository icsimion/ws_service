package com.webserv.soap.score;

import com.score.data.ScoreCollection;
import com.score.model.Game;
import com.score.model.Person;
import com.score.model.Score;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Scoring SOAP web service.
 */

@WebService
public interface ScoreSOAPService {

	public ArrayList<Score> scoreList = ScoreCollection.getInstance().getScoreList();

	/**
	 * Return the Person with given nickname
	 *
	 * @param nickname
	 * @return
	 */
	@WebMethod
	public Person getPersonByNick(String nickname);

	/**
	 * Return all scores registered
	 *
	 * @return
	 */
	@WebMethod
	public List<Score> getAllScores();

	/**
	 * Return all scores over given value
	 *
	 * @param minScore
	 * @return
	 */
	@WebMethod
	public List<Score> getScoresOver(long minScore);

	/**
	 * Return the first found score for the given name
	 *
	 * @param game
	 * @return
	 */
	@WebMethod
	public Score getFirstScoreForGame(Game game);
}