package com.javaLearning;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        Map<String, MathOperation> operationMap = new HashMap<>();
        operationMap.put("Summary", new Summary());
        operationMap.put("Divide", new Divide());
        operationMap.put("Multiply", new Multiply());
        operationMap.put("Sub", new Sub());

        MathOperation(5,10,"Summary",operationMap);
        MathOperation(10,5,"Divide",operationMap);
        MathOperation(5,10,"Multiply",operationMap);
        MathOperation(5,10,"Sub",operationMap);
        MathOperation(22,10,"Summary",operationMap);

    }

    public static void MathOperation(int a, int b, String operation, Map<String, MathOperation> map){

        map.get(operation).operate(a,b);
    }


//    public static void MathOperation(int a, int b, String operation) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//
//        MathOperation mathOperation = callClassByName(a, b,  "com.javaLearning." + operation);
//        mathOperation.operate();
//
//    }
//
//    public static MathOperation callClassByName(int a, int b, String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//
//        Class test = Class.forName(className);                    ///
//        return (MathOperation) test.getDeclaredConstructor(int.class, int.class).newInstance(a,b);
//    }
}
