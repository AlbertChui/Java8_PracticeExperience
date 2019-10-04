package petstore;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pets {
    //列出Pets物件內的屬性
    String variety;
    String color;
    String birth;
    int money = 500;
    int age;
    
    //計算age
    public void calAge() throws ParseException{
        Date today = new Date();
        Date petBirth = new SimpleDateFormat("yyyy/mm/dd").parse(birth);
        this.age = 
                (int) (TimeUnit.DAYS.convert(today.getTime() - petBirth.getTime()
                        ,TimeUnit.MILLISECONDS)/365);
        }       
    
    //計算價格
    public int calMoney(){
        for(int i=0 ;i < this.age ;i++){
            money += i*100;
        }
        return money;
    }
    
    //得出價格與年紀
    public int getAge(){
        return age;
    }
    public int getMoney(){
        return money;
    }
}
    