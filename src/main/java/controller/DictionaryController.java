package controller;

import model.Dictionary;
import view.DictionaryView;

public class DictionaryController implements DictionaryControllerImp {
    private final Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();

        // Example: Hardcode some initial data words and their meanings
        dictionary.addWord("apple", "A fruit that grows on trees.");
        dictionary.addWord("car", "A vehicle with four wheels.");
        dictionary.addWord("house", "A building where people live.");
        dictionary.addWord("dog", "A domestic animal.");
        dictionary.addWord("CAT", "A domestic animal.");
    }

    // Method to add a word and its meaning to the dictionary
    @Override
    public void addWord(String word, String meaning) {
        dictionary.addWord(word, meaning);
    }

    // Method to search for a word in the dictionary and retrieve its meaning
    @Override
    public String searchWord(String word) {
        return dictionary.searchWord(word);
    }

    public static void main(String[] args) {
        DictionaryView.launch(DictionaryView.class);
    }
}

