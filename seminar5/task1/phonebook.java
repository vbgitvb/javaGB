

package task1;

//import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * phonebook
 */
public class phonebook {

    HashMap<String, String> phoneList = new HashMap<>();


    // public static readFromFile(String nameOfFile) {
        
    // }

    // public static int searchPhone() {
        
        
    //     return 0;
    // }

    // public static int searchFIO() {
        
        
    //     return 0;
    // }


    // public static String getFIO(double phoneNumber) {
        
    //     for(phoneList   .Entry<Double, String>)

    //     return "";
    // }

    public void printPhoneBook() {

        for (Map.Entry<String, String> entry : phoneList.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Phone number = " + key + " FIO = " + value);
        }
    } 

    public int insert(String inputPhoneNumber, String inputFIO) {

        phoneList.put(inputPhoneNumber, inputFIO);

    
     
        return 0;
    }
}

