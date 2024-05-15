package edu.PedroDurand;

public class Main {
    public static void main(String[] args) {
        WordsCount map = new WordsCount();

        map.addWord("Java", 4);
        map.addWord("C#", 1);
        map.addWord("C", 6);
        map.addWord("Python", 3);
        map.addWord("JavaScript", 5);
        map.addWord("HTML", 7);

        System.out.println(map.mostFrequentlyWord());
        System.out.println(map.getWordCount());
        map.removeWord("HTML");
        System.out.println(map.mostFrequentlyWord());


    }
}