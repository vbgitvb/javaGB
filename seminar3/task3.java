//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

/**
 * task3
 */
public class task3 {

    public static void fillRandom(ArrayList<Integer> inputList, int length, int maxValue) {
        Random randomInt = new Random();

        for (int i = 0; i < length; i++) {
            inputList.add(randomInt.nextInt(maxValue));
        }
    }


    public static ArrayList<Integer> calculateMinMaxMiddleOfList(ArrayList<Integer> inpuArrayList) {

        ArrayList<Integer> result = new ArrayList<>();
        int min = inpuArrayList.get(0);
        int max = min;
        int middle = min;

        if (inpuArrayList.size() == 0 ){
            result.add(0);
            result.add(0);
            result.add(0);

        } else if(inpuArrayList.size() == 1 ){
            result.add(min);
            result.add(min);
            result.add(min);
        
        } else {

            for (int i = 1; i < inpuArrayList.size(); i++) {
                if(min > inpuArrayList.get(i)) {
                    min = inpuArrayList.get(i);
                }
                else if(max < inpuArrayList.get(i)){
                    max = inpuArrayList.get(i);
                }
                middle = middle + inpuArrayList.get(i);
            }
            result.add(min);
            result.add(max);
            result.add(middle / inpuArrayList.size());
        }

        return result;
    }

    public static void main(String[] args) {
        
        int maxRandomNumber = 51;
        int sizeOfArray = 10;
        ArrayList<Integer> listNumber = new ArrayList<>();
        ArrayList<Integer> minMaxMidle = new ArrayList<>(3);
        
        fillRandom(listNumber, sizeOfArray, maxRandomNumber);
        System.out.println("Random array list: " + listNumber);

        minMaxMidle = calculateMinMaxMiddleOfList(listNumber);
        System.out.println("Min = " + minMaxMidle.get(0) + ", Max = " + minMaxMidle.get(1) + ", Middle = " + minMaxMidle.get(2));
    }
}