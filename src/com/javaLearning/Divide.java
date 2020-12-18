package com.javaLearning;

public class Divide implements MathOperation{
    int operA,operB;

    public Divide(int operA, int operB) {
        this.operA = operA;
        this.operB = operB;
    }

    @Override
    public void operate() {
        System.out.println(this.operA / this.operB);
    }
}
