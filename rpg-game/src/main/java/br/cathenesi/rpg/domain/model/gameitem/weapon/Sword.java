package br.cathenesi.rpg.domain.model.gameitem.weapon;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.action.Collect;
import br.cathenesi.rpg.domain.model.gameitem.AbstractActionStrengthItem;

public class Sword extends AbstractActionStrengthItem implements Weapon, Serializable {

	private static final long serialVersionUID = 1L;

	public Sword() {
		this.strength = 300;
		this.action = new Collect(this);
	}

	public String getName() {
		return "🗡️ Sword (strength=" + this.strength + ")";
	}

}
