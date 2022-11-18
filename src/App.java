import java.util.Collections;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<WordInfo> words = new LinkedList<WordInfo>();

        words.add(new WordInfo("apple", 1));
        words.add(new WordInfo("adam", 2));
        words.add(new WordInfo("and", 4));
        words.add(new WordInfo("and", 7));
        words.add(new WordInfo("an", 9));
        words.add(new WordInfo("artichoke", 11));
        words.add(new WordInfo("ambulance", 15));
        words.add(new WordInfo("actor", 17));
        words.add(new WordInfo("and", 19));
        System.out.println("BEFORE SORT:");
        printList(words);
        System.out.print("\n\n");
        Collections.sort(words);

        System.out.println("AFTER SORT:");
        printList(words);
    }

    public static void printList(LinkedList<WordInfo> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i).toString());
        }
    }
}
