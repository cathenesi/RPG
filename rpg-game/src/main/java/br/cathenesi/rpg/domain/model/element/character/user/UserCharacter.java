package br.cathenesi.rpg.domain.model.element.character.user;

import br.cathenesi.rpg.domain.model.element.StrengthHolder;
import br.cathenesi.rpg.domain.model.element.StrengthModifier;

public interface UserCharacter extends StrengthHolder, StrengthModifier {

	public String getName(); 
	
	public Experience getExperience();

	public boolean isKilled();

	public void kill();

}
