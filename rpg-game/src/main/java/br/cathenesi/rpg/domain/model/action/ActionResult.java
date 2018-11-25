package br.cathenesi.rpg.domain.model.action;

import br.cathenesi.rpg.domain.model.behavior.Explorable;

public class ActionResult {

	private String resultAction;
	private Explorable nextExplorable;

	public ActionResult(String resultAction, Explorable nextExplorable) {
		super();
		this.resultAction = resultAction;
		this.nextExplorable = nextExplorable;
	}

	public Explorable getNextExplorable() {
		return nextExplorable;
	}

	public String getResultAction() {
		return resultAction;
	}

}
