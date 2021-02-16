package softwareTestingCA;

import org.junit.Test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class SubstringInStringTest {

    @BeforeEach
    public void setUp() throws Exception{
        SubstringInString substringInString = new SubstringInString();
    }

//    Pass test cases
    @Test
    public void check1(){
        assertTrue(SubstringInString.isInTheString("Raj", "My name is Raj"), "Raj is in 'My name is Raj'");
    }

    @Test
    public void check2(){
        assertTrue(SubstringInString.isInTheString("Atharva", "My name is Atharva"), "Atharva is in 'My name is Atharva'");
    }

    @Test
    public void check3(){
        assertTrue(SubstringInString.isInTheString("Harsha", "My name is Harsha"), "Harsha is in 'My name is Harsha'");
    }

//    Fail Test cases
    @Test
    public void check4(){
        assertFalse(SubstringInString.isInTheString("Raj", "My name is Atharva"), "Raj is not in 'My name is Atharva'");
    }

    @Test
    public void check5(){
        assertFalse(SubstringInString.isInTheString("Atharva", "My name is Harsha"), "Atharva is not in 'My name is Harsha'");
    }
    
    @Test
    public void check6(){
        assertFalse(SubstringInString.isInTheString("Harsha", "My name is Raj"), "Harsha is not in 'My name is Raj'");
    }
}