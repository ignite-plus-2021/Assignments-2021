class Qn3{
  public static void main(String args[]){
       // read in one command-line argument
        int n = Integer.parseInt(args[0]);
        for(int i=0;i<=n;i++){             //checks until i becomes less than or equal to n
            int a = 2**i;                  //computes power of 2
            System.out.println(a);         //prints power of 2
        }
    }
}
     
