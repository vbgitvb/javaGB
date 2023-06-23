//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

/**
 * task1
 */
public class task1 {

    public static void reverseList(LinkedList<Integer> inputList) {

        int lenght = inputList.size();
        for (int i = 0, j = lenght-1 ; i < lenght/2; i++, j--) {
            inputList.set(i, inputList.set(j, inputList.get(i)));
        }
    }

    public static void fillIntList(LinkedList<Integer> inputList, Integer lenght) {
        for (int i = 0; i < lenght; i++) {
            inputList.add(i);
        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Integer sizeOfList = 10;

        fillIntList(list, sizeOfList);
        System.out.println(list);

        reverseList(list);
        System.out.println(list);
    }
}