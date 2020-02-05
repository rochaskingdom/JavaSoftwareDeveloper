package com.vinicius;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longValue);

        short shortTotal = (short) (1000 + 10L * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);
    }
}
