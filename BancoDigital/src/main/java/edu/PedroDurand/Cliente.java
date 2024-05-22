package edu.PedroDurand;

public class Cliente {
    private long Id;
    private String name;

    public Cliente(long id, String name) {
        Id = id;
        this.name = name;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
