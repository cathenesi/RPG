package br.cathenesi.rpg.domain.model.action;

import br.cathenesi.rpg.domain.model.gameitem.player.PlayerCharacter;
import br.cathenesi.rpg.domain.model.gamemap.place.Place;

public class Explore implements Action {

	private Place place;

	public Explore(Place place) {
		this.place = place;
	}

	@Override
	public String getName() {
		return "Explore " + place.getName();
	}

	@Override
	public ActionResult doAction(PlayerCharacter character) {

		return new ActionResult("Explore the surroundings of " + this.place.getName(), this.place);
	}

}
