package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutNewTask(StudentTasks studentTasks) {
        System.out.println("Uwaga, " + name + "! Twój student " + studentTasks.getStudent().getName() +
                " przesłał własnie zadanie do sprawdzenia: " + studentTasks.getExercises().peekLast() +
                ". Łączna liczba zrobionych przez tego studenta zadań wynosi: " + studentTasks.getExercises().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
