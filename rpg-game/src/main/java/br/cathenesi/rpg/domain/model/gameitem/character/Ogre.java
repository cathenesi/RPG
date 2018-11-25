package br.cathenesi.rpg.domain.model.gameitem.character;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.action.Fight;
import br.cathenesi.rpg.domain.model.gameitem.AbstractActionStrengthItem;

public class Ogre extends AbstractActionStrengthItem implements GameCharacter, Serializable {

	private static final long serialVersionUID = 1L;

	public Ogre() {
		this.strength = 20;
		this.action = new Fight(this);
	}

	public String getName() {
		return "👹 Ogre (strength=" + this.strength + ")";
	}
}
