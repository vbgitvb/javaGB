import java.util.HashSet;

/**
 * task1
 */
public class task1 {

    
    public static void main(String[] args) {
        
        NoteBook firstNB = new NoteBook(1, "ASUS", "N52", "Черный", "15,6", 
                        "1280x1024", 4096, 512, "Dos", 6000);
        NoteBook secondNB = new NoteBook(2, "ASUS", "x30", "Черный", "14", 
                        "1920x1080", 16384, 512, "Windows 10", 45000);

        NoteBook thirdNB = new NoteBook(1, "ASUS", "N52", "Черный", "15,6", 
                        "1280x1024", 4096, 512, "Dos", 6000);                        

        System.out.println(firstNB);
        System.out.println(secondNB);

        if(firstNB.equals(secondNB)) {
            System.out.println("1 и 2 ноутбуки похожи");
        }
            else {
                System.out.println("1 и 2 ноутбуки разные");
            }
        
        if(firstNB.equals(thirdNB)) {
            System.out.println("1 и 3 ноутбуки похожи");
        }
            else {
                System.out.println("1 и 3 ноутбуки разные");
            }

        HashSet<NoteBook> nbSet = new HashSet<NoteBook>();
        nbSet.add(firstNB);
        nbSet.add(secondNB);
        nbSet.add(thirdNB);

        System.out.println(nbSet.contains(secondNB));
    }
}