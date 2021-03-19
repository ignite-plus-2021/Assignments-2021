package target.assignment;

import java.util.Scanner;

public class CommandLineArgsEqual {

    public static void main(String[] args) {
        // Taking input using command line arguments
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        int arg3 = Integer.parseInt(args[2]);

        if( arg1 == arg2 && arg2 == arg3)
            System.out.println("Arguments are EQUAL");
        else
            System.out.println("Arguments are NOT EQUAL");
    }
}
/*
OUTPUT:-

C:\Users\Shraddha\IdeaProjects\TargetCoreJava\src\target\assignment>java CommandLineArgsEqual.java 1 2 3
Arguments are NOT EQUAL

C:\Users\Shraddha\IdeaProjects\TargetCoreJava\src\target\assignment>java CommandLineArgsEqual.java 11 11 11
Arguments are EQUAL
 */