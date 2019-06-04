package reactivedemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionsTest {

    @Test
    public void basicValidCases() {
        String expected = "<h1>header</h1>";
        String actual = Solutions.markDown("# header");
        assertEquals(expected, actual);
        String expected1 = "<h2>smaller header</h2>";
        String actual1 = Solutions.markDown("## smaller header");
        assertEquals(expected1, actual1);
        String expected3 = "<h4>Space Jam</h4>";
        String actual3 = Solutions.markDown("    #### Space Jam");
        assertEquals(expected3, actual3);
        String expected4 = "Behind # The Scenes";
        String actual4 = Solutions.markDown("Behind # The Scenes");
        assertEquals(expected4, actual4);
    }
    @Test
    public void basicInvalidCases() {
        String expected = "#Invalid";
        String actual = Solutions.markDown("#Invalid");
        assertEquals(expected, actual);
    }

    @Test
    public void maskify(){
        String maskify = Solutions.maskify("12345678");

        assertEquals(maskify,"5678");
    }

    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals("2000 103 123 4444 99", Solutions.orderWeight("103 123 4444 99 2000"));
        assertEquals("11 11 2000 10003 22 123 1234000 44444444 9999", Solutions.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }
}