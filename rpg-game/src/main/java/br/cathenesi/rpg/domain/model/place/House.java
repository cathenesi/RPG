package br.cathenesi.rpg.domain.model.place;

import java.io.Serializable;
import java.util.List;

import br.cathenesi.rpg.domain.model.ImageHolder;
import br.cathenesi.rpg.domain.model.element.Item;
import br.cathenesi.rpg.view.render.Renderable;

public class House extends Place implements ImageHolder,  Serializable {

	private static final long serialVersionUID = 1L;

	public House(List<Item> items) {
		super(items);
	}

	public String getImage() {
		return "House";
	}

	public void doExplore(Renderable component) {
		
	}

}
