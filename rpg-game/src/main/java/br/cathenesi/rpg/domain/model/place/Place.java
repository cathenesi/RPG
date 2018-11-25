package br.cathenesi.rpg.domain.model.place;

import java.util.ArrayList;
import java.util.List;

import br.cathenesi.rpg.domain.model.Explorable;
import br.cathenesi.rpg.domain.model.element.Item;

public abstract class Place implements Explorable {

	private boolean explored;
	
	private List<Item> items = new ArrayList<>();

	public Place(List<Item> items) {
		
		for (Item item : items) {
			item.put(this);
			this.items.add(item);
		}
		this.explored = false;
	}
	
	public boolean isExplored() {
		return explored;
	}
	
	public List<Item> getItems() {
		return items;
	}

}
