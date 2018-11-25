package br.cathenesi.rpg.domain.model.gamemap;

import java.io.Serializable;
import java.util.List;

import br.cathenesi.rpg.domain.model.AbstractExplorable;
import br.cathenesi.rpg.domain.model.behavior.ActionHolder;

public class GameMap extends AbstractExplorable implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private List<ActionHolder> places;

	public GameMap(String name, List<ActionHolder> places) {

		this.name = name;
		this.places = places;
	}

	public String getName() {
		return this.name;
	}
	
	public List<ActionHolder> getItemsToInteract() {
		return this.places;
	}

}
