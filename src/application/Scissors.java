package application;

import java.util.ArrayList;
import java.util.List;

public class Scissors extends GameObject{

	public Scissors() {
		this.name = "scissors";
		this.smash = "cuts";
		this.losers = new ArrayList<>(List.of("paper"));
	}
}
