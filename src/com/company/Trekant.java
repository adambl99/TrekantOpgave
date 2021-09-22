package com.company;

public class Trekant {
    int sideA;
    int sideB;
    int sideC;
    public Trekant(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public void getType(){
        if (sideA <= 0 || sideB <= 0 || sideC <= 0){
            System.out.println("Dette er ikke en trekant, ugyldigt input");
        } else if (sideA==sideB && sideB==sideC){
            System.out.println("Dette er en equilateral trekant");
        } else if (sideA!=sideB && sideB!=sideC){
            System.out.println("Dette er en scalene trekant");
        } else if ((sideA==sideB && sideB!=sideC) || (sideA!=sideB && sideC==sideA) || (sideC==sideB && sideC!=sideA)){
            System.out.println("Dette er en isosceles trekant");
        }
    }

    @Override
    public String toString() {
        return "Trekant{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}


