package target.assignment;

public class CheckerBoard {
    public static void main(String[] args) {
        int size = Integer.parseInt( args[0] );

        for(int row = 0; row < size; ++row) {
            for(int col = 0; col < size; ++col) {
                if ( (row % 2) == (col % 2) )
                    System.out.print("*");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }
}

/*
c:\Users\Sunita\IdeaProjects\TargetCoreJava\src\target\assignment>java CheckerBoard.java 12
*  *  *  *  *  *
  *  *  *  *  *  *
*  *  *  *  *  *
  *  *  *  *  *  *
*  *  *  *  *  *
  *  *  *  *  *  *
*  *  *  *  *  *
  *  *  *  *  *  *
*  *  *  *  *  *
  *  *  *  *  *  *
*  *  *  *  *  *
  *  *  *  *  *  *
 */