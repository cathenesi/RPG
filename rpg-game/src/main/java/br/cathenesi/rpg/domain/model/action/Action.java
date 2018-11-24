package br.cathenesi.rpg.domain.model.action;

import br.cathenesi.rpg.domain.model.element.StrengthHolder;
import br.cathenesi.rpg.domain.model.element.character.user.UserCharacter;

public interface Action {

	public String getName();
	
	public StrengthHolder getElement();
	
	public void doAction(UserCharacter character);
	
}
