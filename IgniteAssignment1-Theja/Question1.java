//Question1
package com.company;

public class Question1 {
    public static void main(String[] args)
    {
        if(Integer.parseInt(args[0])==Integer.parseInt(args[1]) && Integer.parseInt(args[1])==Integer.parseInt(args[2]))
        {
            System.out.println("The three numbers are Equal");
        }
        else
        {
            System.out.println("Not equal");
        }
    }
}
