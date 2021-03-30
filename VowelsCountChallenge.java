package vowelsProblem;

public class VowelsCountChallenge {
	private String str;
	static int desiredVowelsCount, desiredConsonantsCount;

	VowelsCountChallenge(String str) {
		this.str = str.toLowerCase();
		desiredVowelsCount = 5;
		desiredConsonantsCount = 4;
	}

	public int[] getVowsAndConsCount() {
		int vowelsCount = 0, consonantsCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowelsCount += 1;
			}
		}

		consonantsCount = str.length() - vowelsCount;

		int[] countData = { vowelsCount, consonantsCount };

		return countData;
	}
}
