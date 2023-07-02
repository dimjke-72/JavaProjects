package ru.gb.lesson5.HomeWork.task2;
import java.util.Objects;

public class FIO {
    private String Name;
    private String SurName;

    public FIO(String name, String surName) {
        Name = name;
        SurName = surName;
    }

    public FIO() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FIO fio = (FIO) o;
        return Objects.equals(Name, fio.Name) && Objects.equals(SurName, fio.SurName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, SurName);
    }

    @Override
    public String toString() {
        return "[" +
                "Name='" + Name + '\'' +
                ", SurName='" + SurName + '\'' +
                ']';
    }
}
