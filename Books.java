package bookstore;

public class Books {
    String Name;
    int price;
    static String publisher = "Gotop";

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static String getPublisher() {
        return publisher;
    }

    public static void setPublisher(String publisher) {
        Books.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Books{" + "Name=" + Name + ", price=" + price + '}';
    }
    
    
}
