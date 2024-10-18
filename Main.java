import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordsToTest1 = new ArrayList<String>(Arrays.asList("an", "band", "band", "abandon"));
        WordChecker checker1 = new WordChecker(wordsToTest1);
        ArrayList<String> wordsToTest2 = new ArrayList<String>(Arrays.asList("to", "too", "stool", "tools"));
        WordChecker checker2 = new WordChecker(wordsToTest2);
        ArrayList<String> wordsToTest3 = new ArrayList<String>(Arrays.asList("catch", "bobcat", "catchacat", "cat", "at"));
        WordChecker checker3 = new WordChecker(wordsToTest3);
        System.out.println(checker1.isWordChain());
        System.out.println(checker2.isWordChain());
        System.out.println(checker3.createList("cat"));
        System.out.println(checker3.createList("catch"));
        System.out.println(checker3.createList("dog"));
    }
}