package br.cathenesi.rpg.domain.model.element.character.game;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.ImageHolder;
import br.cathenesi.rpg.domain.model.action.Action;
import br.cathenesi.rpg.domain.model.action.Fight;

public class Dragon implements GameCharacter, ImageHolder, Serializable {

	private static final long serialVersionUID = 1L;

	private int strength;
	private Action action;

	public Dragon() {
		this.strength = 100;
		this.action = new Fight(this);
	}

	public int getStrength() {
		return this.strength;
	}

	public Action getAction() {
		return action;
	}

	public String getImage() {
		return "🐉 Dragon (s=" + this.strength + ")";
	}

}
