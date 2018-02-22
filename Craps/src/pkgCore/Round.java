package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private int ContinueRoll;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore

		boolean roundOver = false;

		Roll ComeOutRoll = new Roll();

		rolls.add(ComeOutRoll);

		this.ComeOutScore = ComeOutRoll.getScore();

		if (!roundOver) {
			System.out.printf("%s%d%n", "Player's point is ", ComeOutScore);
		}

		
		// TODO: value the eGameResult after the round is complete
		
		switch (ComeOutScore) {
		
		case 7:
		case 11:
			roundOver = true;
			eGameResult = eGameResult.NATURAL;
			break;
		
		case 2:
		case 3:
		case 12:
			roundOver = true;
			eGameResult = eGameResult.CRAPS;
		}

		
		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out

		while (!roundOver) {

			Roll ContinueRoll = new Roll();
			
			this.ContinueRoll = ContinueRoll.getScore();

			rolls.add(ContinueRoll);

			if (ContinueRoll.getScore() == ComeOutRoll.getScore()) {

				roundOver = true;
				eGameResult = eGameResult.POINT;
				

			}

			else if (ContinueRoll.getScore() == 7) {
				
				roundOver = true;
				eGameResult = eGameResult.SEVEN_OUT;
			}
				
			

		}

	}


	// TODO: value the eGameResult after the round is complete

	public int getComeoutScore() {
		
		return this.ComeOutScore;
		
	}
	
	public int getContinueRoll() {
		
		return this.ContinueRoll;
	}
	
	
	
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
