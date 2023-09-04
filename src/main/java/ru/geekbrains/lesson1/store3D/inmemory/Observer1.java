package ru.geekbrains.lesson1.store3D.inmemory;

public class Observer1 implements ModelChangedObserver{
    @Override
    public void applyUpdateModel() {
        System.out.println("new content - observer#1");
    }
}
