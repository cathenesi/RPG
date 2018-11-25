package br.cathenesi.rpg.domain.model.gamemap.place;

import java.util.ArrayList;
import java.util.List;

import br.cathenesi.rpg.domain.model.AbstractExplorable;
import br.cathenesi.rpg.domain.model.action.Action;
import br.cathenesi.rpg.domain.model.action.Explore;
import br.cathenesi.rpg.domain.model.behavior.ActionHolder;
import br.cathenesi.rpg.domain.model.gameitem.Item;

public abstract class Place extends AbstractExplorable implements ActionHolder {

	private String name;
	private Action action;
	private List<ActionHolder> items = new ArrayList<>();

	public Place(String name, List<Item> items) {

		for (Item item : items) {
			item.put(this);
			this.items.add(item);
		}
		this.name = name;
		this.action = new Explore(this);
	}

	@Override
	public String getName() {
		return name;
	}

	public List<ActionHolder> getItemsToInteract() {
		return items;
	}

	@Override
	public Action getAction() {
		return this.action;
	}

}
