package br.cathenesi.rpg.domain.model.element.weapon;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.ImageHolder;
import br.cathenesi.rpg.domain.model.action.Action;
import br.cathenesi.rpg.domain.model.action.Collect;

public class Hammer implements Weapon, ImageHolder, Serializable {

	private static final long serialVersionUID = 1L;

	private int strength;
	private Action action;

	public Hammer() {
		this.strength = 100;
		this.action = new Collect(this);
	}

	public int getStrength() {
		return this.strength;
	}

	public Action getAction() {
		return action;
	}

	public String getImage() {
		return "🔨 Hammer (s=" + this.strength + ")";
	}

}
