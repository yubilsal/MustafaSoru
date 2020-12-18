package com.javaLearning;

public class Multiply implements MathOperation {

    @Override
    public void operate(int operA, int operB) {
        System.out.println(operA * operB);
    }
}
