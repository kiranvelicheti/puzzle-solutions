package challenges.solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectronicsBudgetTest {

    @Test
    public void getMoneySpent() {
        int[] keyBoards = {40, 50, 60};
        int[] usbs = {4, 8, 12};

        assertEquals(58, ElectronicsBudget.getMoneySpent(keyBoards, usbs, 60));
    }
}