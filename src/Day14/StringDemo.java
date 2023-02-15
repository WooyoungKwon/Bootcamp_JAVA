package Day14;

import java.util.Arrays;
import java.util.Comparator;

public class StringDemo{
    public static void main(String[] args) {
        String[] strings = {"Hi", "Hello friend", "Hello friend professor1", "Hello friend professor2"};
//        String[] strings = {"Hello friend professor2", "Hello friend professor1", "Hello friend", "Hi"};
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (String s:strings){
                    System.out.print(s+"/");
                }
                System.out.println("\no1 : " + o1);
                System.out.println("o2 : " + o2);
                System.out.println("length : " + (o1.length() - o2.length()));
                System.out.println();
                return o2.length() - o1.length();
            }

        });

        for(String s : strings)
            System.out.println(s);
    }
}
