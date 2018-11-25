package br.cathenesi.rpg.domain.model.gameitem.player;

import java.io.Serializable;

public class Experience implements Serializable {

	private static final long serialVersionUID = 1L;

	private int points;

	public Experience() {
		this.points = 0;
	}

	public void incrementExperience() {
		this.points++;
	}

	public int getPoints() {
		return points;
	}

	public Level getLevel() {
		return Level.identify(this.points);
	}

}
