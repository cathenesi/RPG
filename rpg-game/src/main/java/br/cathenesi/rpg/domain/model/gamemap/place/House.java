package br.cathenesi.rpg.domain.model.gamemap.place;

import java.io.Serializable;
import java.util.List;

import br.cathenesi.rpg.domain.model.gameitem.Item;

public class House extends Place implements Serializable {

	private static final long serialVersionUID = 1L;

	public House(List<Item> items) {
		super("House", items);
	}

}
