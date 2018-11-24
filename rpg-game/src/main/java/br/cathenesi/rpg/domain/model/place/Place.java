package br.cathenesi.rpg.domain.model.place;

import java.util.List;

import br.cathenesi.rpg.domain.model.Explorable;
import br.cathenesi.rpg.domain.model.element.Item;

public abstract class Place implements Explorable {

	private boolean explored;
	
	private List<Item> items;

	public Place(List<Item> items) {
		this.explored = false;
	}
	
	public boolean isExplored() {
		return explored;
	}
	
	public List<Item> getItems() {
		return items;
	}

}
