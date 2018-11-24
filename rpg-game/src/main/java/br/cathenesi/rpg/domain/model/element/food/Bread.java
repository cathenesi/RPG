package br.cathenesi.rpg.domain.model.element.food;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.ImageHolder;
import br.cathenesi.rpg.domain.model.action.Action;
import br.cathenesi.rpg.domain.model.action.Collect;

public class Bread implements Food, ImageHolder, Serializable {

	private static final long serialVersionUID = 1L;

	private int strength;
	private Action action;

	public Bread() {
		this.strength = 20;
		this.action = new Collect(this);
	}

	public int getStrength() {
		return this.strength;
	}

	public Action getAction() {
		return action;
	}

	public String getImage() {
		return "🥖 Bread (s=" + this.strength + ")";
	}

}
