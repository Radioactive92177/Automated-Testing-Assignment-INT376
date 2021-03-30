package vowelsProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VowelsCountChallengeTest {

	// Both userName & password satisfies the preconditions
	@Test
	void test() {
		String userName = "Raaaaazzz", password = "FAAAAAMNG";

		VowelsCountChallenge user = new VowelsCountChallenge(userName);
		VowelsCountChallenge pass = new VowelsCountChallenge(password);

		int vowelsCountInUserName = user.getVowsAndConsCount()[0],
				consonantsCountInUserName = user.getVowsAndConsCount()[1];
		int vowelsCountInPassword = pass.getVowsAndConsCount()[0],
				consonantsCountInPassword = pass.getVowsAndConsCount()[1];

		// Checking userName
		assertEquals(VowelsCountChallenge.desiredVowelsCount, vowelsCountInUserName);
		assertEquals(VowelsCountChallenge.desiredConsonantsCount, consonantsCountInUserName);

		// Checking password
		assertEquals(VowelsCountChallenge.desiredVowelsCount, vowelsCountInPassword);
		assertEquals(VowelsCountChallenge.desiredConsonantsCount, consonantsCountInPassword);
	}

	// Both userName & password does not satisfies the preconditions
	@Test
	void test2() {
		String userName = "Raaaazz", password = "FAAAANG";

		VowelsCountChallenge user = new VowelsCountChallenge(userName);
		VowelsCountChallenge pass = new VowelsCountChallenge(password);

		int vowelsCountInUserName = user.getVowsAndConsCount()[0],
				consonantsCountInUserName = user.getVowsAndConsCount()[1];
		int vowelsCountInPassword = pass.getVowsAndConsCount()[0],
				consonantsCountInPassword = pass.getVowsAndConsCount()[1];

		// Checking userName
		assertNotEquals(VowelsCountChallenge.desiredVowelsCount, vowelsCountInUserName);
		assertNotEquals(VowelsCountChallenge.desiredConsonantsCount, consonantsCountInUserName);

		// Checking password
		assertNotEquals(VowelsCountChallenge.desiredVowelsCount, vowelsCountInPassword);
		assertNotEquals(VowelsCountChallenge.desiredConsonantsCount, consonantsCountInPassword);
	}

	// Only userName satisfies the precondition while the password not
	@Test
	void test3() {
		String userName = "Raaaaazzz", password = "FAAAANG";

		VowelsCountChallenge user = new VowelsCountChallenge(userName);
		VowelsCountChallenge pass = new VowelsCountChallenge(password);

		int vowelsCountInUserName = user.getVowsAndConsCount()[0],
				consonantsCountInUserName = user.getVowsAndConsCount()[1];
		int vowelsCountInPassword = pass.getVowsAndConsCount()[0],
				consonantsCountInPassword = pass.getVowsAndConsCount()[1];

		// Checking userName
		assertEquals(VowelsCountChallenge.desiredVowelsCount, vowelsCountInUserName);
		assertEquals(VowelsCountChallenge.desiredConsonantsCount, consonantsCountInUserName);

		// Checking password
		assertNotEquals(VowelsCountChallenge.desiredVowelsCount, vowelsCountInPassword);
		assertNotEquals(VowelsCountChallenge.desiredConsonantsCount, consonantsCountInPassword);
	}

}
