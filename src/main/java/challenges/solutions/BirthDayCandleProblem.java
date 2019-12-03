package challenges.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/*

You are in charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age.
When she blows out the candles, she’ll only be able to blow out the tallest ones.
Your task is to find out how many candles she can successfully blow out.

For example, if your niece is turning 4 years old, and the cake will have 4 candles of height 4,4 ,1 ,3 she will be able to blow out 2 candles successfully,
since the tallest candles are of height 4 and 2 there are  such candles.

Function Description

Complete the function birthdayCakeCandles in the editor below. It must return an integer representing the number of candles she can blow out.

birthdayCakeCandles has the following parameter(s):

ar: an array of integers representing candle heights
Input Format

The first line contains a single integer,n , denoting the number of candles on the cake.
The second line contains n space-separated integers, where each integer  describes the height of candle .

Constraints

Output Format

Return the number of candles that can be blown out on a new line.

Sample Input 0

4
3 2 1 3
Sample Output 0

2
Explanation 0

We have one candle of height 1, one candle of height 2, and two candles of height 3. Your niece only blows out the tallest candles,
meaning the candles where height = 3. Because there are 2 such candles, we print 2 on a new line.
*/
public class BirthDayCandleProblem {

    static int birthdayCakeCandles(int[] ar) {

        return Arrays.stream(ar)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .reduce((a, b) -> b)
                .map(Map.Entry::getValue)
                .map(Long::intValue)
                .orElse(0);
    }
}
