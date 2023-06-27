
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class homework_002 {
    public static void main(String[] args) throws SecurityException, IOException {

        String pathProject = System.getProperty("user.dir");
        showCurrentFiles(pathProject);

        int[] array = new int[]{9,8,7,6,5,4,3,2,1};
        
        String pathFile = pathProject.concat("/log.txt");

        System.out.println(pathFile);
       
        addListToFile(pathFile, showCurrentFiles2(pathProject), array);

    }
           
//1) Напишите метод, который определит тип (расширение) файлов из текущей папки и 
// выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла: 
// 4 Расширение файла: jpg
static void showCurrentFiles(String dirPath){
    File currentDir = new File(dirPath);
    int i = 1;
    for(String str:currentDir.list()){
        
        System.out.println(i+". "+str);
        i++;

         
    }
}

static String[] showCurrentFiles2(String dirPath){
    File currentDir = new File(dirPath);
    return currentDir.list();

}

// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после
//  каждой итерации запишите в лог-файл.


static void addListToFile(String filePath, String[] list, int[] arr) throws SecurityException, IOException{

        Logger logger = Logger.getLogger(homework_002.class.getName());
        FileHandler fh = new FileHandler("log.txt");

        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);

        try {
 
        int tmp;
        String strTemp;
        StringBuilder result = new StringBuilder();
        
        for (int j = 1; j < arr.length; j++){
            
                for (int i = 1; i < arr.length; i++){
                
                    if(arr[i-1]>arr[i]){
                        tmp = arr[i-1];
                        arr[i-1] = arr[i];
                        arr[i] = tmp;
                    }
                    
                    result.append(arr[i-1]);
                }
                result.append(arr[arr.length-1]);

            strTemp = result.toString(); 
            logger.info(strTemp);
            result.replace(0, arr.length, "");

            }
            } catch (Exception e) {
                logger.warning(e.getMessage());
            }

}

}