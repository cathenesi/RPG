package br.cathenesi.rpg.view.util;

import java.util.Scanner;

public class Terminal {

	public static void print(String message) {
		System.out.println(message);
	}

	public static void attention(String message) {
		System.out.println("!! " + message + " !!");
	}

	public static String read() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		return input;
	}

	public static void sep() {
		print("--------------------------------------------------------------------------------");
	}

	public static void esp() {
		print("");
	}

}
