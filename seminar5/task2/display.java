package task2;

/**
 * console
 */
public class display {


    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  


    public static void printText(String inpuString) {

        System.out.println(inpuString);    
    }


    public static void printArray(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(" " + inputArray[i]);
            if ( (i+1) % 30 == 0 ) {
                System.out.println();
            }
        }
        System.out.println();
    }
}