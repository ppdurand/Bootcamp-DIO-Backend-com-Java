package edu.PedroDurand;

public class Student implements Comparable<Student>{
    private String name;
    private long registration;
    private double average;

    public Student(String name, long registration, double average) {
        this.name = name;
        this.registration = registration;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public long getRegistration() {
        return registration;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareToIgnoreCase(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                ", average=" + average +
                '}';
    }
}
