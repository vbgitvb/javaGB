/**
 * task2
 */
// Вывести все простые числа от 1 до 1000

public class task2 {
    
    public static void calcPrimeNumber(int number) {
        
        String msgPrime1 = "1 не является простым числом";
        String msgPrime2 = "Единственное простое число - 2";
        String msgPrime = "Простые числа: ";
        int countOutput = 0;
        switch (number) {

            case 1:
                System.out.println(msgPrime1);
                break;

            case 2:

                System.out.println(msgPrime2);
                break;

            default:
                System.out.print(msgPrime + "2 ");
                for (int i = 3; i <= number; i+=2) {
                    //System.out.println("i = " + i);
                    boolean isPrime = true;
                    for (int j = 3; j <= i / 2; ++j) {
                        if(i % j ==0){
                            isPrime = false;
                            break;
                        }
                    }
                
                if(isPrime) {
                    System.out.print(i + " ");
                    if(countOutput++ == 11) {
                        countOutput = 0;
                        System.out.println();
                    }
                }
                }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        

        int findToNumber = 1000;
        calcPrimeNumber(findToNumber);

    }
}