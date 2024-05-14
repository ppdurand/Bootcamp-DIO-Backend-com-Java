package edu.PedroDurand;

import java.util.Map;

public class WordsCount {
    private Map<String, Integer> wordCount;

    public WordsCount(Map<String, Integer> wordCount) {
        this.wordCount = wordCount;
    }

    public Map<String, Integer> getWordCount() {
        return wordCount;
    }

    public void addWord(String word, Integer count){
        wordCount.put(word, count);
    }

    public void removeWord(String word){
        wordCount.remove(word);
    }

    public Map.Entry<String, Integer> mostFrequentlyWord(){
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }
}
