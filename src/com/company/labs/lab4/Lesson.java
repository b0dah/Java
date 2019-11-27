package com.company.labs.lab4;

import java.time.LocalDateTime;

public class Lesson implements Comparable<Lesson>{
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
