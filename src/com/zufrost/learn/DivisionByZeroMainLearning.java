package com.zufrost.learn;

public class DivisionByZeroMainLearning {
    public static void main(String[] args) {
        float i = 0;
        float y = 1 / i;
        System.out.println(y);
        y = -1 / i;
        System.out.println(y);

        double z = Math.sqrt(-1);
        System.out.println(z);
    }
}
