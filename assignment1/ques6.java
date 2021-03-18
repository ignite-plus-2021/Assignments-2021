package assignment1;
/* Yes we can use double variables as loop control variables in for loop.
    It is generally used when the loop control variables can take fractional values.

    Refer below program as example.
 */
public class ques6 {
    public static void main(String[] args){
        for(double i=0;i<10;i=i+0.115 ){
            System.out.println(i);
        }
    }
}
