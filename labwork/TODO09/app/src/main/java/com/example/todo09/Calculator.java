package com.example.todo09;

public class Calculator {
    public enum operator{ADD, SUBTRACT, MULTIPLY, DIVIDE}
    public double ADD(double operandone, double operandtwo){
        return operandone + operandtwo;
    }
    public double SUBTRACT(double operandone, double operandtwo){
        return operandone - operandtwo;
    }
    public double MULTIPLY(double operandone, double operandtwo){
        return operandone * operandtwo;
    }
    public double DIVIDE(double operandone, double operandtwo){
        return operandone / operandtwo;
    }
}

