package edu.PedroDurand;

public class Inteiros implements Comparable<Inteiros> {
    private int number;

    public Inteiros(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Inteiros o) {
        return Integer.compare(this.number, o.getNumber());
    }

    @Override
    public String toString() {
        return "Inteiros{" +
                "number=" + number +
                '}';
    }
}
