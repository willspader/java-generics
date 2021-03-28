package section4;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {

    public static void main(String[] args) {
        // ? Wildcards

        List<Integer> list2 = Arrays.asList(1, 2);
        List<Double> list3 = Arrays.asList(.5, 10.4);

        printNumbers(list2);
        printNumbers(list3);
    }


    public static void printNumbers(List<? extends Number> list) {
        list.forEach(System.out::println);
    }

}
