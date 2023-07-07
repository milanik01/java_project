import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class homework_003 {
    
    public static void main(String[] args) {

        //funcList(10);
        planetCounter(10);
    
}
// Задание 1
// 1.Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение


static void funcList(int n){

    Random rand = new Random(10);
    
    ArrayList<Integer> list1 = new ArrayList<>(n);

    int sum=0;

    for (int i = 0; i < 10; i++) {

       list1.add(rand.nextInt(10));
       System.out.println(list1.get(i));
       sum=sum+list1.get(i);
        
    }
    System.out.println();
    

    Iterator itr = list1.iterator();
    while (itr.hasNext()) {
  
            int x = (Integer)itr.next();
            if (x %2==0)
                itr.remove();
        }


    System.out.print(list1);

    System.out.println();  
    System.out.println("Max "+Collections.max(list1));
    System.out.println("Min "+Collections.min(list1));
    System.out.println("Midle "+sum/n);
}


// Задание 2
// Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.
        
static void planetCounter(int n){
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        List<String> randPlanet = new ArrayList<String>(n);
        int[] counts = new int[listPlanets.size()];

        Random rand  = new Random();

        for (int i = 0; i < n; i++) {

            randPlanet.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.print(randPlanet.get(i)+ " ");
            counts[listPlanets.indexOf(randPlanet.get(i))]++;
        } 
        System.out.println();
         
        for (int j = 0; j < counts.length; j++) {
            System.out.printf("%s - %s\n", listPlanets.get(j), counts[j]);
        }

    Iterator itr1 = randPlanet.iterator();

    while (itr1.hasNext()) {
  
            String x = (String)itr1.next();            
            if(counts[listPlanets.indexOf(x)]>1){
                System.out.println(itr1);
                itr1.remove();
                counts[listPlanets.indexOf(x)]--;
            }
        }
        System.out.println();
        System.out.println(randPlanet);
        
    }

}
