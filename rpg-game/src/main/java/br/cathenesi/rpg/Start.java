package br.cathenesi.rpg;

import br.cathenesi.rpg.application.MapFactory;

public class Start {

	public static void main(String[] args) throws Exception {
		new MapFactory().createMaps();
		System.out.println("OK!");
	}
	
}
