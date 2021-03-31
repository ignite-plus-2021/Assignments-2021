package com.company;

public class ques5 {

    public static void main(String[] args) {
        //Initializing & incrementing multiple variables in a for loop
        //PowersOfTwo
        int n=5;
        for(int i=0, power=1; i<=n; i++, power*=2){
            System.out.println(power);
        }
    }
}