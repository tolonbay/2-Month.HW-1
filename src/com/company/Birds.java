package com.company;

public class Birds {
    private String breed;
    private int age;
    private int productivity;
    private Color color;

    public Birds(String breed, int age, int productivity, Color color) {
        this.breed = breed;
        this.age = age;
        this.productivity = productivity;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public int getProductivity() {
        return productivity;
    }

    public Color getColor() {
        return color;
    }
}
