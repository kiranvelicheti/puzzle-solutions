package reactivedemo;

import challenges.solutions.RoundRotation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoundRotationTest {

    RoundRotation roundRotation = new RoundRotation();

    @Test
    public void findIfroundROtation() {

        assertEquals(roundRotation.findIfRoundRotation("ABACD", "CDABA"), true);
    }
}