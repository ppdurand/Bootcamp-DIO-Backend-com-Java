package edu.PedroDurand;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    private Set<Student> studentSet;

    public StudentManager() {
        this.studentSet = new HashSet<>();
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void addStudent(String name, long registration, double average) {
        studentSet.add(new Student(name, registration, average));
    }

    public void removeStudent(long registration) {
        for (Student s : studentSet){
            if(s.getRegistration() == registration){
                studentSet.remove(s);
            }
        }
    }

    public TreeSet orderByName() {
        return new TreeSet<>(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));
    }

    public Set<Student> orderByNote() {
        return new TreeSet<>(Comparator.comparing(Student::getAverage));
    }

    public Set<Student> showStudents(){
        return studentSet;
    }

}
