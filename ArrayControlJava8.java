package petStore;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayControlJava8 {
    public static void main(String[] args) {
        
//建立1~10格空陣列
        int[] scores = new int[10];
        System.out.println("新增資料:");
        /********************建立隨機資料進入******************/
        
//Java7
        /*
        for(int i=0 ; i<scores.length ; i++){
            scores[i] = new Random().nextInt(11);
            //Random()用法:
            //Random.nextInt(11)   : 隨機取0~10數字
            //Random.nextInt(11)+1 : 隨機取1~11數字
        }
        */
        
//Java8
        IntStream.range(0, scores.length).forEach(e -> {
            scores[e] = new Random().nextInt(11);
        });
        
        /************************顯示資料的各種方法: ************************/
        
//Java7 (for-loop)
        System.out.println("    Java7 (for-loop)");
        for(int i=0 ; i<scores.length ; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        
        
//Java7 (for-each)
        System.out.println("    Java7 (for-each)");
        for(int i : scores){
            System.out.print(i + " ");
        }
        System.out.println();
        
        
//Java8 (Array.Stream)
        System.out.println("    Java8 (Array.Stream)");
        Arrays.stream(scores).forEach(e -> System.out.print(e + " "));
        System.out.println();
        
        
//Java8 (IntStream.range)
        System.out.println("    Java8 (IntStream.range)");
        IntStream.range(0, scores.length).forEach((e) -> {
            System.out.print(scores[e] + " ");
        });
        System.out.println();
        System.out.println("\n\n總分與平均:");
        
        
        /******************************總分與平均: **************************/
        
//Java7 (for-each)
        System.out.println("    Java7 (for-each)");
        int sum = 0;
        for(int i : scores){
            sum += i;
        }
        double avg = (float)sum/scores.length;
        System.out.println("總分:" + sum + " 平均:" + avg);
        
        
//Java8 (Arrays.stream)
        System.out.println("    Java8 (Array.stream)");
        int sum2 = Arrays.stream(scores).sum();
        double avg2 = (float)sum2/scores.length;
        System.out.println("總分:" + sum2 + " 平均:" + avg2);
        
        
//Java8 (IntStream.range)
        System.out.println("    Java8 (IntStream.range)");
        int sum3 = IntStream
                .range(0, scores.length)
                .reduce(0 ,(total , e) -> total + scores[e]);
        double avg3 = (float)sum3/scores.length;
        System.out.println("總分:" + sum3 + " 平均:" + avg3);
        System.out.println("\n\n去除偶數:");
        
        
        
        
        /**********************去除偶數，取總數與平均: ***********************/
        
//(Java7 for-each)
        System.out.println("    Java7 (for-each)");
        int sum4 = 0;
        double avg4 = 0;
        int count4 = 0;
        for(int score : scores){
            if (score%2 == 1) {
                sum4 += score;
                ++count4;
            }
        }
        avg4 = (double)sum4/count4;
        System.out.println("總分:" + sum4 + " 平均:" + avg4);
        
//Java8 (Arrays.stream)
        System.out.println("    Java8 (Arrays.stream)");
        int sum5 = Arrays.stream(scores).filter(score -> score%2 == 1).sum();
        
//getAsDouble才能轉浮點數
        double avg5 = Arrays.stream(scores).filter(score -> score%2 == 1).average().getAsDouble(); 
        System.out.println("總分:" + sum5 + " 平均:" + avg5);
        
        System.out.println("\n\n去頭去尾取總分與平均:");
        
        
        
        /**********************去頭去尾取總分與平均: ***********************/
        
// Java8 Sorted()排序
        IntStream intStream = Arrays.stream(scores).sorted();
        int[] sortedScores = intStream.toArray(); //toArray回傳int陣列
        
//印出已排序陣列
        System.out.print("Sorted()排序陣列:");
        IntStream.range(0, sortedScores.length).forEach(i ->{
            System.out.printf("%d " , sortedScores[i]);
        });
        System.out.println();
        
//印出以排序陣列(去頭去尾)
        System.out.print("去頭去尾:");
        IntStream.range(1, sortedScores.length-1).forEach(i -> {
            System.out.printf("%d " , sortedScores[i]);
        });
        System.out.println("");
        
//平均
        int sum6 = IntStream.range(1, sortedScores.length-1).reduce(0,(total , i) -> total+sortedScores[i]);
        int count6 = (int)IntStream.range(1, sortedScores.length-1).count();
        double avg6 = (double)sum6/count6;
        System.out.printf("平均:%.2f\n" , avg);
        
    }
}
