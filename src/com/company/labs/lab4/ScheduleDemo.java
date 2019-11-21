package com.company.labs.lab4;

import com.company.labs.lab3.Summator;

import javax.xml.namespace.QName;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

enum Subject {
    analysis,
    webDev,
    javaLang,
    linearAlgebra,
    PE,
    knoledgeBases,
    swiftLang,
    kotlinLang,
    mobileDev,
}

enum Speciality {
    appliedMathematics,
    appliedInformatics
}

abstract class  Member {
    String name;
    int age;
}

class Educator extends Member {
    Subject subject ;
    //String degree;
    //double salary;

    Educator(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }
}

class Student extends Member {
    int group;
    int year;
    //int [] marks;

    Student(String name){
        this.name = name;
    }
}
//=============================

class Lesson implements Comparable<Lesson>{
    int number; // ?
    Subject subject;
    Group group;
    LocalDateTime time;
    Educator educator;

    public Lesson(int number, Subject subject, Group group, LocalDateTime time, Educator educator) {
        this.number = number;
        this.subject = subject;
        this.group = group;
        this.time = time;
        this.educator = educator;
    }

    @Override
    public int compareTo(Lesson lesson) {
        if (this.time == null || lesson.time == null)
            return 0;

        return this.time.compareTo(lesson.time);
    }
}

class Group {
    int code;
    Student[] students;
    Speciality speciality;

    public Group(int code, Student[] students, Speciality speciality) {
        this.code = code;
        this.students = students;
        this.speciality = speciality;
    }

    public boolean containsStudent(Student student) {

        for (Student eachStudent: students)  // Array.asList(student).contains()-???
            if (eachStudent.equals(student)) return true;

            return false;
    }
}



class Schedule {
    Lesson lessons[];
    Group groups[];

    public Schedule(Lesson[] lessons, Group groups[]) {
        this.lessons = lessons;
        this.groups = groups;
    }

    // methods for getting result
    public void getEducatorSchedule(Educator educator) {

        List<Lesson> desiredLessons = new ArrayList<Lesson>();

        System.out.println("\n \n Here is the schedule for educator " + educator.name + " for next week:");

        for (Lesson eachLesson : this.lessons)
            if (educator.equals(eachLesson.educator))
                desiredLessons.add(eachLesson);


        Collections.sort(desiredLessons);
        prettyLessonOutput(desiredLessons);
    }

    public void getStudentSchedule(Student student) {

        System.out.println("\n \n Here is the schedule for student " + student.name + " for next week:");

        List<Lesson> desiredLessons = new ArrayList<Lesson>();
        Group desiredGroup = null;

        // find out desired group
        for (Group eachGroup : groups) {
            if (eachGroup.containsStudent(student)) {
                desiredGroup = eachGroup;
                break;
            }
        }

        // guard
        if (desiredGroup == null) {
            System.out.println("ERROR: \n There is no such Student in the groups");
            return;
        }

        // List formation
        for (Lesson eachLesson : this.lessons)
            if (eachLesson.group.equals(desiredGroup))
                desiredLessons.add(eachLesson);


        Collections.sort(desiredLessons);
        prettyLessonOutput(desiredLessons);
    }

    private void prettyLessonOutput(List<Lesson> lessons) {
        for (Lesson eachLesson : lessons) {
            System.out.println("\n ------------ " + eachLesson.number + " --------------- ");
            System.out.println("|" + eachLesson.subject + "|");
            System.out.println("\t" + eachLesson.time.toLocalDate());
            System.out.println("\t" + eachLesson.time.toLocalTime());
            System.out.println("\t group: " + eachLesson.group.speciality);
            System.out.println();
        }
    }
}


public class ScheduleDemo {


    public static void main(String[] args) {
        //LocalDateTime ldt = LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00);



        // initialize students
        Student vova = new Student("Vova");
        Student sasha = new Student("Sasha");
        Student anya = new Student("Anya");
        Student pasha = new Student("Pasha");
        Student denis = new Student("Denis");

        // initialize educators
        Educator malukhin = new Educator("Malukhin", Subject.analysis);
        Educator sinitsa = new Educator("Sinitsa", Subject.webDev);
        Educator golovin = new Educator("Golovin", Subject.javaLang);
        Educator kurilov = new Educator("Kurilov", Subject.PE);
        Educator kostenko = new Educator("Kostenko", Subject.knoledgeBases);

        // initialize Groups
        Student tenthGroupStudents[] = {vova, sasha};
        Group tenthGroup = new Group(10, tenthGroupStudents, Speciality.appliedMathematics);

        Student eleventhGroupStudents[] = {anya, pasha, denis};
        Group eleventhGroup = new Group(11, eleventhGroupStudents, Speciality.appliedInformatics );

        // initialize Lessons
        //Lesson firstLesson = new Lesson(1, Subject.javaLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00), golovin);

        Lesson lessons[] = {

                // (* 10th *)
                // MONDAY
                new Lesson(1, Subject.javaLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00), golovin),
                new Lesson(2, Subject.analysis, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 28, 9, 30), malukhin),

                // TUESDAY
                new Lesson(1, Subject.webDev, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), sinitsa),
                new Lesson(2, Subject.webDev, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 9, 40), sinitsa),
                new Lesson(3, Subject.PE, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 11, 30), kurilov),

                // WEDNESDAY
                new Lesson(1, Subject.linearAlgebra, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), malukhin),
                new Lesson(2, Subject.javaLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 9, 40), golovin),
                new Lesson(3, Subject.javaLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 11, 30), golovin),
                new Lesson(4, Subject.knoledgeBases, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 13, 00), kostenko),
                new Lesson(5, Subject.webDev, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 15, 00), sinitsa),

               // THURSDAY
                new Lesson(1, Subject.swiftLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), golovin),
                new Lesson(2, Subject.swiftLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 9, 40), golovin),
                new Lesson(3, Subject.swiftLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 11, 30), golovin),
                new Lesson(4, Subject.swiftLang, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 13, 00), golovin),

                // FRIDAY
                new Lesson(1, Subject.kotlinLang, tenthGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 8, 00), golovin),
                new Lesson(2, Subject.kotlinLang, tenthGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 9, 40), golovin),
                new Lesson(3, Subject.PE, tenthGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 11, 30), kurilov),
                new Lesson(4, Subject.mobileDev, tenthGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 13, 00), golovin),

                //  (* 11th *) ------------------------------------------------------------------------------------------------------------------------------------------

                // MONDAY
                new Lesson(1, Subject.knoledgeBases, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00), kostenko),
                new Lesson(2, Subject.analysis, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 28, 9, 30), malukhin),

                // TUESDAY
                new Lesson(1, Subject.javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), golovin),
                new Lesson(2, Subject.analysis, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), malukhin),
                new Lesson(3, Subject.linearAlgebra, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), malukhin),

                // WEDNESDAY
                new Lesson(1, Subject.webDev, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), sinitsa),
                new Lesson(2, Subject.webDev, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 9, 40), sinitsa),
                new Lesson(3, Subject.javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 11, 30), golovin),

                // THURSDAY
                new Lesson(1, Subject.javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), golovin),
                new Lesson(2, Subject.javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 9, 40), golovin),


                // FRIDAY
                new Lesson(1, Subject.knoledgeBases, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 8, 00), kostenko),
                new Lesson(2, Subject.javaLang, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 9, 40), golovin),
                new Lesson(3, Subject.linearAlgebra, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 11, 30), malukhin),
                new Lesson(4, Subject.webDev, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 13, 00), sinitsa),
        };

        Schedule nextWeekSchedule = new Schedule(lessons, new Group[] {tenthGroup, eleventhGroup});

        nextWeekSchedule.getEducatorSchedule(malukhin);
        //nextWeekSchedule.getStudentSchedule(vova);


    }

    /* NOTES
    * предусмотреть ситуацию пересечения пар в одно время у одного преподавателя (у одной группы !)
    * разделение на практики / лекции
    *
    * аудитории?
    *
    * студенты-однофамильцы в разных группах
     */

}
