
public class CheckerboardPattern{
   public static void checkerboard(int row, int col){
       for(int i = 1; i<=row; i++){
	       if(i%2 ==0) {
		   System.out.print("  "); //Start with space on every other row
	       }
		for(int j=1; j<=col; j++) {
		    System.out.print(" * ");
		}
		System.out.println();
	}
  }

  public static void main(String[] args) {
      int n=Integer.parseInt(args[0]);
      System.out.println(" the checkerboard pattern is \n");
      checkerboard(n,n); //call the method
   }
}
