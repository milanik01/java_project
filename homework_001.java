
import java.util.Scanner;

public class homework_001 {
    public static void main(String[] args) {

       // System.out.println("Input number ");
       // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
       //summ(n); //сумма треугольного числа
       //ftrl(n); //факториал числа
       //prostye(); //простые числа до 1000
       //calc(); //простой калькулятор
       //uravnenie();
       

    }

    static void summ(int b){
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 

        int res = 0;
        for(int i=1; i<=b; i++){
            res = res +i; 
        }
        System.out.println("Треугольное число: "+res);

    }

    static void ftrl(int b){
// (произведение чисел от 1 до n)
        int res = 1;
        for(int i=1; i<=b; i++){
            res = res * i; 
        }
        System.out.println("Произведение чисел: "+res);

    }
    static void prostye(){
        // 2) Вывести все простые числа от 1 до 1000
        for(int i = 2; i<=1000; i++){
            int count = 0;
            for(int j = 2; j<=i; j++){

                if(i%j==0) count++;

            }
            if(count==1) System.out.println(i);
        }

    }
    static void calc(){
        // 3) Реализовать простой калькулятор
        System.out.println("Input first number ");
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        System.out.println("Select operation: \n 1 -> + \n 2 -> - \n 3 -> * \n 4 -> /");
        int oper = scan.nextInt();
        System.out.println("Input second number ");
        int n2 = scan.nextInt();
        double result = 0; 
        switch(oper){
            case 1: result=n1+n2;
                    break;                                
            case 2: result=n1-n2;
                    break;
            case 3: result=n1*n2;
                    break;
            case 4: result=n1/n2;
                    break;
        }
        System.out.println("Result "+result);
        scan.close();

    }

    static void uravnenie(){
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы
//  одно решение или сообщить, что его нет.

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input fist number ");
        String q = sc1.nextLine();
        System.out.println("Input second number ");
        String w = sc1.nextLine();
        System.out.println("Input answer ");

        // String q = "2?";
        // String w = "3?";
        int e = sc1.nextInt();
        int n1  = 0;
        int n2  = 0;
        int k1;
        int k2; 
        int x1 = 0;
        int x2 = 0;


        String[] number1 = q.split("");
        String[] number2 = w.split("");
        


        
        //System.out.println("Переменная number1: "+ number1);
        //System.out.println("Переменная number2: "+ number2);



        if (number1[0]=="?") { 
            n1 = Integer.parseInt(number1[1]); 
            k1 = 0;
        }
        else if (number1[1]=="?") {
             n1 = (Integer.parseInt(number1[0]) * 10);
             k1 = 1;
        }
        else k1 = 2;
        

        if (number2[0]=="?") {
            n2 = Integer.parseInt(number2[1]);
            k2 = 0;
        }


        else if (number2[1]=="?") {
            n2 = (Integer.parseInt(number2[0]) * 10);
            k2 = 1;
        }
        else k2 = 2;

        int tmp = e - (n1+n2);
        System.out.println("Переменная n1: "+ n1);
        System.out.println("Переменная n2: "+ n2);
    
        if(tmp<=10 && k1==1 && k2==1) {
            x1 = tmp/2;
            x2 = tmp - x1;
        }
        if(tmp>10 && k1==1 && k2==1) {
            System.out.println("<<Восстановить выражение невозможно!>>");
        }
        if(tmp<=10 && (k1==0 || k2==1)) System.out.println("<<Восстановить выражение невозможно!>>");
         if(tmp>10 && k1==0 && k2==1) {
            x1 = tmp%10;
            x2 = tmp - x1;
         }

         if(tmp>10 && k1==1 && k2==0) {
            x2 = tmp%10;
            x1 = tmp - x2;
         }

         System.out.println("Первая переменная: " + x1);
         System.out.println("Вторая переменная: " + x2);
         
    sc1.close();
    }
    
}
