package com.javaLearning;

public class Sub implements MathOperation {

    int operA,operB;

    public Sub(int operA, int operB) {
        this.operA = operA;
        this.operB = operB;
    }

    @Override
    public void operate() {
        System.out.println(this.operA - this.operB);
    }
}
