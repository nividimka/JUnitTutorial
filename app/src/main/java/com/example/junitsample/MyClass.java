package com.example.junitsample;

/**
 * Created by Tom on 07.08.2017.
 */

public class MyClass {
    double value1 = 1.4232135;
    double value2 = 1.4235342;
    Double obj;
    public int multiply(int x,int y){
        return x*y;
    }

    public int throwAnException() throws Exception {
        throw new Exception("sample exception");
    }

    public boolean methodTrue(){
        return true;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public Double getObj() {
        return obj;
    }
    public int getSqrtObj(int square){
        if(square<0){
            throw new IllegalArgumentException("Negative value is not allowed");
        }
        return (int) Math.sqrt(square);
    }
}
