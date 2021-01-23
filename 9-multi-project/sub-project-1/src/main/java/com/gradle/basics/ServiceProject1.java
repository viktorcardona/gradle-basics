package com.gradle.basics;

import org.apache.commons.math3.random.RandomDataGenerator;

public class ServiceProject1 {

    public char getRandomLetter() {
        return (char) new RandomDataGenerator().nextInt(97, 97 + 25);
    }

}
