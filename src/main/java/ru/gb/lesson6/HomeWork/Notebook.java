package ru.gb.lesson6.HomeWork;

import java.util.Objects;

public class Notebook {
    private Double screen;
    private String manufacturer;
    private String color;
    private Integer RAM;
    private Integer SSD;
    private String OS;
    private Integer price;

    public Notebook() {
    }

    public Notebook(Double screen, String manufacturer, String color, Integer RAM, Integer SSD, String OS, Integer price) {
        this.screen = screen;
        this.manufacturer = manufacturer;
        this.color = color;
        this.RAM = RAM;
        this.SSD = SSD;
        this.OS = OS;
        this.price = price;
    }

    public Double Screen() {
        return screen;
    }

    public String Manufacturer() {
        return manufacturer;
    }

    public String Color() {
        return color;
    }

    public Integer RAM() {
        return RAM;
    }

    public Integer SSD() {
        return SSD;
    }

    public String OS() {
        return OS;
    }

    public Integer Price() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(screen, notebook.screen) && Objects.equals(manufacturer, notebook.manufacturer) &&
                Objects.equals(color, notebook.color) && Objects.equals(RAM, notebook.RAM) &&
                Objects.equals(SSD, notebook.SSD) && Objects.equals(OS, notebook.OS) &&
                Objects.equals(price, notebook.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(screen, manufacturer, color, RAM, SSD, OS, price);
    }

    @Override
    public String toString() {
        return "\n" + screen + " Ноутбук " + manufacturer + ' ' + color + " (" + "RAM " + RAM + "ГБ" +
                ", SSD " + SSD + "ГБ" + ", " + OS + ", " + price + " рублей" + ')';
    }
}