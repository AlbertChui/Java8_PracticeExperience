package every_array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DynamicArray_Score {
    public static void main(String[] args) {
        /*靜態跟動態的差別?*/

        //靜態
        int[] scores = {100,90,90,80,60};
        for(int score : scores){
            System.out.print(score + " ");
        }
        System.out.println();
        //動態 Java8-List (List<Integer> 指定asList()內的陣列型別為Integer) (不加的話預設為Integer)
        List<Integer> scores2 = Arrays.asList(100,90,90,80,60);
        scores2.forEach(e->System.out.printf(e + " "));
        System.out.println("\n--------------------");
        ?
        //想詢問老師怎麼使用?
        //1. Set<String> scores3 = Stream.of("100,90,90,80,60").collect(Collectors.toSet());
        //這樣並沒有去除重複值?
        //2. Set<Integer> scores3 = Stream.of(100,90,90,80,60).collect(Collectors.toSet());
        //這樣雖然去除了但為何80跑到第一個?
        //3. Set<Integer> scores3 = Stream.of(scores).collect(Collectors.toSet());
        //這樣會多出一個[]，重複值也沒去除?
        //4. Set scores3 = Stream.of(scores).collect(Collectors.toSet());
        //這樣變成記憶體位置?
        
        
        //動態 Java8-set(陣列內重複值去除) //必須利用Stream.of指定集合，並用collect函數收集集合並回傳給特定型別的變數
        Set<String> scores3 = Stream.of("100","90","90","80","60").collect(Collectors.toSet());
        scores3.forEach(e->System.out.printf(e + " "));
        System.out.println("\n--------------------");
        
        //動態 Java8-Liset stream運算(cpu)
        List<Integer> scores4 = Arrays.asList(100,90,90,80,60);
        scores4.stream().forEach(e->System.out.printf(e + " "));
        
    }
}
