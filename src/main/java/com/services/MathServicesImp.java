package com.services;

import com.customexception.InvalidNumberRangeException;

public class MathServicesImp implements MathService{

	public int testAdd(int a, int b) throws InvalidNumberRangeException {
		return a+b;
	}

	public int testSub(int a, int b) {
		return a-b;
	}

	public int testMul(int a, int b) {
		return a*b;
	}

	public int testDiv(int a, int b) {
		return a/b;
	}
	
}
