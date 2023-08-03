package com.crio.qcalc;

import ch.qos.logback.core.joran.conditional.ElseAction;

public class StandardCalculator {

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

protected double result;

public void setResult(double value){
    this.result=value;
}

public double getResult(){
    return result;
}

public final void add(int num1, int num2){
    add((double)num1, (double)num2);
    result =  num1+num2;
    if((result>=Double.MAX_VALUE)||(result==Double.POSITIVE_INFINITY)){
        throw new ArithmeticException("Double Overflow");
    }
    else
        this.result = result;
}

public final void add(double num1, double num2){
    result = num1+num2;
    if((result>=Double.MAX_VALUE)||(result==Double.POSITIVE_INFINITY)){
        throw new ArithmeticException("Double Overflow");
    }
    else
        this.result = result;
}

public final void subtract(int num1, int num2){
    subtract((double)num1, (double)num2);
    result = num1-num2;
    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
        throw new ArithmeticException("Double Overflow");
    }
    else
        this.result = result;
}

public final void subtract(double num1, double num2){
    result = num1-num2;
    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
        throw new ArithmeticException("Double Overflow");
    }
    else
        this.result = result;
}


public final void multiply(int num1, int num2){
    multiply((double)num1, (double)num2);
    result = num1*num2;
    if((result > Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY) || (result == Double.NEGATIVE_INFINITY))
        throw new ArithmeticException("Double overflow");
    else
        this.result = result;
}

public final void multiply(double num1, double num2){
    result = num1*num2;
    if((result > Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY) || (result == Double.NEGATIVE_INFINITY))
        throw new ArithmeticException("Double overflow");
    else
        this.result = result;
}


public final void divide(int num1, int num2){
    divide((double)num1, (double)num2);
    if(num2 == 0)
        throw new ArithmeticException("Divide by zero");
    else
        result = num1/num2;
}

public final void divide(double num1, double num2){
    result = num1/num2;
    if(num2 == 0.0)
        throw new ArithmeticException("Divide by zero");
    else
        result = num1/num2;
}

public void clearResult(){
    result = 0;
}

public void printResult(){
    System.out.println("Standard calculator result:"+result);
}


}
