package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Homework1 {
    public static void main(String[] args) {
        int randomNum = ThreadLocalRandom.current().nextInt(-100, 100 + 1);

        System.out.println("The number is: " +randomNum);

        if(randomNum > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is not greater than 5");
        }

    }
}
