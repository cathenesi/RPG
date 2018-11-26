package br.cathenesi.rpg.view;

import br.cathenesi.rpg.domain.model.Game;
import br.cathenesi.rpg.domain.model.gameitem.player.PlayerCharacter;
import br.cathenesi.rpg.infrastructure.GamePersistenceService;
import br.cathenesi.rpg.view.util.Terminal;

public class BasicMenu {

	protected GamePersistenceService gamePersistenceService;

	public void exit() {
		Terminal.print("Bye");
		System.exit(0);
	}

	protected BasicMenu(GamePersistenceService gamePersistenceService) {
		this.gamePersistenceService = gamePersistenceService;
	}

	protected void printUserInfo(PlayerCharacter player) {
		Terminal.print("Player: " + player.getName() + " | strength=" + player.getStrength() + " | experience: points="
				+ player.getExperience().getPoints() + ", level=" + player.getExperience().getLevel() + "|");
		Terminal.esp();
	}

	protected void printSkipOption() {
		Terminal.print("[0] - Skip");
	}

	protected void printSaveAndExitOption() {
		Terminal.print("[save] - Save game and exit");
	}

	protected void printExitOption() {
		Terminal.print("[any other key] - Exit");
	}

	protected void saveGame(Game game) throws Exception {
		Terminal.print("Saving game");
		this.gamePersistenceService.save(game);
		this.exit();
	}

}
