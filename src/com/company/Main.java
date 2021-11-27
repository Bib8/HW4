package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Exercise();
        Exercise2();
        Exercise3();

    }

    static void Exercise1(){

        int j = 0;
        while (j != 10){
            j++;
            System.out.print(j + " ");
        }
        System.out.println("");
        for (int i = 10; i >= 0; i--){
            System.out.print(i + " ");
        }
    }

    static void Exercise2() {
        Random rand = new Random();
        int friday = rand.nextInt(1, 8);
        int month = 31;

        for (int week = 7; friday<=month; friday+=week){
            System.out.println("Сегодня пятница, " + (friday) + "-е число. Необходимо подготовить отчет.");
        }
    }

    static void Exercise3(){
        int currantYear = 2021;
        int viewPeriod = 79;
        int before = 200;
        int after = 100;

        for (int i = viewPeriod; i<= currantYear + after; i+=viewPeriod){
            if (i>=currantYear-before && i<=currantYear+after){
                System.out.println(i);
            }
        }
    }
}
