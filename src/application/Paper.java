package application;

import java.util.ArrayList;
import java.util.List;

public class Paper extends GameObject{

	public Paper() {
		this.name = "paper";
		this.smash = "wraps";
		this.losers = new ArrayList<>(List.of("rock"));
	}
}
