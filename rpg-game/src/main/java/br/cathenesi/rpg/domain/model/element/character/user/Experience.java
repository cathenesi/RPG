package br.cathenesi.rpg.domain.model.element.character.user;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.element.character.game.GameCharacter;

public class Experience implements Serializable {

	private static final long serialVersionUID = 1L;

	private int points;

	public Experience(GameCharacter Character) {
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
