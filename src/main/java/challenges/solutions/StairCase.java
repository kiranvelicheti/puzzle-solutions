package challenges.solutions;

import java.util.stream.Collectors;

import static java.util.stream.IntStream.rangeClosed;

/*
Consider a staircase of size 4:

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Function Description

Complete the staircase function in the editor below. It should print a staircase as described above.

staircase has the following parameter(s):

n: an integer
Input Format

A single integer, , denoting the size of the staircase.

Constraints

 .

Output Format

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.

Medias Input

6
Medias Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .
*/
public class StairCase {

    static void stairCase(int size) {

        rangeClosed(1, size)
                .mapToObj(i -> {
                    String spaces = rangeClosed(1, size - i)
                            .mapToObj(k -> " ")
                            .collect(Collectors.joining());
                    String stars = rangeClosed(1, i)
                            .mapToObj(k -> "*")
                            .collect(Collectors.joining());
                    return spaces + stars;
                })
                .forEach(System.out::println);
    }
}
