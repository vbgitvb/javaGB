/*
 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

 /**
  * task2
  */

import java.io.FileWriter;
import java.io.IOException;

  public class task2 {
 
    //Вывод массива на экран
    public static void printArray(int[] array) {
        

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Добавление строки в указанный файл
    public static void printMsgToFile(String logNameOfFile, String text) {

        try (FileWriter logFile = new FileWriter(logNameOfFile, true)) {
            
            logFile.append(text);
            logFile.flush();
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }

    public static String convertArrayToString(int[] inputArray) {
        String resultString = "";

        for (int i = 0; i < inputArray.length; i++) {
            resultString = resultString + inputArray[i] + " ";
        }
        resultString = resultString + "\n";
    return resultString;
    }

    //Сортировка массива с возможностью записи каждого прохода в файл
    public static void bubleSort(int[] array, boolean logEnable, String logNameOfFile) {
        int arrayLenght = array.length;
        
        for (int i = 0; i < arrayLenght - 1; i++) {
            for(int j = 0; j < arrayLenght - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
            System.out.print("  " + (i+1) + "): ");    
            printArray(array);
            
            if(logEnable) {
                printMsgToFile(logNameOfFile, ("  " + (i+1) + "): "));
                printMsgToFile(logNameOfFile, convertArrayToString(array));
            }
        }
    }

    public static void main(String[] args) {

        int[] arraySorted = {12, 17, 3, 4, 19, 7, 3, 9, 5, 10};
        String logFile = "log.txt";

        
        System.out.print("Orig: ");
        printArray(arraySorted);

        //write the source array to a file
        printMsgToFile(logFile, "\nOrig: ");
        printMsgToFile(logFile, convertArrayToString(arraySorted));

        bubleSort(arraySorted, true, logFile);
       
        System.out.print(" Res: ");
        printArray(arraySorted);

        //write the result to a file
        printMsgToFile(logFile, " Res: ");
        printMsgToFile(logFile, convertArrayToString(arraySorted));

    }
 }