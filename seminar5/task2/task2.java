
// Реализовать алгоритм пирамидальной сортировки (HeapSort)(найти метод в Интернете и включить в проект)

package task2;

/**
 * task2
 */
public class task2 {

    public static void main(String[] args) {

        int sizeOfArray = 20;
        int[] arrayOfNumber = new int[sizeOfArray];
        int maxRndValue = 100;

        display.clearScreen();

        display.printText("Исходный массив:");
        sort.fillRandomValue(arrayOfNumber, maxRndValue);
        display.printArray(arrayOfNumber);

        sort.heap(arrayOfNumber);
        display.printText("Отсортированный массив:");
        display.printArray(arrayOfNumber);


    }

}