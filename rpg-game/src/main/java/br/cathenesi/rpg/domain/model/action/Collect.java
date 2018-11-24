package br.cathenesi.rpg.domain.model.action;

import br.cathenesi.rpg.domain.model.element.StrengthHolder;
import br.cathenesi.rpg.domain.model.element.character.user.UserCharacter;

public class Collect implements Action {

	private StrengthHolder element;

	public Collect(StrengthHolder element) {
		this.element = element;
	}

	public String getName() {
		return "collect";
	}

	public StrengthHolder getElement() {
		return this.element;
	}

	public void doAction(UserCharacter character) {
		character.addStrength(this.element.getStrength());
	}

}
