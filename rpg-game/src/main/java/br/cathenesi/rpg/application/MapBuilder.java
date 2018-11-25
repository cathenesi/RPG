package br.cathenesi.rpg.application;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import br.cathenesi.rpg.domain.model.gameitem.Item;
import br.cathenesi.rpg.domain.model.gamemap.GameMap;
import br.cathenesi.rpg.domain.model.gamemap.place.Place;

public class MapBuilder {

	String mapName;
	String currentPlaceClassName;
	List<Item> currentItens = new ArrayList<>();

	List<Place> mapPlaces = new ArrayList<>();

	public MapBuilder(List<MapFactory.MapElement> mapElements) throws Exception {

		for (MapFactory.MapElement mapElement : mapElements) {

			switch (mapElement.getKey()) {
			case "name": {
				this.mapName = mapElement.getValue();
				break;
			}
			case "place": {
				this.handlePlace(mapElement.getValue());
				break;
			}
			case "item": {
				this.handleItem(mapElement.getValue());
				break;
			}
			default:
				break;
			}
		}
		this.handleLastPlace();
	}

	private void handlePlace(String placeClassName) throws Exception {

		if (this.currentPlaceClassName != null) {
			Constructor constructor = Class.forName(this.currentPlaceClassName).getConstructor(List.class);
			Place place = (Place) constructor.newInstance(this.currentItens);
			this.mapPlaces.add(place);
			this.currentItens.clear();
		}
		this.currentPlaceClassName = placeClassName;
	}

	private void handleLastPlace() throws Exception {
		this.handlePlace(null);
	}

	private void handleItem(String itemClassName) throws Exception {
		this.currentItens.add((Item) Class.forName(itemClassName).newInstance());
	}

	public GameMap build() {
		return new GameMap(this.mapName, new ArrayList<>(this.mapPlaces));
	}

}
