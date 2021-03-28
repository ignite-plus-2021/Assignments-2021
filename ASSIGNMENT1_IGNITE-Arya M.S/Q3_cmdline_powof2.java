public class Power_Of_Two {
    public static void main(String[] args) {

        
        int n = Integer.parseInt(args[0]);

        int i = 0;                
        int powerOfTwo = 1;       

        while (i <= n) {
            System.out.println(i + "th power of 2 is " + powerOfTwo);   
            powerOfTwo = 2 * powerOfTwo;                
            i = i + 1;
        }

    }
}
