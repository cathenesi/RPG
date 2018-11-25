package br.cathenesi.rpg.domain.model.gameitem.character;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.action.Fight;
import br.cathenesi.rpg.domain.model.gameitem.AbstractActionStrengthItem;

public class Dragon extends AbstractActionStrengthItem implements GameCharacter, Serializable {

	private static final long serialVersionUID = 1L;

	public Dragon() {
		this.strength = 100;
		this.action = new Fight(this);
	}

	public String getName() {
		return "🐉 Dragon (strength=" + this.strength + ")";
	}

}
