

package task1;

//import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * phonebook
 */
public class phonebook {

    HashMap<String, String> phoneList = new HashMap<>();

    public String searchByPhone(String inputNumber) {
        
        for (Map.Entry<String, String> entry : phoneList.entrySet()) {
           String key = entry.getKey();
           String value = entry.getValue();

           if (key.equals(inputNumber)) {
            return key;
           }
        }
        return null;
    }

    public String searchByFIO(String inputFIO) {
        
        for (Map.Entry<String, String> entry : phoneList.entrySet()) {
           String key = entry.getKey();
           String value = entry.getValue();

            //Если есть добавочные телефоны - отделим ФИО от других данных
           String[] listContacts = value.split(", ");

           if (listContacts[0].equals(inputFIO)) {
            return key;
           }
        }
        return null;
    }
    
    public int add(String nameOfContact, String number, String Remark) {

        int result = 0;
        //При совпадении возвращает ключ
        String resultSearch = searchByFIO(nameOfContact);

        if ( resultSearch == null) {
            System.out.println("\n" + nameOfContact + " нет в справочнике. Добавляем как новый контакт. \n");
            insert(number, nameOfContact);
            result = 1;
        }
        else {
            //В справочнике есть ФИО, добавляем номер телефона
            String oldValue = phoneList.get(resultSearch);
            String newValue = oldValue + ", " + number +  ", " + Remark;
            //System.out.println("В справочнике есть ФИО, добавляем номер телефона: Old  Value = " + oldValue + " New = " + newValue); //del

            if (phoneList.replace(resultSearch, oldValue, newValue) == false) {
                result = 2;
                System.out.println("Добавить телефонный номер " + number + " не удалось");
                System.out.println("Key = " + resultSearch + "\t Old" + nameOfContact + " New = " + newValue);
            }
        }
        return result;
     } 

    public void printPhoneBook() {

        System.out.println("Тел. номер \t\t ФИО \t\t Дополнительные тел. номера.");
        for (Map.Entry<String, String> entry : phoneList.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "\t" +  value);
        }
        System.out.println();

    } 

    public void  insert(String inputPhoneNumber, String inputFIO) {

        phoneList.put(inputPhoneNumber, inputFIO);
    }
}

