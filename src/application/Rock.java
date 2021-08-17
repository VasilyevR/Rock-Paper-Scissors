package application;

import java.util.ArrayList;
import java.util.List;

public class Rock extends GameObject {

	public Rock () {
		this.name = "rock";
		this.smash = "smashes";
		this.losers = new ArrayList<>(List.of("scissors"));
	}
}
