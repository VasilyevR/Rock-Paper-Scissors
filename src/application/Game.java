package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	private final Random decider = new Random();

	public void run() {
		ArrayList<Boolean> rounds = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			GameObject gameObject = getRandomObject();
			GameObject playerObject = getPlayerObject();
			System.out.printf("Your %s VS my %s...%n", playerObject, gameObject);
			rounds.add(playerObject.smash(gameObject));
		}
		showWinner(isPlayerWinner(rounds));
	}

	private void showWinner(Boolean playerWinner) {
		if (null == playerWinner) {
			System.out.println("GAME IS DRAW!");
			return;
		}
		if (playerWinner) {
			System.out.println("YOU WIN!");
			return;
		}
		System.out.println("YOU LOOSE!");
	}

	private GameObject getRandomObject() {
		int choice = decider.nextInt(3);

		return getGameObjectById(choice);
	}

	private GameObject getPlayerObject() {
		System.out.println("Enter your choice (0.Rock 1.Paper 2.Scissors):");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		return getGameObjectById(choice);
	}

	private Boolean isPlayerWinner(ArrayList<Boolean> rounds) {
		Boolean isPlayerWinner = null;
		int wins = 0;
		int loses = 0;
		for (Boolean round : rounds) {
			if (round == null) {
				continue;
			}
			if (round) {
				wins++;
				continue;
			}
			loses++;
		}
		if (wins > loses) {
			isPlayerWinner = true;
		}
		if (loses > wins) {
			isPlayerWinner = false;
		}
		return isPlayerWinner;
	}

	private GameObject getGameObjectById(int id) {
		switch (id) {
			case 0: return new Rock();
			case 1: return new Paper();
			case 2: return new Scissors();
			default:
				throw new IllegalArgumentException();
		}
	}
}
