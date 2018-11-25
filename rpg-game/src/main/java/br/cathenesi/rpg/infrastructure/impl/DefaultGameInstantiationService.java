package br.cathenesi.rpg.infrastructure.impl;

import br.cathenesi.rpg.application.MapFactory;
import br.cathenesi.rpg.domain.model.Game;
import br.cathenesi.rpg.infrastructure.GameInstantiationService;

public class DefaultGameInstantiationService implements GameInstantiationService {

	MapFactory mapFactory = new MapFactory();

	@Override
	public Game newGame(String playerCharacterName) throws Exception {
		return new Game(playerCharacterName, mapFactory.createMaps());
	}

}
