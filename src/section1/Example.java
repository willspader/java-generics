package section1;

import java.util.ArrayList;

public class Example {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("2");

        for (Object object : arrayList) {
            System.out.println(object);
        }
    }

}
