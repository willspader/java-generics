package section4;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UnboundedBoundedWildcards {

    public static void main(String[] args) {
        // ? Wildcards

        List<Object> list = Arrays.asList("11", 2, new Date());
        List<Integer> list2 = Arrays.asList(1, 2);
        List<String> list3 = Arrays.asList("1", "2");

        print(list);
        print(list2);
        print(list3);
    }


    public static void print(List<?> list) {
        list.forEach(System.out::println);
    }
}
