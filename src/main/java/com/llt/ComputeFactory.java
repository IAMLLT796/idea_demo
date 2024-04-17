package com.llt;

/**
 * @Author LLT
 * @Date 2024-04-17-12:07
 **/
public class ComputeFactory {

    private static final Add add = new Add();
    private static final Sub sub = new Sub();

    public static Computable getCompute(char symbol) {
        switch (symbol) {
            case '+' :
                return add;
            case '-' :
                return sub;
            default :
                throw new IllegalArgumentException("Unsupported symbol");
        }
    }
}
