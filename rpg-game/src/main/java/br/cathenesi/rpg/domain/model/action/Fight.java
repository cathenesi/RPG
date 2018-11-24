package br.cathenesi.rpg.domain.model.action;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.element.StrengthHolder;
import br.cathenesi.rpg.domain.model.element.character.user.UserCharacter;

public class Fight implements Action, Serializable {

	private static final long serialVersionUID = 1L;

	private StrengthHolder element;

	public Fight(StrengthHolder element) {
		this.element = element;
	}

	public StrengthHolder getElement() {
		return this.element;
	}

	public String getName() {
		return "fight";
	}

	public void doAction(UserCharacter character) {

		int thisStrength = this.element.getStrength();
		int otherStrength = character.getStrength();

		if (thisStrength > otherStrength) {
			character.kill();
		} else {
			character.addStrength(thisStrength * -1);
			character.getExperience().incrementExperience();
		}
	}

}
