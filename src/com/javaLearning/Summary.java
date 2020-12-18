package com.javaLearning;

public class Summary implements MathOperation {
    int operA,operB;

    public Summary(int operA, int operB) {
        this.operA = operA;
        this.operB = operB;
    }

    @Override
    public void operate() {
        System.out.println(this.operA-this.operB);
    }

}
