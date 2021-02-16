package softwareTestingCA;

import org.junit.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordContainVowelsTest {

    @BeforeEach
    public void setup() throws Exception{
        PasswordContainVowels passwordContainVowels = new PasswordContainVowels();
    }

//    Pass Test cases
    @Test
    public void check1(){
        assertTrue(PasswordContainVowels.containVowels("ThisIsMyPassword123"), "It should contain vowels");
    }

    @Test
    public void check2(){
        assertTrue(PasswordContainVowels.containVowels("ThisIsMySecondPassword123"), "It should contain vowels");
    }

    @Test
    public void check3(){
        assertTrue(PasswordContainVowels.containVowels("ThisIsMyThirdPassword123"), "It should contain vowels");
    }

//    Fail Test Cases
    @Test
    public void check4(){
        assertFalse(PasswordContainVowels.containVowels("ThssMyPsswrd123"), "It should not contain vowels");
    }
    @Test
    public void check5(){
        assertFalse(PasswordContainVowels.containVowels("qwkjlhgjsd123"), "It should not contain vowels");
    }
    @Test
    public void check6(){
        assertFalse(PasswordContainVowels.containVowels("Tlkhllssffd123"), "It should not contain vowels");
    }
}