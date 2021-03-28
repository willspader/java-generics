package section3;

public class GenericAndMethods {

    public static void main(String[] args) {
        String[] strings = {"William", "Spader"};
        Character[] initials = {'W', 'S'};

        print(strings);
        print(initials);
    }

    public static <T> void print(T[] array) {
        for (T object : array) {
            System.out.println(object.getClass().getName() + " - " + object);
        }
    }

}
