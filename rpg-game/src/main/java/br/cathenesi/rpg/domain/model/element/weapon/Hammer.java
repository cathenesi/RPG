package br.cathenesi.rpg.domain.model.element.weapon;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.action.Collect;
import br.cathenesi.rpg.domain.model.element.AbstractActionStrengthItem;
import br.cathenesi.rpg.domain.model.element.ImageHolder;

public class Hammer extends AbstractActionStrengthItem implements Weapon, ImageHolder, Serializable {

	private static final long serialVersionUID = 1L;

	public Hammer() {
		super.strength = 100;
		super.action = new Collect(this);
	}

	public String getImage() {
		return "🔨 Hammer (s=" + this.strength + ")";
	}

}
