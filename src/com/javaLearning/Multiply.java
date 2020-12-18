package com.javaLearning;

public class Multiply implements MathOperation {

    int operA,operB;

    public Multiply(int operA, int operB) {
        this.operA = operA;
        this.operB = operB;
    }

    @Override
    public void operate() {
        System.out.println(this.operA * this.operB);
    }
}
