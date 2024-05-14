package edu.PedroDurand;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> words;

    public Dictionary() {
        this.words = new HashMap<>();
    }

    public Map<String, String> getWords() {
        return words;
    }

    public void addWord(String word, String definition){
        words.put(word, definition);
    }

    public void removeWord(String word){
        words.remove(word);
    }

    public String searchWord(String word){
        return words.get(word);
    }
}

