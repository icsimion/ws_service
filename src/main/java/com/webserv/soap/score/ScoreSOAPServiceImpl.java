package com.webserv.soap.score;

import com.score.model.Game;
import com.score.model.Person;
import com.score.model.Score;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of a simple game scoring SOAP Web Service.
 */
@WebService(serviceName = "ScoreSOAPService", portName = "ScoreSOAPService", name = "ScoreSOAPService")
public class ScoreSOAPServiceImpl implements ScoreSOAPService {

	@Override
	public Person getPersonByNick(String nickname) {
		for (Score score : scoreList) {
			if (score.getPerson().getNickname().toUpperCase().equals(nickname.toUpperCase())) {
				return score.getPerson();
			}
		}
		return null;
	}

	@Override
	public List<Score> getAllScores() {
		return scoreList;
	}

	@Override
	public List<Score> getScoresOver(long minScore) {
		List<Score> scores = new ArrayList<Score>();

		for (Score score : scoreList) {
			if (score.getScore() >= minScore) {
				scores.add(score);
			}
			return scores;
		}
		return null;
	}

	@Override
	public Score getFirstScoreForGame(Game game) {
		List<Score> scores = new ArrayList<Score>();

		for (Score score : scoreList) {
			Game current = score.getGame();
			if (current.getName().equals(game.getName())) {
				return score;
			}
		}
		return null;
	}
}