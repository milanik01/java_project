
import java.util.Scanner;

public class homework_0001 {
    public static void main(String[] args) {

       // System.out.println("Input number ");
       // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
       //summ(n); //сумма треугольного числа
       //ftrl(n); //факториал числа
       //prostye(); //простые числа до 1000
       //calc(); //простой калькулятор
       
       

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

    
    
}
