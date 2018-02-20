package pkgCore;

import java.security.SecureRandom;

public class Die {

	private static final SecureRandom randomNumbers = new SecureRandom();

	private int DieValue;

	public Die() {

		this.DieValue = 1 + randomNumbers.nextInt(6);

	}

	public int getDieValue() {
		return DieValue;
	}
}
