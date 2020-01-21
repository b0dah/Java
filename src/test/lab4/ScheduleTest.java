package test.lab4;

import com.company.labs.lab4.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Calendar.ALL_STYLES;
import static java.util.Calendar.MONDAY;

public class ScheduleTest {

    @Test
    public void ScheduleTest() {
//        Student studentAnna = new Student("Ann");
//        Student studentIvan = new Student("Ivan");
//
//        Group group10 = new Group(10, Arrays.asList(studentAnna), Speciality.appliedMathematics);
//        Group group11 = new Group(11, Arrays.asList(studentIvan), Speciality.appliedInformatics);
//
//        Educator malukhin = new Educator("Maluxin", Subject.analysis);
//        Educator garkusha = new Educator("Garkusha", Subject.javaLang);
//
//        Lesson javaPracticeLesson = new Lesson(1, Subject.javaLang, group10, LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00), garkusha);
//        Lesson analysisLesson = new Lesson(2, Subject.analysis, group11, LocalDateTime.of(2019, Month.OCTOBER, 28, 9, 30), malukhin);
//
//        Schedule schedule = new Schedule(Arrays.asList(analysisLesson, javaPracticeLesson), Arrays.asList(group10, group11));
//
//        Assertions.assertEquals(Arrays.asList(javaPracticeLesson), schedule.getStudentSchedule(studentAnna));

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
        List<Student> tenthGroupStudents = Arrays.asList(vova, sasha);
        Group tenthGroup = new Group(10, tenthGroupStudents, Speciality.appliedMathematics);

        List <Student> eleventhGroupStudents = Arrays.asList(anya, pasha, denis);
        Group eleventhGroup = new Group(11, eleventhGroupStudents, Speciality.appliedInformatics );


        // (* 10th *)
        // MONDAY
        //List <Lesson> lessons = Arrays.asList(
        Lesson lessons[] = {
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
                new Lesson(3, Subject.javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 11, 30), golovin),

                // THURSDAY
                new Lesson(1, Subject.javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), golovin),
                new Lesson(2, Subject.javaLang, eleventhGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 9, 40), golovin),


                // FRIDAY
                new Lesson(1, Subject.knoledgeBases, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 8, 00), kostenko),
                new Lesson(2, Subject.javaLang, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 9, 40), golovin),
                new Lesson(3, Subject.linearAlgebra, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 11, 30), malukhin),
                new Lesson(4, Subject.webDev, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 13, 00), sinitsa)
        };

        Schedule weekSchedule = new Schedule(lessons, Arrays.asList(tenthGroup, eleventhGroup) );

        // MARK: Tests

        // 1. Educator who has no classes
        Educator fakeEducator = new Educator("Lzhedmitriy", Subject.analysis);
        Assertions.assertEquals(new ArrayList<>(), weekSchedule.getEducatorSchedule(fakeEducator));

        // 2. has ones
        Assertions.assertEquals(
                Arrays.asList(
                        lessons[2],
                        lessons[3],
                        lessons[9],
                        lessons[lessons.length-1]),
                weekSchedule.getEducatorSchedule(sinitsa)
        );
//        Lesson sinitsaLesson1 = new Lesson(1, Subject.webDev, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), sinitsa);
//        Lesson sinitsaLesson2 = new Lesson(2, Subject.webDev, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 29, 9, 40), sinitsa);
//        Lesson sinitsaLesson3 = new Lesson(4, Subject.webDev, eleventhGroup, LocalDateTime.of(2019, Month.NOVEMBER, 1, 13, 00), sinitsa);
//        Lesson sinitsaLesson4 = new Lesson(5, Subject.webDev, tenthGroup, LocalDateTime.of(2019, Month.OCTOBER, 30, 15, 00), sinitsa);
//
//        Assertions.assertEquals(Arrays.asList(sinitsaLesson1, sinitsaLesson2, sinitsaLesson3, sinitsaLesson4), weekSchedule.getEducatorSchedule(sinitsa));

        // 3. fake student
        Student fakeStudent = new Student("Lzhevasya");
        Assertions.assertEquals(new ArrayList<>(), weekSchedule.getStudentSchedule(fakeStudent));

    }

    @Test
    public void testStudentSchedule() {

        // 4. schedule for student
        Student studentArseniy = new Student("Arseniy");
        Student studentValdemar = new Student("Valdemar");

        Group group10 = new Group(10, Arrays.asList(studentValdemar), Speciality.appliedMathematics);
        Group group11 = new Group(11, Arrays.asList(studentArseniy), Speciality.appliedInformatics);

        Educator malukhin = new Educator("Maluxin", Subject.analysis);
        Educator garkusha = new Educator("Garkusha", Subject.javaLang);

        Lesson tenthGroupJavaLesson = new Lesson(1, Subject.javaLang, group10, LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00), garkusha);
        Lesson tenthGroupAnalysisLesson = new Lesson(1, Subject.analysis, group10, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), malukhin);
        Lesson tenthGroupWebDevLesson = new Lesson(1, Subject.webDev, group10, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), garkusha);
        Lesson tenthGroupMobileDevLesson = new Lesson(1, Subject.mobileDev, group10, LocalDateTime.of(2019, Month.OCTOBER, 31, 8, 00), garkusha);
        Lesson tenthGroupKnoledgeBasesLesson = new Lesson(1, Subject.knoledgeBases, group10, LocalDateTime.of(2019, Month.NOVEMBER, 1, 8, 00), garkusha);

        Lesson eleventhGroupJavaLesson = new Lesson(1, Subject.javaLang, group11, LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00), garkusha);
        Lesson eleventhGroupAnalysisLesson = new Lesson(1, Subject.analysis, group11, LocalDateTime.of(2019, Month.OCTOBER, 29, 8, 00), malukhin);
        Lesson eleventhGroupWebDevLesson = new Lesson(1, Subject.webDev, group11, LocalDateTime.of(2019, Month.OCTOBER, 30, 8, 00), garkusha);
        Lesson eleventhGroupMobileDevLesson = new Lesson(1, Subject.mobileDev, group11, LocalDateTime.of(2019, Month.OCTOBER, 31, 8, 00), garkusha);
        Lesson eleventhGroupKnoledgeBasesLesson = new Lesson(1, Subject.knoledgeBases, group11, LocalDateTime.of(2019, Month.NOVEMBER, 1, 8, 00), garkusha);


        Schedule schedule = new Schedule(new Lesson[]{tenthGroupJavaLesson, tenthGroupAnalysisLesson , tenthGroupWebDevLesson, tenthGroupMobileDevLesson, tenthGroupKnoledgeBasesLesson ,
                /*11*/eleventhGroupJavaLesson, eleventhGroupAnalysisLesson , eleventhGroupWebDevLesson, eleventhGroupMobileDevLesson, eleventhGroupKnoledgeBasesLesson}, Arrays.asList(group10, group11));

        Assertions.assertEquals(Arrays.asList(tenthGroupJavaLesson, tenthGroupAnalysisLesson , tenthGroupWebDevLesson, tenthGroupMobileDevLesson, tenthGroupKnoledgeBasesLesson), schedule.getStudentSchedule(studentValdemar));
    }
}
