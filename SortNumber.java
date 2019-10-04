package algorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortNumber {

    public static void main(String[] args) {
        System.out.println("原本數值:");
        int[] nums = {70, 90, 75, 60, 55};
        printNum(nums);
        System.out.println("--------------");
        //泡沫排序法: BubbleSort
        selectionSort(nums);
        printNum(nums);
        
    }

    //為什麼要加static?
    public static void printNum(int[] num) {
        IntStream.range(0, num.length).forEach(e -> System.out.print(num[e] + " "));
        System.out.println("");
    }

    public static void bubbleSort(int[] num) {
        //把極值比較出來，並丟到左右兩邊
        IntStream.range(1, num.length).forEach(count -> {
            IntStream.range(0, num.length - count).forEach(e -> {
                if (num[e] > num[e + 1]) {
                    int temp = num[e];
                    num[e] = num[e + 1];
                    num[e + 1] = temp;
                }
            });
        });
        /*泡沫排序法邏輯
        if (num[0] > num[1]) {
            int temp = num[0];
            num[0] = num[1];
            num[1] = temp;
        }
        if (num[1] > num[2]) {
            int temp = num[1];
            num[1] = num[2];
            num[2] = temp;
        }
        if (num[2] > num[3]) {
            int temp = num[2];
            num[2] = num[3];
            num[3] = temp;
        }
        if (num[3] > num[4]) {
            int temp = num[3];
            num[3] = num[4];
            num[4] = temp;
        }
         */
    }

    public static void selectionSort(int[] num) {
        //選出最小的數字，並直接把該數值與最左邊數值對調
        //步驟1，先找出最小值的位置(min_idx)
        //步驟2，把最小值位置的數值與最左邊的數值交換
        
        for(int count=0 ; count < num.length ; count++){
            int min_idx = count;
            for(int i=count+1 ; i < num.length ; i++){
                if(num[i] < num[min_idx]){
                min_idx = i;
                }
            }
            int min = num[min_idx];
            num[min_idx] = num[count];
            num[count] = min;
        }
        ??
        /*?*******這個好像是區域變數的問題，不知道怎麼解決?
        int min_idx = 0;
        IntStream.range(1, num.length).forEach(e ->{
            if (num[e] < num[min_idx]) {
                min_idx = e;
            }
        }); *****************************************/
        
        //基礎邏輯:
        /*int min_idx = 0;
        for(int i=1 ; i<num.length ; i++){
            if(num[i] < num[min_idx]){
                min_idx = i;
            }
        }
        int min = num[min_idx];
        num[min_idx] = num[0];
        num[0] = min;
        */
        
    }
}