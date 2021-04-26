package armstrongNumberProblem;


public class ArmsStrongNumberChallenge {
	int num;
	
	// This is a demo line
	ArmsStrongNumberChallenge(int num) {
		this.num = num;
	}
	
	public boolean checkArmstrong() {
		int initialNum = num;
		int arms = 0;
		
		while(num>0) {
			int rem = num % 10;
			arms = arms + (rem*rem*rem);
			num = num / 10;
		}
		
		return initialNum == arms;
	}
}
