//3) Реализовать простой калькулятор
/**
 * task3
 */
import java.util.Scanner;
public class task3 {

    public static int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public static int minus(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    public static double div(int firstNumber, int secondNumber) {

        return (double) firstNumber / (double) secondNumber;
    }

    public static int mul (int firstNumber, int secondNumber) {

        return firstNumber * secondNumber;
    }
    


    public static void main(String[] args) {
 
        try (Scanner iScanner = new Scanner(System.in)) {
         
                System.out.print("Введите первое число: ");
                int first = Integer.parseInt(iScanner.nextLine());
                System.out.print("Введите второе число: ");
                int second = Integer.parseInt(iScanner.nextLine());
                System.out.print("Введите действие:  + - * /  ");
                String action = iScanner.nextLine();

            switch (action) {

                case "+":
                System.out.println(first + " + " + second + " = " + sum(first, second));
                break;
                
                case "-":
                System.out.println(first + " - " + second + " = " + minus(first, second));
                break;

                case "/":
                System.out.println(first + " / " + second + " = " + div(first, second));
                break;

                case "*":
                System.out.println(first + " * " + second + " = " + mul(first, second));
                break;

                default:
                 System.out.println("Введено неизвестное действие.");
                 System.out.println(first + " + " + second + " = " + sum(first, second));
                 System.out.println(first + " - " + second + " = " + minus(first, second));
                 System.out.println(first + " / " + second + " = " + div(first, second));
                 System.out.println(first + " * " + second + " = " + mul(first, second));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}