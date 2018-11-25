package br.cathenesi.rpg.domain.model.behavior;

import java.util.List;

import br.cathenesi.rpg.domain.model.action.Action;

public interface Explorable {

	public String getName();
	public List<Action> doExplore();

}
