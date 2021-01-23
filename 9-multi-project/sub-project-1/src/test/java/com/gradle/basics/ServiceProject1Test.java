package com.gradle.basics;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ServiceProject1Test {

    private ServiceProject1 subject = new ServiceProject1();

    @Test
    public void getRandomLetter_generatesRandomLetter_returnsLowercaseLetter() {
        char result = subject.getRandomLetter();
        assertTrue("Generated letter was not between a and z: ", result >= 97 && result <= 122);
    }
}