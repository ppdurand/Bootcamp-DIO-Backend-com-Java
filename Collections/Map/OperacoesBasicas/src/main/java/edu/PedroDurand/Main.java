package edu.PedroDurand;

public class Main {
    public static void main(String[] args) {
        Dictionary map = new Dictionary();

        map.addWord("Saudade", "Sentimento de sentir falta");
        map.addWord("Caneca", "Objeto em formato cilíndrico onde geralmente se bebe agua");

        System.out.println(map.getWords());
        System.out.println(map.searchWord("Saudade"));
        map.removeWord("Saudade");

        System.out.println(map.getWords());
    }
}