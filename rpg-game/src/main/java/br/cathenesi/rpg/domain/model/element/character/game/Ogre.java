package br.cathenesi.rpg.domain.model.element.character.game;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.action.Fight;
import br.cathenesi.rpg.domain.model.element.AbstractActionStrengthItem;
import br.cathenesi.rpg.domain.model.element.ImageHolder;

public class Ogre extends AbstractActionStrengthItem implements GameCharacter, ImageHolder, Serializable {

	private static final long serialVersionUID = 1L;

	public Ogre() {
		this.strength = 20;
		this.action = new Fight(this);
	}

	public String getImage() {
		return "👹 Ogre (s=" + this.strength + ")";
	}
}
