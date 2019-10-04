package using_string_fution;

public class UsingStringBuilder {
    
    //為什麼這裡不加static就不能使用此函數??
    ->public static void update(String str){
        str = str+"Java8";
    }
    public static void stringBuilder(StringBuilder sb){
        sb.append("Java8");
    }
    
    public static void main(String[] args) {
        String s = "Hello! ";
        update(s);
        System.out.println(s);
        System.out.println("-------------------");
        StringBuilder s2 = new StringBuilder("Hello! ");
        stringBuilder(s2);
        System.out.println(s2);
        
    }
}
