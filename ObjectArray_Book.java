package every_array;
import bookstore.Books;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ObjectArray_Book {
    public static void main(String[] args) {
        Books b1 = new Books();
        Books b2 = new Books();
        
        b1.setName("Java");
        b1.setPrice(500);
        b2.setName("Kotlin");
        b2.setPrice(800);
        
        Books[] books = {b1,b2};
        System.out.println(books[0]);
        System.out.println(books[1]);
        ?
        //求總價格java8 為何不能這樣寫?
        /*
        int total = 0;
        Arrays.stream(books).forEach(e ->{
            total += e.getPrice();
        });
        */
        
        // Java8 - MapToInt()
        /*
        int sum = Arrays.stream(books).mapToInt(bookPrice -> bookPrice.getPrice()).sum();
        System.out.println(sum);
        */
        
        //Java8 - Reduce()
        System.out.println(IntStream.range(0, books.length).reduce(0,(total , i)-> total+=books[i].getPrice()));
        
    }
}
