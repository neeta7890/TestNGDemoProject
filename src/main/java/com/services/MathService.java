package com.services;

import com.customexception.InvalidNumberRangeException;

import com.customexception.InvalidNumberRangeException;



public interface MathService {
//Spec: add fun should do the addition of two int values and return result in int
    //incase if the input param are -ve (not possitive int) then should not return the result , raise Exception (Custom excpetion)
    int testAdd(int a,int b) throws InvalidNumberRangeException;
    
    int testSub(int a,int b);
    int testMul(int a,int b);
    int testDiv(int a,int b);
    
    
    
}