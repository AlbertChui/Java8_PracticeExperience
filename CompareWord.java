package using_string_fution;

public class CompareWord {
    public static void main(String[] args) {
        String s1 = new String("Java");     
        String s2 = new String("Java");
        //String s3 = new String("java");
        //分不清楚兩者差異，記得確認!
        //String s4 = "Java";
        String s5 = "Java";
        String s6 = "jAVa";
        
        System.out.println(s1.equals(s2));//new出來的String物件要用equal函數
        System.out.println(s1.equals(s3));  //大小寫問題
        System.out.println(s4 == s1);       //?
        System.out.println(s4.equals(s1));  //?
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5)); 
        System.out.println(s4.equals(s6));  //大小寫問題
        System.out.println(s4.toUpperCase().equals(s6.toUpperCase())); //全部轉大寫後比較
        System.out.println(s4.compareToIgnoreCase(s6)); //忽視大小寫比較
    }
}
