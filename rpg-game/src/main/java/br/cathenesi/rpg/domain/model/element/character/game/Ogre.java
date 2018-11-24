package br.cathenesi.rpg.domain.model.element.character.game;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.ImageHolder;
import br.cathenesi.rpg.domain.model.action.Action;
import br.cathenesi.rpg.domain.model.action.Fight;

public class Ogre implements GameCharacter, ImageHolder, Serializable {

	private static final long serialVersionUID = 1L;

	private int strength;
	private Action action;

	public Ogre() {
		this.strength = 20;
		this.action = new Fight(this);
	}

	public int getStrength() {
		return this.strength;
	}

	public Action getAction() {
		return action;
	}

	public String getImage() {
		return "👹 Ogre (s=" + this.strength + ")";
	}
}
