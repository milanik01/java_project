
import java.util.*;
 
public class homework_006 {
   

    public static void main(String[] args) {
        
        Cat k1 = new Cat();
        k1.gender = "female";
        k1.age = 1;
        k1.name = "Molli";
        

        Cat k2 = new Cat();
        k2.gender = "male";
        k2.age = 2;
        k2.name = "Barsik";

      

    k1.setName();
    System.out.print(" ");
    k1.setAge();
    System.out.print(" age");

    System.out.println();

    k2.setName();
    System.out.print(" ");
    k2.setAge();
    System.out.print(" age");

    }
    }
//    Реализуйте класс Cat, включающий в себя от трех полей и от двух методов, 
//    определяющих базовый функционал класса(за основу можно взять наработки
//     с семинара). Создать два экземпляра класса Cat и вывести информацию о них 
//     на экран.
    

