package br.cathenesi.rpg.domain.model.gameitem.food;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.action.Collect;
import br.cathenesi.rpg.domain.model.gameitem.AbstractActionStrengthItem;

public class Bread extends AbstractActionStrengthItem implements Food, Serializable {

	private static final long serialVersionUID = 1L;

	public Bread() {
		this.strength = 20;
		this.action = new Collect(this);
	}

	public String getName() {
		return "🥖 Bread (strength=" + this.strength + ")";
	}

}
