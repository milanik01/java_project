import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;


public class homework_005 {
    public static void main(String[] args) {

        phoneBookPrint();
        
    }
 
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут 
// повторяющиеся имена с разными телефонами, их необходимо считать, 
// как одного человека с разными телефонами. Вывод должен быть отсортирован по
//  убыванию числа телефонов.
//в качестве ключей имена значения телефон сделать возможность добавления элементов
//меню из 4 элементов добавить, вывести, выйти, найти (удалить по желанию)
static void phoneBookPrint(){

Map<String, ArrayList<Integer>> phoneBook = new TreeMap<String, ArrayList<Integer>>();//(Collections.reverseOrder());
      
        phoneBook.put("Somov",new ArrayList<>());
        phoneBook.get("Somov").add(1);
        phoneBook.put("Morozov",new ArrayList<>());
        phoneBook.get("Morozov").add(3);
        phoneBook.put("Runin",new ArrayList<>());
        phoneBook.get("Runin").add(2);
        phoneBook.put("Ivanova",new ArrayList<>());
        phoneBook.get("Ivanova").add(9);
        phoneBook.put("Dororhov",new ArrayList<>());
        phoneBook.get("Dororhov").add(5);
        phoneBook.put("Ivanov", new ArrayList<>());
        phoneBook.get("Ivanov").add(8);
        phoneBook.get("Ivanov").add(4);

    
while(true){

Scanner input = new Scanner(System.in);
System.out.println("Select menu: \n 1. Output all phone book\n 2. Search phone\n 3.Add Phone number or abonent\n 4. Delete abonent \n 5. Exit ");
String menu = input.nextLine();



switch (menu) {
    case "1": 

 SortedMap<String,ArrayList<Integer>> sizes = new TreeMap<String,ArrayList<Integer>>(Collections.reverseOrder());
    
 for (String item : phoneBook.keySet()) {
    System.out.println(sizes.values());  
        ArrayList<Integer> phone = phoneBook.get(item);
       
        System.out.print(item);
        System.out.print(phone);
        System.out.println();

    
    }
    
          break;

    case "2":
            System.out.println("Input surname: ");
            String searchName = input.nextLine();
            
            if(phoneBook.containsKey(searchName))              
                System.out.println(phoneBook.get(searchName));
            else System.out.println("Нет человека с такой фамилией в телефонной книге");
           
        break;

    case "3":
            System.out.println("Input surname: ");
            String name = input.nextLine();

            System.out.println("Input phone namber: ");
            int phonenum = Integer.parseInt(input.nextLine());
        
            if(phoneBook.containsKey(name)){
                phoneBook.get(name).add(phonenum);
            } else{
                phoneBook.put(name, new ArrayList<>());
                phoneBook.get(name).add(phonenum);
            }
            
            for(Map.Entry <String, ArrayList<Integer>> phone: phoneBook.entrySet()){
            System.out.printf("Surname %s, Phone number %s\n", phone.getKey(),phone.getValue());
            }

        
        break;
    case "4":
            System.out.println("Input surname: ");
            String deleteName = input.nextLine();
            
            if(phoneBook.containsKey(deleteName)){
                 phoneBook.remove(deleteName);
            for(Map.Entry <String, ArrayList<Integer>> phone: phoneBook.entrySet()){
            System.out.printf("Surname %s, Phone number %s\n", phone.getKey(),phone.getValue());
            }   
            }
            else System.out.println("Нет такого аббанента ");

    case "5":
        input.close();
       return;


    default:
        break;
}


//input.close();
}
}
}



