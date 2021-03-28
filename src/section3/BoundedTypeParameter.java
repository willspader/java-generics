package section3;

public class BoundedTypeParameter {

    public static void main(String[] args) {
        Integer[] numbers = {5, 10, 15, 20, 25};

        int count = countGreaterThan(numbers, 15);

        Double[] doubles = {5.5, 10.5, 20.5};
        int count2 = countGreaterThan(doubles, 5.0);

        String[] strings = {"William", "Spader"};
        int count3 = countGreaterThan(strings, "Donato");

        System.out.println(count);
        System.out.println(count2);
        System.out.println(count3);
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T n) {
        int count = 0;
        for (T number : numbers) {
            if (number.compareTo(n) > 0) {
                count++;
            }
        }
        return count;
    }

    // multiple bounds example

    interface A {}
    interface B {}

    public static <T extends Comparable<T> & A & B> int countGreaterThan2(T[] numbers, T n) {
        int count = 0;
        for (T number : numbers) {
            if (number.compareTo(n) > 0) {
                count++;
            }
        }
        return count;
    }
}
