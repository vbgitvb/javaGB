//Реализовать алгоритм сортировки слиянием(метод взять из Интернета)

import java.util.Random;


public class task1 {

    //Заполняет массив случайными числами
    public static void fillRandomValue(int[] inputArray, int maxValue) {
        Random rnd = new Random(maxValue);

        for (int i = 0; i < inputArray.length; i++) {

            inputArray[i] = rnd.nextInt(maxValue);
        }
    }

    //вывод элементов массива на консоль
    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {

            System.out.print(" " + inputArray[i]);
        }
        System.out.println();
        
    }

    //слияние половинок
    public static void merge(int[] totalArray, int[] leftHalfOfArray, int[] rightHalfOfArray, int leftLen, int rightLen) {

        int i = 0;      //left point
        int j = 0;      //right point
        int k = 0;      //total point

        while (i < leftLen && j < rightLen) {
            if (leftHalfOfArray[i] <= rightHalfOfArray[j]) {
                totalArray[k++] = leftHalfOfArray[i++];
            }
            else {
                totalArray[k++] = rightHalfOfArray[j++];
            }
        }
        while (i < leftLen) {
            totalArray[k++] = leftHalfOfArray[i++];
        }
        while (j < rightLen) {
            totalArray[k++] = rightHalfOfArray[j++];
        }

    }

    //разделение массива на половинки
    public static void mergeSort(int[] inputArray) {
        int length = inputArray.length;

        if (length < 2) {
            return;
        }
        int middleLenght = length / 2;
        int[] leftHalf = new int[middleLenght];
        int[] rightHalf = new int[length - middleLenght];
        
        for (int i = 0; i < middleLenght; i++) {
            leftHalf[i] = inputArray[i];
        }
         
        for (int i = middleLenght; i < length; i++) {
            rightHalf[i-middleLenght] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf, middleLenght, length - middleLenght);
        
    }

    public static void main(String[] args) {
        
        int sizeOfArray = 20;
        int[] arrayOfNumber = new int[sizeOfArray];
        int maxRndValue = 100;

        fillRandomValue(arrayOfNumber, maxRndValue);
        System.out.print(" Array: ");
        printArray(arrayOfNumber);

        mergeSort(arrayOfNumber);
        System.out.print("Sorted: ");
        printArray(arrayOfNumber);
    }
}