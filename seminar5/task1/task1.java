// 1)Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать, 
// что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать,
// как одного человека с разными телефонами.

// Вывод должен быть отсортирован по убыванию числа телефонов. 
// (можно выводить без сортировки, но обязательно в отдельном методе)


package task1;
//import task1.phonebook;
/**
 * основная часть программы
 */
public class task1 {

    public static void main(String[] args) {
        
        
        phonebook myPhBook = new phonebook();

        
        
//        int result =  myPhBook.insert("123", "AAA aa AAA");
  


        // if ( == 0 ) {
        // System.out.println("Добавлен. Result = " + result);
        // myPhBook.printPhoneBook();
        // }

        myPhBook.insert("+79181112233", "Матвеев Андрей Михайлович");
        myPhBook.insert("+79182223344", "Егоров Игорь Николаевич");
        myPhBook.insert("+79183334455", "Ильюхин Евгений Петрович");
        //myPhBook.add("")

        myPhBook.printPhoneBook();



    }
}