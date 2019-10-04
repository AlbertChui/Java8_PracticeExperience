package using_string_fution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringArray_Split {
    public static void main(String[] args) {
        String words = "Habit is second nature!";
        System.out.println(words.length());
        // 字串函示 split("") 依照框框內的字元分割成一個字串陣列
        String[] wordArray = words.split(" ");
        
        Arrays.stream(wordArray).forEach(System.out::println);
        System.out.println(wordArray.length);
    }
    
}
