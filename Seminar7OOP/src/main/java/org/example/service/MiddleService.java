package org.example.service;

public class MiddleService implements IStudentLearn, IStudentSmoke{
    @Override
    public void learn() {
        System.out.println("Я ненавижу учиться");
    }

    @Override
    public void smoke() {
        System.out.println("Я начинаю курить");
    }

    public void walkLesson() {
        System.out.println("Я прогулял урок");
    }
}
