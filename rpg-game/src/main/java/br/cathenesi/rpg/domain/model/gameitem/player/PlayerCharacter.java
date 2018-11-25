package br.cathenesi.rpg.domain.model.gameitem.player;

import java.io.Serializable;

import br.cathenesi.rpg.domain.model.behavior.StrengthHolder;
import br.cathenesi.rpg.domain.model.behavior.StrengthModifier;

public interface PlayerCharacter extends StrengthHolder, StrengthModifier, Serializable {

	public String getName(); 
	
	public Experience getExperience();

	public boolean isKilled();

	public void kill();

}
