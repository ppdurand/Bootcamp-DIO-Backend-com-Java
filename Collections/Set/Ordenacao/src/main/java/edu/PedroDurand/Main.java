package edu.PedroDurand;

public class Main {
    public static void main(String[] args) {
        StudentManager set = new StudentManager();

        set.addStudent("Pedro", 1, 7.95);
        set.addStudent("Paulo", 2, 6.95);
        set.addStudent("Yohans", 3, 1.95);
        set.addStudent("Julia", 4, 4.95);
        set.addStudent("Pantoja", 5, 8.95);
        set.addStudent("Ricardo", 6, 9.95);
        set.addStudent("Isaac", 7, 1.95);
        set.addStudent("Joao", 8, 2.95);
        set.addStudent("Goku", 9, 4.95);

        System.out.println(set.showStudents());

        set.orderByName();
        System.out.println(set.showStudents());
        set.orderByNote();
        System.out.println(set.showStudents());

    }
}