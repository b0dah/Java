package test.lab4;

import com.company.labs.lab4.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

import static java.util.Calendar.ALL_STYLES;
import static java.util.Calendar.MONDAY;

public class ScheduleTest {

    @Test
    public void ScheduleTest() {
        Student studentAnna = new Student("Ann");
        Student studentIvan = new Student("Ivan");

        Group group10 = new Group(10, Arrays.asList(studentAnna), Speciality.appliedMathematics);
        Group group11 = new Group(11, Arrays.asList(studentIvan), Speciality.appliedInformatics);

        Educator malukhin = new Educator("Maluxin", Subject.analysis);
        Educator garkusha = new Educator("Garkusha", Subject.javaLang);

        Lesson javaPracticeLesson = new Lesson(1, Subject.javaLang, group10, LocalDateTime.of(2019, Month.OCTOBER, 28, 8, 00), garkusha);
        Lesson analysisLesson = new Lesson(2, Subject.analysis, group11, LocalDateTime.of(2019, Month.OCTOBER, 28, 9, 30), malukhin);

        Schedule schedule = new Schedule(Arrays.asList(analysisLesson, javaPracticeLesson), Arrays.asList(group10, group11));

        Assertions.assertEquals(Arrays.asList(javaPracticeLesson), schedule.getStudentSchedule(studentAnna));
    }
}
