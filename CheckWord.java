package using_string_fution;

public class CheckWord {

    public static void main(String[] args) {
        String words = "Habit is second nature!";

        //indexOf() 找到指定字串的位置，若沒有則回傳-1
        String keyword = "s";       //測試
        System.out.println(words.indexOf(keyword));
        String keyword2 = "is";     //字串有用
        System.out.println(words.indexOf(keyword2));
        String keyword3 = "w";      //找不到回傳-1
        System.out.println(words.indexOf(keyword3));
        String keyword4 = "h";      //大小寫有差!!
        System.out.println(words.indexOf(keyword4));
        String keyword5 = "!";      //符號可以
        System.out.println(words.indexOf(keyword5));
        
        //contain 檢查目標若有此字串，回傳boolean值!
        System.out.println(words.contains("Habit"));//測試
        System.out.println(words.contains("Hab"));  //片段單字可以!
        System.out.println(words.contains(" "));    //空白鍵也可以!
        System.out.println(words.contains("Habti"));//拼錯不行!
        System.out.println(words.contains("!"));    //符號可以
        
        
    }

}
