package target.assignment;

public class PowerOf2LteN {
    public static void main(String[] args) {
        // read in one command-line argument
        int n = Integer.parseInt(args[0]);

        int i = 0 , powerOfTwo = 1;

        System.out.println("Table of power of 2 less than equal to "+n+" : ");
        while (i <= n) {
            System.out.println("2^"+i + " = " + powerOfTwo);
            powerOfTwo = 2 * powerOfTwo;
            i = i + 1;
        }

    }
}

/* Output :-
C:\Users\Shraddha\IdeaProjects\TargetCoreJava\src\target\assignment>java PowerOf2LteN.java 12
Table of power of 2 less than equal to 12 :
2^0 = 1
2^1 = 2
2^2 = 4
2^3 = 8
2^4 = 16
2^5 = 32
2^6 = 64
2^7 = 128
2^8 = 256
2^9 = 512
2^10 = 1024
2^11 = 2048
2^12 = 4096
 */