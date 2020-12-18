package com.javaLearning;

public class Summary implements MathOperation {

    @Override
    public void operate(int operA, int operB) {
        System.out.println(operA + operB);
    }

}
