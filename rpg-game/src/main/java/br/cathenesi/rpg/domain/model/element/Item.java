package br.cathenesi.rpg.domain.model.element;

import br.cathenesi.rpg.domain.model.place.Place;

public interface Item {
	
	public void put(Place place);
	public Place getPlace();
	
}
