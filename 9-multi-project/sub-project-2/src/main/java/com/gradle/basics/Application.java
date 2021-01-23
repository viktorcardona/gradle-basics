package com.gradle.basics;

import org.apache.commons.math3.random.RandomDataGenerator;

public class Application {

    public static void main(String[] args) {
        ServiceProject3 serviceProject3 = new ServiceProject3();
        System.out.println("Random Letter from sub-project 3: " + serviceProject3.getRandomLetter());
        System.out.println("Random Letter from sub-project 2: " + getRandomLetterFromProject2());
    }

    public static char getRandomLetterFromProject2() {
        return (char) new RandomDataGenerator().nextInt(97, 97 + 25);
    }

}
