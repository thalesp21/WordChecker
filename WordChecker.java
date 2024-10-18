import java.util.ArrayList;

public class WordChecker
{
    /** Initialized in the constructor and contains no null elements */
    private ArrayList<String> wordList = new ArrayList<>();

    public WordChecker(ArrayList<String> listIn) {
        wordList = listIn;
    }

    /**
    * Returns true if each element of wordList (except the first) contains the previous
    * element as a substring and returns false otherwise, as described in part (a)
    * Precondition: wordList contains at least two elements.
    * Postcondition: wordList is unchanged.
    */
    public boolean isWordChain() {
        /* to be implemented in part (a) */
        for (int i = 0; i < (wordList.size()-1); i++) {
            if ( !( wordList.get(i+1).contains( wordList.get(i) ) ) ) {
                return false;
            }
        }
        return true;
    }

    /**
    * Returns an ArrayList<String> based on strings from wordList that start
    * with target, as described in part (b). Each element of the returned ArrayList has had
    * the initial occurrence of target removed.
    * Postconditions: wordList is unchanged.
    * Items appear in the returned list in the same order as they appear in wordList.
    */
    public ArrayList<String> createList(String target) {
        /* to be implemented in part (b) */
        ArrayList<String> resultList = new ArrayList<String>();
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).length() >= target.length()) {
                if (wordList.get(i).substring(0, target.length()).equals(target)) {
                    resultList.add(wordList.get(i).substring(target.length(), wordList.get(i).length()));
                }
            }
        }
        return resultList;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}