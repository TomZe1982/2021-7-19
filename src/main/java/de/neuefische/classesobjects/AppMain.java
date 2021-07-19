package de.neuefische.classesobjects;

import model.Student;

public class AppMain {

    public static void main(String[] args) {
        Student student1 = new Student("von Hahn", "Franz", 123);
        Student student2 = new Student("von Hahn", "Franz", 123);
        Student student3 = new Student("von Henne", "Franziska", 456);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student2.equals(student3));

    }

}
