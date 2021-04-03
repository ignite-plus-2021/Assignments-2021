package target;

import java.util.Scanner;

public class swiggy {
    static int zip_code;
    public static void setzip() throws non_deliverable{
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the zip code:");
        zip_code=s.nextInt();
        if(zip_code==111 || zip_code==999 || zip_code==123){
            throw new non_deliverable("Sorry, delivery in your area is unavailable at the moment.");
        }
        else
            System.out.println("Delivery available in your area!");
    }
    public static void main (String args[]){
        try{
            setzip();
        }catch(non_deliverable e) {System.out.println(e.getMessage());

    }
}}
