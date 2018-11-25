package br.cathenesi.rpg.view;

import java.util.List;

import br.cathenesi.rpg.domain.model.Game;
import br.cathenesi.rpg.domain.model.action.Action;
import br.cathenesi.rpg.domain.model.action.ActionResult;
import br.cathenesi.rpg.domain.model.behavior.Explorable;
import br.cathenesi.rpg.infrastructure.GamePersistenceService;
import br.cathenesi.rpg.view.util.Terminal;

public class ExploreMenu extends BasicMenu {

	public ExploreMenu(GamePersistenceService gamePersistenceService) {
		super(gamePersistenceService);
	}

	public ActionResult execute(Game game, Explorable place) throws Exception {

		ActionResult actionResult = null;

		Terminal.sep();
		Terminal.esp();
		super.printUserInfo(game.getPlayerCharacter());
		Terminal.print("Select an option:");
		Terminal.esp();
		int index = 0;
		List<Action> actions = place.doExplore();
		super.printSkipOption();
		for (Action action : actions) {
			Terminal.print("[" + ++index + "] - " + action.getName());
		}
		super.printSaveAndExitOption();
		super.printExitOption();
		Terminal.esp();

		String actionId = Terminal.read();
		Terminal.esp();

		try {
			switch (actionId) {
			case "save": {
				super.saveGame(game);
				break;
			}
			default: {
				if (Integer.valueOf(actionId) != 0) {
					Action action = actions.get(Integer.valueOf(actionId) - 1);
					actionResult = action.doAction(game.getPlayerCharacter());
					Terminal.attention(actionResult.getResultAction());
					Terminal.esp();
				}
				break;
			}
			}
		} catch (NumberFormatException | IndexOutOfBoundsException e) {
			super.exit();
		}

		return actionResult;
	}

}
