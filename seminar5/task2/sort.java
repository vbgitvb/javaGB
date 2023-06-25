package task2;

import java.util.Random;
/**
 * sort
 */
public class sort {

        //Заполняет массив случайными числами
        public static void fillRandomValue(int[] inputArray, int maxValue) {
            Random rnd = new Random(maxValue);
    
            for (int i = 0; i < inputArray.length; i++) {
                inputArray[i] = rnd.nextInt(maxValue);
            }
        }


        public static void heap(int[] inputArray) {

            
            
        }

    }