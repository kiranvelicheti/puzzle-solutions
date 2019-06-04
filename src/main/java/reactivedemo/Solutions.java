package reactivedemo;

import java.util.HashMap;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;

public class Solutions {

    //Find middle of string if even length n/2 and n/2-1 , if odd n/2
    public String middle(String str) {
        int middleStringPos = str.length() / 2;
        return str.length() % 2 != 0 ? str.substring(middleStringPos, middleStringPos + 1) : str.substring(middleStringPos - 1, middleStringPos + 1);
    }

    //Html tag <h1>header</h1> if # header
    public static String markDown(String markdown) {
        String[] split = markdown.trim().split(" ");
        boolean b = split.length < 2
                || !stream(split[0].split("")).allMatch(s -> s.equalsIgnoreCase("#"))
                || stream(split).anyMatch(s -> s.equalsIgnoreCase("Hashtags"));
        return b
                ? markdown
                : "<h" + split[0].length() + ">" + stream(split).skip(1).collect(joining(" "))
                + "</h" + split[0].length() + ">";
    }

    //Calculate weight of list of numbers
    public static String orderWeight(String strng) {
        return stream(strng.split(" "))
                .map(s -> new MapI(s, stream(s.split(""))
                        .map(Integer::parseInt).reduce(Integer::sum).orElse(1)))
                .sorted(comparing(mapi1 -> mapi1.weight))
                .collect(Collectors.toList())
                .stream()
                .sorted(comparing(mapI1 -> mapI1.weight))
                .map(mapI -> mapI.value)
                .sorted()
                .collect(joining(" "));
    }

    static class MapI {
        MapI(String value, Integer weight) {
            this.value = value;
            this.weight = weight;
        }

        String value;
        Integer weight;
    }

    // Mask all characters except last 4
    public static String maskify(String cc) {
        if (cc.length() > 4) {
            return IntStream.range(0, cc.length() - 4).mapToObj(i -> "#").collect(Collectors.joining("")) + cc.substring(cc.length() - 4);
        }
        return "";
    }

    // Braces validator
    public static boolean isValid(String braces) {

        Stack<Character> stackValidaotr = new Stack<>();
        HashMap<Character, Character> bracePairs = new HashMap<>();
        bracePairs.put('(', ')');
        bracePairs.put('{', '}');
        bracePairs.put('[', ']');
        for (int i = 0; i < braces.length(); i++) {
            char charAt = braces.charAt(i);
            if (bracePairs.keySet().contains(charAt)) {
                stackValidaotr.push(braces.charAt(1));
            } else if (bracePairs.values().contains(charAt)) {
                if (!stackValidaotr.empty() && bracePairs.get(stackValidaotr.peek()) == charAt) {
                    stackValidaotr.pop();
                } else return false;
            }
        }
        return stackValidaotr.empty();
    }


}
