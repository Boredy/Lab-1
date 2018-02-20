package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		// TODO: Create an instance of d1 and d2...
		// TODO: Determine 'Score'

		this.d1 = new Die();

		this.d2 = new Die();

		this.Score = d1.getDieValue() + d2.getDieValue();

	}

	public int getScore() {
		return Score;
	}

}
