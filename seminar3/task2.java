//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * task2
 */
public class task2 {

    public static void fillRandom(List<Integer> inputList, int length, int maxValue) {
        Random randomInt = new Random();

        for (int i = 0; i < length; i++) {
            inputList.add(randomInt.nextInt(maxValue));
        }
    }

    public static void removeOdd(List<Integer> inpuList) {
        
        Iterator<Integer> num = inpuList.iterator();
        while(num.hasNext()){
            if(num.next() % 2 == 0) {
                num.remove();
            }
        }
    }

    public static void main(String[] args) {
        int sizeOfArray = 10;
        List<Integer> oddList = new ArrayList<>();
        int maxRandomNumber = 51;

        fillRandom(oddList, sizeOfArray, maxRandomNumber);
        System.out.println("Original list: " + oddList);
        removeOdd(oddList);
        System.out.println("Result list: " + oddList);

    }
}