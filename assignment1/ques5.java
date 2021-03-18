package assignment1;
/*
The formal syntax of the for statement is as follows:

for ( initialization; continuation-condition; update )
    {
     statement or statements
     }

We can also include multiple conditions in the for loop by using standard logic operators or by using a private method.
This is helpful if we want the loop to depend on more than one condition.

 */
public class ques5 {
    private static boolean validate(int i){
        return((i<10)&&(i%5<3));
    }
    public static void main(String args[]){
        //Using logic 'and' operator
        System.out.println("Using logic 'and' operator");
        for(int i=0;i<10 && i%5<3 ;i++){
            System.out.println(i);
        }

       // Using private method
        System.out.println("\nUsing private method");
        for(int i=0;validate(i);i++){
            System.out.println(i);
        }
    }

}
