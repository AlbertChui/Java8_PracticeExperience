package algorithm;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Combination {

    public static void main(String[] args) {
        int num = 4;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                for(int k=1;k<=num;k++){
                    if(k != j && k != i && j != i){
                        System.out.printf("%d%d%d\n",i,j,k);
                    }
                }
            }
        }
    }
}

/*遺憾: 希望可以任意輸入四個數字去分析有幾種組合方式? 分別印出*/