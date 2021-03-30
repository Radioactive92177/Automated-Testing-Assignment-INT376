package armstrongNumberProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmsStrongNumberChallengeTest {

	@Test
	void test() {
		int num = 153;
		
		ArmsStrongNumberChallenge number = new ArmsStrongNumberChallenge(num);
		assertTrue(number.checkArmstrong());
	}
	
	@Test
	void test2() {
		int num = 123;
		
		ArmsStrongNumberChallenge number = new ArmsStrongNumberChallenge(num);
		assertFalse(number.checkArmstrong());
	}
	
	@Test
	void test3() {
		int num = 1;
		
		ArmsStrongNumberChallenge number = new ArmsStrongNumberChallenge(num);
		assertTrue(number.checkArmstrong());
	}

}
