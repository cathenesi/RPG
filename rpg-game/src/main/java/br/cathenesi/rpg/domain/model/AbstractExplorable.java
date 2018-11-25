package br.cathenesi.rpg.domain.model;

import java.util.ArrayList;
import java.util.List;

import br.cathenesi.rpg.domain.model.action.Action;
import br.cathenesi.rpg.domain.model.behavior.ActionHolder;
import br.cathenesi.rpg.domain.model.behavior.Explorable;

public abstract class AbstractExplorable implements Explorable {

	public abstract List<ActionHolder> getItemsToInteract();

	public List<Action> doExplore() {

		List<Action> actions = new ArrayList<>();
		for (ActionHolder item : this.getItemsToInteract()) {
			actions.add(item.getAction());
		}

		return actions;
	}

}
