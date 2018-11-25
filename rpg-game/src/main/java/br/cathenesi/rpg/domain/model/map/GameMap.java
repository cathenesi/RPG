package br.cathenesi.rpg.domain.model.map;

import java.io.Serializable;
import java.util.List;

import br.cathenesi.rpg.domain.model.Explorable;
import br.cathenesi.rpg.domain.model.place.Place;
import br.cathenesi.rpg.view.render.Renderable;

public class GameMap implements Explorable, Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private Place lastPoint;
	private List<Place> places;

	public GameMap(String name, List<Place> places) {

		this.name = name;
		this.lastPoint = places.size() > 0 ? places.get(0) : null;
		this.places = places;
	}

	public Place getLastPoint() {
		return lastPoint;
	}

	public List<Place> getPlaces() {
		return places;
	}
	
	public String getName() {
		return this.name;
	}

	public void doExplore(Renderable component) {
		// TODO Auto-generated method stub
		
	}
	
}
