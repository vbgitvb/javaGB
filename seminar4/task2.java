//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый

import java.util.LinkedList;

/**
 * task2
 */
public class task2 {

    //помещает в начало без удаления
    public static void addFirstPosition(LinkedList<Integer> inputList, int addElement) {

        inputList.addFirst(addElement);
    }

    //помещает элемент в конец очереди
    public static void enqueue(LinkedList<Integer> inputList, int inputValue) {

        inputList.addLast(inputValue);
    }

    //возвращает первый элемент из очереди и удаляет его
    public static Object dequeue(LinkedList<Integer> inputList) {
        int lenght = inputList.size();

        if(lenght == 0) {
            return null;
        }
        return inputList.pollFirst();
    }


    public static int first(LinkedList<Integer> inputList) {

        return inputList.get(0);
        
    }
    public static void main(String[] args) {
        
        LinkedList<Integer> queue = new LinkedList<>();

        addFirstPosition(queue, 1);
        System.out.println("Добавили первый элемент: " + queue);
        
        
        enqueue(queue, 2);
        System.out.println("Поместили в конец элемент: " + queue);

        System.out.println("Извлекаем первый элемент " + dequeue(queue) + " с удалением. Очередь: " + queue);
        
        System.out.println("Первый элемент без удаления " + first(queue) + ". Очередь: " + queue);

    }
}