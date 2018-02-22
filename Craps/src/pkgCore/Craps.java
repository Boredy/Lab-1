package pkgCore;

import java.util.LinkedList;

public class Craps {

	public static void main(String[] args) {

		Round r = new Round();

		LinkedList<Roll> rolls = r.getRolls();

		for (int i = 0; i < rolls.size(); i++) {

			System.out.printf("%d ", rolls.get(i).getScore());

		}

		System.out.println(r.getResult());

	}

}
