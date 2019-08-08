package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomewarkTestSuite {
    @Test
    public void notifyAboutNewTask() {
        //given
        StudentTasks student1Tasks = new StudentTasks(new Student("Marian Kowalski"));
        StudentTasks student2Tasks = new StudentTasks(new Student("Jacek Wiśniewski"));
        StudentTasks student3Tasks = new StudentTasks(new Student("Marek Marecki"));
        Mentor mentor1 = new Mentor("Jan Kowalski");
        Mentor mentor2 = new Mentor("Janusz Zieliński");

        student1Tasks.registerObserver(mentor1);
        student2Tasks.registerObserver(mentor1);
        student3Tasks.registerObserver(mentor2);

        //when
        student1Tasks.addTaskToQueue("zadanie 20.1");
        student3Tasks.addTaskToQueue("zadanie 20.1");
        student1Tasks.addTaskToQueue("zadanie 20.2");
        student1Tasks.addTaskToQueue("zadanie 20.3");
        student2Tasks.addTaskToQueue("zadanie 20.1");
        student3Tasks.addTaskToQueue("zadanie 20.2");

        //then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
        assertEquals(1, student2Tasks.getExercises().size());
        assertEquals(2, student3Tasks.getExercises().size());
        assertEquals(3, student1Tasks.getExercises().size());
    }
}
