package com.example.helloworld;

public class BlocksNeed {
    public static void main(String[] args) {
        int numberOfLego =81;
        int containerCapacity =7;
        int fullContainer=numberOfLego/containerCapacity;
        int notFullContainer=numberOfLego%containerCapacity;
        System.out.println("They are "+fullContainer +" full containers");
        System.out.println("They are "+notFullContainer +" Remainders");
        if (notFullContainer>0)
        {
            fullContainer++;
            System.out.println("They are "+fullContainer +" containers");
        }


    }
}
