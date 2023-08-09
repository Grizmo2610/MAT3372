package exerciseonsets;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>();
        for (int number : first)
            if (second.contains(number))
                result.add(number);
        return result;
    }

    public static void addAll(Set<Integer> source, Set<Integer> target) {
        for (int number : source)
            target.add(number);
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>();
        addAll(first, result);
        addAll(second, result);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>();
        result.addAll(first);
        result.retainAll(second);
        return result;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<Integer>();
        result.addAll(first);
        result.addAll(second);
        return result;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicatesManual(Set<Integer> source) {
        List<Integer> result = new ArrayList<>();
        result.addAll(source);
        return result;
    }

    public static String firstRecurringCharacter(String s) {
        for (int i = 0; i < s.length() - 1; i++)
            for (int j = i + 1; j < s.length(); j++)
                if (s.charAt(i) == s.charAt(j))
                    return "" + s.charAt(i);
        return "";
    }

    public static Set<Character> allRecurringCharacter(String s) {
        Set<Character> result = new HashSet<Character>();
        for (char c : s.toCharArray())
            result.add(c);
        return result;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static void print(Integer[] arr) {
        for (int number : arr)
            System.out.print(number + " ");
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGrater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

    public static void main(String[] args) {
        Set<Integer> first = new HashSet<Integer>(Arrays.asList(1, 5, 6, 2, 3));

        print(toArray(first));
    }
}
