//Реализовать алгоритм сортировки слиянием(метод взять из Интернета)

import java.util.Random;

/**
 * task1
 * https://translated.turbopages.org/proxy_u/en-ru.ru.9b07fadc-648f1c59-20048b40-74722d776562/https/www.baeldung.com/java-merge-sort
 */
public class task1 {

    public static void fillRandomValue(int[] inputArray, int maxValue) {
        Random rnd = new Random(maxValue);

        for (int i = 0; i < inputArray.length; i++) {

            inputArray[i] = rnd.nextInt(maxValue);
        }
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {

            System.out.print(" " + inputArray[i]);
        }
        System.out.println();
        
    }

    public static void mergeSort(int[] inputArray) {

        
    }
    public static void main(String[] args) {
        
        int sizeOfArray = 10;
        int[] arrayOfNumber = new int[sizeOfArray];
        int maxRndValue = 51;

        fillRandomValue(arrayOfNumber, maxRndValue);
        printArray(arrayOfNumber);
        //System.out.println("Array = " + arrayOfNumber);

//        mergeSort(arrayOfNumber, sizeOfArray);
//        System.out.println("Result = " + arrayOfNumber);



    }

}