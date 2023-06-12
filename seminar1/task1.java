
// Вычислить сумма чисел от 1 до n

import java.util.Scanner;

/**
 * task1
 */
public class task1 {

    public static int calculateSumm(int number) {

        int summ = 0;
        while (number != 0) {
            summ = summ + number;
            number--;
        }
        return summ;
    }

    public static void main(String[] args) {
        String msgInputNotCorrect = "Введено не корректное значение. Повторите ввод.";
        String msgEnterPositivNumber = "Введите положительное число: ";
        String msgSumNumbers = "Сумма чисел от 1 до ";

        int nuberForSumm = 0;
        boolean isPositiv = true;
        try (Scanner iScanner = new Scanner(System.in)) {
            while (isPositiv) {
                System.out.print(msgEnterPositivNumber);
                nuberForSumm = iScanner.nextInt();
                if (nuberForSumm <= 0) {
                    System.out.println(msgInputNotCorrect);
                } else {
                    isPositiv = false;
                }
            }
            System.out.println(msgSumNumbers + nuberForSumm + " = " + calculateSumm(nuberForSumm));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
