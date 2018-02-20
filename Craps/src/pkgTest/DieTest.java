package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {

			Die d = new Die();
			// TODO: Make sure value of die is between 1 and 6.

			if (d.getDieValue() > 6 || d.getDieValue() < 1) {
				fail("Out of range");
			}
		}

	}

}
