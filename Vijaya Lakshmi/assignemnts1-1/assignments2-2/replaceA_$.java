public class replaceA_$ {

    public static void main(String args[])
    {
        String s="I am always ready to learn although I do not always like being taught";
         StringBuilder s1=new StringBuilder(s);

         for(int i=0;i<s1.length();i++)
         {
              if(s1.charAt(i)=='a')
              {
                  s1.replace(i,i+1,"$");

              }

         }
         System.out.println(s1);
    
}
}
