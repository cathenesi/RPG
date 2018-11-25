package br.cathenesi.rpg.infrastructure;

import br.cathenesi.rpg.domain.model.Game;

public interface GamePersistenceService {

	public void save(Game game) throws Exception;
	public Game load() throws Exception;
	
}
