package reactivedemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoundRotationTest {

    RoundRotation roundRotation = new RoundRotation();

    @Test
    public void findIfroundROtation(){

        assertEquals(roundRotation.findIfRoundRotation("ABACD","CDABA"),true);
    }
}