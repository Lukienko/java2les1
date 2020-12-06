package Java2Les3;

import java.util.*;

public class Unique {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Yellow", "Green", "Blue", "Brown", "White",
                "Red", "Orange", "Pink", "Gray", "Black",
                "Beige", "Golden", "Emerald", "Coral", "Purple",
                "Blue", "Black", "Subaru", "Purple", "Orange"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}