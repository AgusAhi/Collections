import java.util.*;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        // Exercise 1

        /*
        Set<String> set = new HashSet<String>();
        set.add("AAAAA");
        set.add("BBBBB");
        set.add("CCCCC");
        set.add("BBBBB");
        */

        // Exercise 2

        /*
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        increment(set);
        System.out.println(set);
         */

        printWithoutDuplicates("a", "b", "a", "c", "b", "a", "d");
        printDuplicates("a", "b", "a", "c", "b", "a", "d");
        printDuplicates2("a", "b", "a", "c", "b", "a", "d");
        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        Set<String> set2 = new HashSet<>();
        set2.add("b");
        set2.add("c");
        set2.add("d");
        Set<String> result = new HashSet<>();
        System.out.println(getIntersection(set1, set2));
        System.out.println(getIntersection2(set1, set2));
    }

    // Exercise 1
        /*
        for (String s: set) {
            System.out.println(s);
        }

        System.out.println("------");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    */

    // Exercise 2

    /*
    public static void increment(Set<Integer> set) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer i: set) {
            newSet.add(i + 1);
        }
        set.clear();
        set.addAll(newSet);

    }
     */

    public static void printWithoutDuplicates(String... array) {
        // Set<String> newSet = new HashSet<>(Arrays.asList(array)); Es lo mismo que el for el asList
        Set<String> newSet = new HashSet<>();
        for(String s: array) {
            newSet.add(s);
        }
        System.out.println(newSet);
    }

    public static void printDuplicates(String... array) {
        Set<String> setTemp = new HashSet<String>();
        Set<String> setDuplicates= new HashSet<String>();
        for(String s : array) {
            if (!setTemp.add(s)) {
                setDuplicates.add(s);
            }
        }
        System.out.println(setDuplicates);
    }

    public static void printDuplicates2(String... array) {
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        Set<String> set = new HashSet<String>(list);
        for(String s : set) {
            list.remove(s);
        }
        Set<String> setDuplicates = new HashSet<>(list);
        System.out.println(setDuplicates);
    }

    public static Set<String> getIntersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;

    }

    public static Set<String> getIntersection2(Set<String> set1, Set<String> set2) {
        Set<String> temp = new HashSet<>(set1);
        Set<String> result = new HashSet<>();
        for (String s : set2) {
            if (!temp.add(s)) {
                result.add(s);
            }
        }
        return result;
    }
}

