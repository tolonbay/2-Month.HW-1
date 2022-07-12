package com.company;

public class Main {

    public static void main(String[] args) {
    Layers layers = new Layers("Хай-Лайн",18,95,435, Color.BROWN);

    Broilers broilers = new Broilers("Cobb 500", 45, 75,0,Color.WHITE,75);
    Broilers broilers1 = new Broilers("Ross - 300", 2,70,0,Color.BROWN,70);

    layers.getInfo();
        System.out.println("_______________________________");
    broilers.getInfo();

    }

}
