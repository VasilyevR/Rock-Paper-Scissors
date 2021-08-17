package application;

import java.util.ArrayList;

public class GameObject {
	protected String name;
	protected String smash;
	protected ArrayList<String> losers;

	protected Boolean smash (GameObject object) {
		if (this.losers.contains(object.toString())) {
			System.out.printf("%s %s %s!%n", this.name, this.smash, object);
			return true;
		}
		if (this.name.equals(object.toString())) {
			System.out.println("round is draw!");
			return null;
		}
		if (object.smash(this)) {
			return false;
		}
		return null;
	}

	@Override
	public String toString() {
		return name;
	}
}
