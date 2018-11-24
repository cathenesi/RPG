package br.cathenesi.rpg.domain.model.element.character.user;

public enum Level {

	ROOKIE(0, 10),
	BEGINNER(11, 20),
	INTERMEDIATE(21, 30),
	EXPERIENCED(31, 40),
	EXPERT(41, Integer.MAX_VALUE);

	int from, to;
	
	private Level(int from, int to) {
		this.from = from;
		this.to = to;
	}

	public static Level identify(int strength) {
		
		Level result = null;
		for (Level level : values()) {
			if (level.from <= strength && level.to >= strength) {
				result = level;
				break;
			}
		}
		return result;
	}
	
}
