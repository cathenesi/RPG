package br.cathenesi.rpg.domain.model.gameitem;

import br.cathenesi.rpg.domain.model.behavior.ActionHolder;
import br.cathenesi.rpg.domain.model.gamemap.place.Place;

public interface Item extends ActionHolder {
	
	public void put(Place place);
	public Place getPlace();

}
