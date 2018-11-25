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

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(PATH)))) {
			oos.writeObject(game);
		}
	}

	@Override
	public Game load() throws Exception {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(PATH)))) {
			Game game = (Game) ois.readObject();
			game.setMaps(mapFactory.createMaps());
			return game;
		}
	}

}
