package br.cathenesi.rpg.domain.model.element.weapon;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.ImageHolder;
import br.cathenesi.rpg.domain.model.action.Action;
import br.cathenesi.rpg.domain.model.action.Collect;

public class Sword implements Weapon, ImageHolder, Serializable {

	private static final long serialVersionUID = 1L;

	private int strength;
	private Action action;

	public Sword() {
		this.strength = 300;
		this.action = new Collect(this);
	}

	public int getStrength() {
		return this.strength;
	}

	public Action getAction() {
		return action;
	}

	public String getImage() {
		return "🗡️ Sword (s=" + this.strength + ")";
	}

}
