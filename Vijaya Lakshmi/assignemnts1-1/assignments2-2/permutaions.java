
public class permutaions {

static String swap(String s,int i,int j)
{
    char[] a=s.toCharArray();
    char temp=a[i];
    a[i]=a[j];
    a[j]=temp;
    return String.valueOf(a);

}

static void permutate(String s,int l,int r)
{

    if(l==r)
         System.out.println(s);

         else
         {
            for(int i=l;i<=r;i++)
            {
               
                
                     s= swap(s,i,l);
                      permutate(s,l+1,r);
                      s=swap(s,i,l);
                
            }
         }

}

    public static void main(String[] args)
    {
     String s="GOD";
     //StringBuilder s=new StringBuilder(s1);
     int l=0,r=s.length()-1;

     permutate(s,l,r);

     

    }
}
