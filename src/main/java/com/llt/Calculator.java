package com.llt;

/**
 * @Author LLT
 * @Date 2024-04-17-11:10
 **/
public class Calculator {
    public int compute(int num1, int num2, String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computable compute = ComputeFactory.getCompute(symbol);
        return compute.compute(num1, num2);
    }
}
