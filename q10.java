package com.company;

import java.util.Scanner;

public class q10 {

    //RECURSIVE
    public int gcd(int a,int b)
    {
        if(a==0)
            return b;

        if(b==0)
            return a;


        return gcd(b,a%b);


    }

    public int iterative_gcd(int a,int b)
    {
      int gcd=0;
      for(int i=2 ; i<=a && i<=b ; i++)
      {
          if(a%i==0 && b%i==0)
          {
              gcd=i;
              break;
          }
      }

      if(gcd==0) return 1;
      return gcd;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter  any  2 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        q10 obj=new q10();

       // int res=obj.gcd(a,b);
        int res=obj.iterative_gcd(a,b);
        System.out.println(res);


    }
}
