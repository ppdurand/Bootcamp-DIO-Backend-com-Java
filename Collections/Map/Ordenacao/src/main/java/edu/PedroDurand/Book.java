package edu.PedroDurand;

public class Book {
    private String name;
    private String author;
    private Double preco;


    public Book(String name, String author, Double preco) {
        this.name = name;
        this.author = author;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", preco=" + preco +
                '}';
    }
}
