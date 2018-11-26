package br.cathenesi.rpg.infrastructure.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.cathenesi.rpg.application.MapFactory;
import br.cathenesi.rpg.domain.model.Game;
import br.cathenesi.rpg.infrastructure.GamePersistenceService;

public class DiskGamePersistenceService implements GamePersistenceService {

	static final String PATH = "game.dat";

	MapFactory mapFactory = new MapFactory();

	@Override
	public void save(Game game) throws Exception {

		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(new File(PATH)))) {
			stream.writeObject(game);
		}
	}

	@Override
	public Game load() throws Exception {

		try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(new File(PATH)))) {
			Game game = (Game) stream.readObject();
			game.setMaps(this.mapFactory.createMaps());
			return game;
		}
	}

}
