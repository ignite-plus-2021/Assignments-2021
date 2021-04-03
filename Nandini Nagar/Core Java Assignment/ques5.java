package target;

public class ques5 {
    public static void main(String args[]){

    //Grouping logical conditions using For loop
        int i=0;
        int a[]={70,31,4,1,0,22,-1};
        for(;(a[i]>0 && a[i]>a[i+1]);){
            System.out.print(a[i]+" ");
            i++;
        }
        System.out.println();
        //Enhanced For loop
        int a2[]={57,11,64,98};
        for (int n : a2) {
            System.out.print(n+" ");


    }
}}
