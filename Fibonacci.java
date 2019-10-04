package algorithm;

public class Fibonacci {
    //F{n}=F{{n-1}}+F{{n-2}}（n≧2）
    public static long f(long n){
        
        if(n==0 || n==1){
            return n;
        }
        
        return f(n-1) + f(n-2);
    } 
    
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.f(20));
    }
}
