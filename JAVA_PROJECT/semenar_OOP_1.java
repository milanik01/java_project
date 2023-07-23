
// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, 
// содержащий в себе методы initProducts (List <Product>) сохраняющий в себе 
// список исходных продуктов и getProduct(String name)
package JAVA_PROJECT;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class semenar_OOP_1 {
    public static void main(String[] args) {

    // Tovar tovar1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10), 50);
    // Tovar tovar2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10), 50);
    // Tovar tovar3 = new Food("Snikers",60, 15, new GregorianCalendar(2023, 10, 10), 50);


    Automat list = new Automat();
    List<Tovar> myList = new ArrayList<>();
    
    // myList.add(tovar1);
    // myList.add(tovar2);
    // myList.add(tovar3);

    list.iniTovar(myList);

    String name = "Twix";
    //System.out.println(list.getTovar(name).toString());


    HotBeverage tovar4 = new HotBeverage("Coffee", 100, 30,new GregorianCalendar(2023,10,10), 80, 80);
    HotBeverage tovar5 = new HotBeverage("Tea", 100, 30, new GregorianCalendar(2023,10,10), 100, 60);
    HotBeverage tovar6 = new HotBeverage("Milk", 100, 30, new GregorianCalendar(2023,10,10), 150, 50);

    AutomatHotBeaverege list1 = new AutomatHotBeaverege();
    List<HotBeverage> myList1 = new ArrayList<>();


     myList1.add(tovar4);
     myList1.add(tovar5);
     myList1.add(tovar6);

    list1.initHotBeverages(myList1);

    String name1 = "Coffee";
    
    System.out.println(list1.getHotBeverage(name1, 80,80).toString());

    
    }
    
}
