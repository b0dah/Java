package com.company.labs.lab4;

import java.util.ArrayList;
import java.util.List;

public class Group {
    int code;
    List<Student> students;
    Speciality speciality;

    public Group(int code, List <Student> students, Speciality speciality) {
        this.code = code;
        this.speciality = speciality;
        this.students = new ArrayList<>(students);
    }

    public boolean containsStudent(Student student) {

        for (Student eachStudent: students)  // Array.asList(student).contains()-???
            if (eachStudent.equals(student)) return true;

            return false;
    }
}
