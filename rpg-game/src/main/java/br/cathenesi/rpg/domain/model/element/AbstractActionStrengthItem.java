package br.cathenesi.rpg.domain.model.element;

import br.cathenesi.rpg.domain.model.action.Action;
import br.cathenesi.rpg.domain.model.place.Place;

public class AbstractActionStrengthItem implements Item, StrengthHolder, ActionHolder {

	protected int strength;
	protected Place place;
	protected Action action;

	public int getStrength() {
		return this.strength;
	}

	@Override
	public void put(Place place) {
		this.place = place;
	}

	@Override
	public Place getPlace() {
		return this.place;
	}

	public Action getAction() {
		return action;
	}

}
