package softwareTestingCA;

public class SubstringInString {
    static boolean isInTheString(String subString, String mainString){
        int M = subString.length();
        int N = mainString.length();

        for (int i = 0; i <= N - M; i++) {
            int j;

            for (j = 0; j < M; j++)
                if (mainString.charAt(i + j)
                        != subString.charAt(j))
                    break;

            if (j == M)
                return true;
        }

        return false;
    }
}

