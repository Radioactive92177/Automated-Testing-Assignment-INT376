package softwareTestingCA;

public class PasswordContainVowels {
    static boolean containVowels(String password){
        for (int i = 0; i <password.length() ; i++) {
            if (password.charAt(i)=='a'||password.charAt(i)=='e'||password.charAt(i)=='i'||password.charAt(i)=='o'||password.charAt(i)=='u'){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
		boolean result  = containVowels("This is my Password");
		System.out.println(result);
	}
}

