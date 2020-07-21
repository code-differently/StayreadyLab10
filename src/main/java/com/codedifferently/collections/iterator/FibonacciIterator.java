package com.codedifferently.collections.iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class FibonacciIterator implements Iterator {
    private int firstNumber;
    private int secondNumber;
    private int currentSum;

    public FibonacciIterator() {
        firstNumber = 0;
        secondNumber = 1;
        currentSum = 0;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        currentSum = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = currentSum;

        return currentSum;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(int currentSum) {
        this.currentSum = currentSum;
    }
}
