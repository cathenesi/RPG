package br.cathenesi.rpg.domain.model.action;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.behavior.StrengthHolder;
import br.cathenesi.rpg.domain.model.gameitem.player.PlayerCharacter;

public class Fight implements Action, Serializable {

	private static final long serialVersionUID = 1L;

	private StrengthHolder element;

	public Fight(StrengthHolder element) {
		this.element = element;
	}

	public String getName() {
		return "Fight " + this.element.getName();
	}

	@Override
	public ActionResult doAction(PlayerCharacter player) {

		int thisStrength = this.element.getStrength();
		int otherStrength = player.getStrength();

		String result = null;
		if (thisStrength > otherStrength) {
			player.kill();
			result = "You've been killed";
		} else {
			player.addStrength(thisStrength * -1);
			player.getExperience().incrementExperience();
			result = "You win";
		}

		return new ActionResult(result, null);
	}

}
