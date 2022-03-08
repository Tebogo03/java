package com.example.helloworld;

public class MarsWeight {
    public static void main(String[] args) {
        float marsWeightChukwu;
        float myEarthWeight;
        double marsWeightDouble;
        int marsWeightInt;
        myEarthWeight=85;
        marsWeightChukwu =(myEarthWeight * 0.38f);
        System.out.println(myEarthWeight+"kg on Earth is "+marsWeightChukwu+"kg on Mars  ");

        marsWeightDouble=marsWeightChukwu;
        System.out.printf("kilogram on mars after converting to double : %.4f %n " ,marsWeightDouble);

        marsWeightInt = (int) marsWeightDouble;
        System.out.println("kilogram on mars after converting to int :"+ marsWeightInt);
        char c =(char)marsWeightInt;
        System.out.println("The ASCII table equivalent of mars weight: " + c);
        int mathExample= c + c;
        System.out.println("An example of a math operation on the char type: " + mathExample);

    }
}
