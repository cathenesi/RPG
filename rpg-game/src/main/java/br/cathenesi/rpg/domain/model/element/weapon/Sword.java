package br.cathenesi.rpg.domain.model.element.weapon;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.action.Collect;
import br.cathenesi.rpg.domain.model.element.AbstractActionStrengthItem;
import br.cathenesi.rpg.domain.model.element.ImageHolder;

public class Sword extends AbstractActionStrengthItem implements Weapon, ImageHolder, Serializable {

	private static final long serialVersionUID = 1L;

	public Sword() {
		this.strength = 300;
		this.action = new Collect(this);
	}

	public String getImage() {
		return "🗡️ Sword (s=" + this.strength + ")";
	}

}
