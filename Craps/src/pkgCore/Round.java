package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore

		boolean gameOver = false;

		Roll ComeOutRoll = new Roll();

		rolls.add(ComeOutRoll);

		this.ComeOutScore = ComeOutRoll.getScore();

		if (!gameOver) {
			System.out.printf("%n%s%d%n", "Player's point is ", ComeOutScore);
		}

		if (ComeOutScore == 7 || ComeOutScore == 11) {

			gameOver = true;
			eGameResult = eGameResult.NATURAL;
			System.out.println("Player loses");

		}

		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {

			gameOver = true;
			eGameResult = eGameResult.CRAPS;
			System.out.println("Player loses");
		}

		/*
		 * if (ComeOutScore == 4 || ComeOutScore == 5 || ComeOutScore == 6 ||
		 * ComeOutScore == 8 || ComeOutScore == 9 || ComeOutScore == 10) { gameOver =
		 * false; System.out.printf("%n%s%d%n", "Player's point is ", ComeOutScore); }
		 */

		while (!gameOver) {

			Roll ContinueRoll = new Roll();

			rolls.add(ContinueRoll);

			if (ContinueRoll.getScore() == ComeOutRoll.getScore()) {

				gameOver = true;
				eGameResult = eGameResult.POINT;
				System.out.println("Player wins");

			}

			else if (ContinueRoll.getScore() == 7) {

				gameOver = true;
				eGameResult = eGameResult.SEVEN_OUT;
				System.out.println("Player loses");
			}

		}

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out

	}

	// TODO: value the eGameResult after the round is complete

	public int RollCount() {
		// Return the roll count

		return rolls.size();
	}

	public LinkedList<Roll> getRolls() {
		return rolls;
	}

	public eGameResult getResult() {
		return eGameResult;
	}
}
