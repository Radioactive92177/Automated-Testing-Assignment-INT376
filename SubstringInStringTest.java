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
        assertTrue(SubstringInString.isInTheString("Raj", "My name is Raj"), "Substring is present in the string");
    }

    @Test
    public void check2(){
        assertTrue(SubstringInString.isInTheString("wood", "Bollywood"), "Substring is present in the string");
    }

    @Test
    public void check3() {
        assertTrue(SubstringInString.isInTheString("wood", "Hollywood"), "Substring is present in the string");
    }
    
    @Test
    public void check4() {
        assertTrue(SubstringInString.isInTheString("Hal", "Hallelujah"),
                "Substring is present in the string");
    }

    @Test
    public void check5() {
        assertTrue(SubstringInString.isInTheString("Harsha", "My name is Harsha"), "Harsha is in 'My name is Harsha'");
    }

//    Fail Test cases
    @Test
    public void check6(){
        assertFalse(SubstringInString.isInTheString("Soccer", "Cricket is very popular"), "Substring is not present");
    }

    @Test
    public void check7(){
        assertFalse(SubstringInString.isInTheString("pi", "PIRATE"), "Substring is not present");
    }
    
    @Test
    public void check8() {
        assertFalse(SubstringInString.isInTheString("call", "Call of Duty"), "Substring is not present");
    }
    
    @Test
    public void check9() {
        assertFalse(SubstringInString.isInTheString("Atharva", "My name is Raj"),
                "Substring is not present");
    }

    @Test
    public void check10() {
        assertFalse(SubstringInString.isInTheString("Drr", "Dr.Rajesh"), "Substring is not present");
    }
}