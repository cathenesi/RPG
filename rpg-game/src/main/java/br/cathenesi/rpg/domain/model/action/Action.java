package br.cathenesi.rpg.domain.model.action;

import br.cathenesi.rpg.domain.model.gameitem.player.PlayerCharacter;

public interface Action {

	public String getName();
	
	public ActionResult doAction(PlayerCharacter character);
	
}
