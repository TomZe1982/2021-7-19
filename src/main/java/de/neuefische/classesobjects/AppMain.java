package de.neuefische.classesobjects;

import model.Student;

public class AppMain {

    public static void main(String[] args) {
        Student student = new Student("von Hahn", "Franz", 1234567);

        System.out.println(student.toString());

    }

}
