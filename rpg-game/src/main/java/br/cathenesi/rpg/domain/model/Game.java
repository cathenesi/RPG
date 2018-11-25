package br.cathenesi.rpg.domain.model;

import java.io.Serializable;
import java.util.List;

import br.cathenesi.rpg.domain.model.behavior.Explorable;
import br.cathenesi.rpg.domain.model.gameitem.player.Experience;
import br.cathenesi.rpg.domain.model.gameitem.player.PlayerCharacter;
import br.cathenesi.rpg.domain.model.gamemap.GameMap;

public class Game implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int strength = 0;
	boolean killed = false;
	Experience experience = new Experience();
	String playerCharacterName = "";
	transient List<GameMap> maps = null;

	PlayerCharacter playerCharacter = new PlayerCharacter() {

		private static final long serialVersionUID = 1L;

		@Override
		public void addStrength(int strengthToAdd) {
			Game.this.strength += strengthToAdd;
		}

		@Override
		public int getStrength() {
			return Game.this.strength;
		}

		@Override
		public void kill() {
			Game.this.killed = true;
		}

		@Override
		public boolean isKilled() {
			return Game.this.killed;
		}

		@Override
		public String getName() {
			return Game.this.playerCharacterName;
		}

		@Override
		public Experience getExperience() {
			return experience;
		}

		@Override
		public Explorable getPlace() {
			return null;
		}
	};

	public Game(String playerCharacterName, List<GameMap> maps) {
		this.playerCharacterName = playerCharacterName;
		this.maps = maps;
	}
	
	public void setMaps(List<GameMap> maps) {
		this.maps = maps;
	}

	public List<GameMap> getMaps() {
		return maps;
	}
	
	public PlayerCharacter getPlayerCharacter() {
		return playerCharacter;
	}
	
}
