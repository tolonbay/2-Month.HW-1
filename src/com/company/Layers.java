package com.company;

public class Layers extends Birds {
    private int eggs;

    public Layers(String breed, int age, int productivity,int eggs, Color color) {
        super(breed, age, productivity, color);
    }

    public int getEggs() {
        return eggs;
    }
    public void getInfo(){
        System.out.println("Порода:  "+ getBreed()+
                "\nПРодуктивность: " + getProductivity()+" %"+
                 "\nЯйцо в год:"+ getEggs()+" штук"+
                "\nСветь  "+getColor());
    }

}
