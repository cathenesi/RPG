package br.cathenesi.rpg.domain.model.action;

import br.cathenesi.rpg.domain.model.behavior.StrengthHolder;
import br.cathenesi.rpg.domain.model.gameitem.player.PlayerCharacter;

public class Collect implements Action {

	private StrengthHolder element;

	public Collect(StrengthHolder element) {
		this.element = element;
	}

	public String getName() {
		return "Collect " + this.element.getName();
	}

	@Override
	public ActionResult doAction(PlayerCharacter character) {
		character.addStrength(this.element.getStrength());
		return new ActionResult("Item collected", null);
	}

}
