package com.javaLearning;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

    MathOperation(5,10,"Summary");
    MathOperation(5,10,"Divide");
    MathOperation(5,10,"Multiply");
    MathOperation(5,10,"Sub");

    }

    public static void MathOperation(int a, int b, String operation) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        MathOperation mathOperation = callClassByName(a,b,  "com.javaLearning." + operation);
        mathOperation.operate();

    }

    public static MathOperation callClassByName(int a, int b, String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class test = Class.forName(className);
        return (MathOperation) test.getDeclaredConstructor(int.class, int.class).newInstance(a,b);
    }
}
