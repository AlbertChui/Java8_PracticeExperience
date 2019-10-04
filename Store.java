package petstore;

import java.text.ParseException;

public class Store {
    public static void main(String[] args) throws ParseException {
        Pets p1 = new Pets();
        Pets p2 = new Pets();
        p1.variety = "哈士奇";
        p1.color = "雪白";
        p1.birth = "2015/6/8";
        p1.calAge();
        p1.calMoney();
        System.out.printf("1.%s\n%s\n%s\n%d\n%d\n\n" , p1.variety , p1.color ,
                p1.birth , p1.age , p1.money);
        p2.variety = "柴犬";
        p2.color = "棕色";
        p2.birth = "2014/5/18";
        p2.calAge();
        p2.calMoney();
        System.out.printf("2.%s\n%s\n%s\n%d\n%d\n\n" , p2.variety , p2.color ,
                p2.birth , p2.age , p2.money);
    }
}
