package challenges.solutions;

public class RoundRotation {


    public boolean findIfRoundRotation(String first, String second) {

        return (first + first).contains(second);
    }
}
