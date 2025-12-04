package edu.bsu.cs222.project2menu;

public class Task {
    private int year;
    private int day;
    private int month;
    private String name;

    public Task(int year, int day, int month, String name) {
        this.year = year;
        this.day = day;
        this.month = month;
        this.name = name;
    }

    public int getYear(){
        return this.year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
