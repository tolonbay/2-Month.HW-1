package com.company;

public class Broilers extends Layers {
    private int meet;

    public Broilers(String breed, int age, int productivity, int eggs, Color color, int meet) {
        super(breed, age, productivity, eggs, color);
        this.meet = meet;
    }

    public int getMeet() {
        return meet;
    }
    public final void meetProduction(){
        System.out.println("Мясо за 45 дней: "+getMeet()+ "% от живой массы");
    }

    public void getInfo(){
        System.out.println("Порода:  "+ getBreed()+
                "\nМясо: " +getMeet() +" %"+
                "\nЯйцо в год:"+ getEggs()+" штук"+
                "\nСветь  "+getColor());
    }

}
