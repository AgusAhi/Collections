import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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

        printWithoutDuplicates("a", "b", "c", "a", "c", "b");




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
}

