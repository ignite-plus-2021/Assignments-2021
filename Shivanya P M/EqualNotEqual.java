package TargetAssignment;

import com.sun.source.doctree.SystemPropertyTree;

public class EqualNotEqual {
    public static  void  main(String args[]){
        System.out.println("arg count: "+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println("Enter your input: "+args[i]);
            if(i==2){
                if(args[0]==args[1] && args[1]==args[2]){
                    System.out.println("Equal");
                } else if (args[0] != args[1] || args[0] != args[2] || args[1]!=args[2]){
                    System.out.println("Not Equal");
                }

            }
        }
//        System.out.println("Enter your first input: "+args[1]);
//        System.out.println("Enter your second input: "+args[1]);
//        System.out.println("Enter your third input: "+args[2]);

    }
}
