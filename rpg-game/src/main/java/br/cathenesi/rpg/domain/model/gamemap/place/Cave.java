package br.cathenesi.rpg.domain.model.gamemap.place;

import java.io.Serializable;
import java.util.List;

import br.cathenesi.rpg.domain.model.gameitem.Item;

public class Cave extends Place implements Serializable {

	private static final long serialVersionUID = 1L;

	public Cave(List<Item> items) {
		super("Cave", items);
	}

}
