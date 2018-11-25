package br.cathenesi.rpg.infrastructure;

import br.cathenesi.rpg.domain.model.Game;

public interface GameInstantiationService {

	public Game newGame(String playerCharacterName) throws Exception;
	
}
