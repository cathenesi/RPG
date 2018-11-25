package br.cathenesi.rpg.domain.model.element.food;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.action.Collect;
import br.cathenesi.rpg.domain.model.element.AbstractActionStrengthItem;
import br.cathenesi.rpg.domain.model.element.ImageHolder;

public class Bread extends AbstractActionStrengthItem implements Food, ImageHolder, Serializable {

	private static final long serialVersionUID = 1L;

	public Bread() {
		this.strength = 20;
		this.action = new Collect(this);
	}

	public String getImage() {
		return "🥖 Bread (s=" + this.strength + ")";
	}

}
