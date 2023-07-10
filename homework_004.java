import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.ToIntFunction;

public class homework_004 {
    public static void main(String[] args) {
        summa();
       // proizvedenie();
    }
// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном 
// порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два 
// числа должны быть отрицательными.
// Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и 
// номером группы

static void summa(){

    Deque<String> myList1 = new LinkedList<>();
    Deque<String> myList2 = new LinkedList<>();
    Deque<String> myList3 = new LinkedList<>();

    Scanner input = new Scanner(System.in);
    System.out.println("Input first nomber");
    String  data1 = input.nextLine();
    System.out.println("Input second number");
    String  data2 = input.nextLine();
    String[] tmp1 =data1.split("");
    String[] tmp2 =data2.split("");
  
    for (int i = tmp1.length-1; i >=0; i--) {
        
        myList1.add(tmp1[i]);
        
    }
    for (int i = tmp2.length-1; i >=0; i--) {
        
        myList2.addLast(tmp2[i]);
        
    }

    System.out.println(myList1);
    System.out.println(myList2);

    int tmp3 = 0;
    int tmp4 = 0;
    int size = 0;
    String znak = "+";
    //int tmp5 = 0;
if(Integer.parseInt(data2)>Integer.parseInt(data1))
size = myList2.size();
else size = myList1.size();

//если сложение двух отрицательных чисел
   if(myList1.getLast().equals("-")&&myList2.getLast().equals("-")){

        myList1.removeLast();
        myList2.removeLast();
        znak="-";
        
   }

   //если первое число положительное а второе отрицательное 
   else if(!myList1.getLast().equals("-")&&myList2.getLast().equals("-")){
        myList2.removeLast();
        if(Integer.parseInt(data1)>(Integer.parseInt(data2)*(-1))){//первое число больше
            for (int i = 0; i < size; i++) {
                if(Integer.parseInt(myList1.getFirst())-tmp4<Integer.parseInt(myList2.getFirst())){

                    tmp3 = 10+Integer.parseInt(myList1.getFirst())-Integer.parseInt(myList2.getFirst())-tmp4;
                    tmp4 = 1;
                    myList3.addFirst(Integer.toString(tmp3));
                    myList1.removeFirst();
                    myList2.removeFirst();
                    System.out.println(tmp3);
                }
                else{
                    tmp3 = (Integer.parseInt(myList1.getFirst()) - Integer.parseInt(myList2.getFirst()))%10-tmp4;
                    System.out.println(tmp3);
                    myList3.addFirst(Integer.toString(tmp3));
                    myList1.removeFirst();
                    myList2.removeFirst();
                    }

            }

        }
        else if(Integer.parseInt(data1)<(Integer.parseInt(data2)*(-1))){//второе число больше
            tmp4=0;
            znak="-";
            for (int i = 0; i < size; i++) {
                if(Integer.parseInt(myList2.getFirst())<Integer.parseInt(myList1.getFirst())){

                    tmp3 = 10+Integer.parseInt(myList2.getFirst())-Integer.parseInt(myList1.getFirst())-tmp4;
                   
                    myList3.addFirst(Integer.toString(tmp3));
                    tmp4 = 1;
                    myList1.removeFirst();
                    myList2.removeFirst();
                    System.out.println(Integer.parseInt(myList2.getFirst()+" - "+Integer.parseInt(myList1.getFirst())+" = "+tmp3));
                }
                else{
                tmp3 = (Integer.parseInt(myList2.getFirst()) - Integer.parseInt(myList1.getFirst()))%10-tmp4;
                
                //System.out.println(Integer.parseInt(myList2.getFirst()+" - "+Integer.parseInt(myList1.getFirst())+" = "+tmp3));
                myList3.addFirst(Integer.toString(tmp3));
                myList1.removeFirst();
                myList2.removeFirst();
                }

            }
        
        }


        if(znak=="-") myList3.addFirst("-");
        System.out.println(myList3);

   }

   //первое число отрицательное, а второе положительное
   else if(myList1.getLast().equals("-")&&!myList2.getLast().equals("-")){
        myList1.removeLast();
        if(Integer.parseInt(data1)*(-1)>(Integer.parseInt(data2))){//первое число больше
           znak="-";
            for (int i = 0; i < size; i++) {
                if(Integer.parseInt(myList1.getFirst())-tmp4<Integer.parseInt(myList2.getFirst())){

                    tmp3 = 10+Integer.parseInt(myList1.getFirst())-Integer.parseInt(myList2.getFirst())-tmp4;
                    tmp4 = 1;
                    myList3.addFirst(Integer.toString(tmp3));
                    myList1.removeFirst();
                    myList2.removeFirst();
                    System.out.println(tmp3);
                }
                else{
                    tmp3 = (Integer.parseInt(myList1.getFirst()) - Integer.parseInt(myList2.getFirst()))%10-tmp4;
                    System.out.println(tmp3);
                    myList3.addFirst(Integer.toString(tmp3));
                    myList1.removeFirst();
                    myList2.removeFirst();
                    }

            }

        }
        else if(Integer.parseInt(data1)*(-1)<(Integer.parseInt(data2))){//второе число больше
            
            
            for (int i = 0; i < size; i++) {
                if(Integer.parseInt(myList2.getFirst())<Integer.parseInt(myList1.getFirst())){

                    tmp3 = 10+Integer.parseInt(myList2.getFirst())-Integer.parseInt(myList1.getFirst())-tmp4;
                   
                    myList3.addFirst(Integer.toString(tmp3));
                    tmp4 = 1;
                    myList1.removeFirst();
                    myList2.removeFirst();
                    System.out.println(Integer.parseInt(myList2.getFirst()+" - "+Integer.parseInt(myList1.getFirst())+" = "+tmp3));
                }
                else{
                tmp3 = (Integer.parseInt(myList2.getFirst()) - Integer.parseInt(myList1.getFirst()))%10-tmp4;
                
                //System.out.println(Integer.parseInt(myList2.getFirst()+" - "+Integer.parseInt(myList1.getFirst())+" = "+tmp3));
                myList3.addFirst(Integer.toString(tmp3));
                myList1.removeFirst();
                myList2.removeFirst();
                }

            }
        
        }


        if(znak=="-") myList3.addFirst("-");
        System.out.println(myList3);

   }

   
   
    for (int i = 0; i < size; i++) {//если сложение двух положительных чисел
         
            // if(myList1.getLast().equals("-")&&!myList2.getLast().equals("-")&&Integer.parseInt(data2)>Integer.parseInt(data1)){
            //     myList1.removeLast();
            // }

            tmp3 = (Integer.parseInt(myList1.getFirst()) + Integer.parseInt(myList2.getFirst()))%10+tmp4;
            tmp4 = (Integer.parseInt(myList1.getFirst()) + Integer.parseInt(myList2.getFirst()))/10;
            myList3.addFirst(Integer.toString(tmp3));
            //System.out.println(tmp3);
            myList1.removeFirst();
            myList2.removeFirst();

         }


    if(znak=="-") myList3.addFirst("-");
    System.out.println(myList3);

    input.close();
}


static void proizvedenie(){

    Deque<String> myList1 = new LinkedList<>();
    Deque<String> myList2 = new LinkedList<>();
    Deque<String> myList3 = new LinkedList<>();
    Deque<String> myList4 = new LinkedList<>();

    Scanner input = new Scanner(System.in);
    System.out.println("Input first nomber");
    String  data1 = input.nextLine();
    System.out.println("Input second number");
    String  data2 = input.nextLine();
    String[] tmp1 =data1.split("");
    String[] tmp2 =data2.split("");
    

    for (int i = tmp1.length-1; i >=0; i--) {
        
        myList1.add(tmp1[i]);
        
    }
    for (int i = tmp2.length-1; i >=0; i--) {
        
        myList2.addLast(tmp2[i]);
        
    }
    System.out.println(myList1);
    System.out.println(myList2);

    int tmp3 = 0;
    int tmp4 = 0;
    int tmp5 = 0;
    int razr = 1;
    int result = 0;
    int count = 1;

       for (String item1 : myList1) {
        for (String item2 : myList2) {

            tmp3 = Integer.parseInt(item1)*Integer.parseInt(item2);
            //System.out.printf("%d * %d -> %d ",Integer.parseInt(item1), Integer.parseInt(item2), tmp3 );
            tmp3=tmp3+tmp4;
            //System.out.println("mp3+tmp4 ="+tmp3);

            if(tmp3>9){
               tmp5 = tmp3;
               tmp3 = tmp3%10;
               tmp4 = tmp5/10;

               
               myList3.addFirst(Integer.toString(tmp3)+"~"+Integer.toString(razr));
               //System.out.println(tmp3);
            }
            else{
            tmp4 = 0;
            myList3.addFirst(Integer.toString(tmp3)+"~"+Integer.toString(razr));// добавляем элемент и метку разряда в список
            //System.out.println(tmp3);
            }
            razr++; 
               
        }
        if(tmp4>0) myList3.addFirst(Integer.toString(tmp4)+"~"+Integer.toString(razr));
          tmp4=0;
          count++;
          razr=count;  
        }
        //System.out.println("myList3 "+myList3);
        String[] size1 = myList3.getFirst().split("~");
        int size = Integer.parseInt(size1[1])+1;
        int resultTmp = 0;
        String [] temp; 

            for (int i = 1; i <size; i++) {
                for (String item : myList3) {
                    
                temp = item.split("~");
                if(Integer.parseInt(temp[1])==i) result+=Integer.parseInt(temp[0]);
                   
                }
                if(result>9){ 
                    resultTmp = result;
                    result=result%10;
                    myList4.addFirst(Integer.toString(result));
                    result = resultTmp/10;
                }else{
                    myList4.addFirst(Integer.toString(result));
                    result = 0;
                }
            } 

        System.out.println(myList4);
        input.close();
  
}

}

