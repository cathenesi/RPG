package br.cathenesi.rpg.domain.model.gameitem.weapon;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.action.Collect;
import br.cathenesi.rpg.domain.model.gameitem.AbstractActionStrengthItem;

public class Hammer extends AbstractActionStrengthItem implements Weapon, Serializable {

	private static final long serialVersionUID = 1L;

	public Hammer() {
		super.strength = 100;
		super.action = new Collect(this);
	}

	public String getName() {
		return "🔨 Hammer (strength=" + this.strength + ")";
	}

}
