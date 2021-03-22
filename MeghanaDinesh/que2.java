public class que2
{
    public static void main(String args[])
    {
        int b_nums[]={0,1,1,0,1,1,0,1,0,0};
        int zeros=0;
        for(int i=0;i<b_nums.length;i++)
            if(b_nums[i]==0)
                zeros++;
        int a[]=new int[10];
        for(int i=0;i<zeros;i++)
            a[i] =0;
        for(int i=zeros;i<b_nums.length;i++)
            a[i]=1;
        System.out.print("[");
        for(int i=0;i<b_nums.length-1;i++)
            System.out.print(a[i]+",");
        System.out.print(a[b_nums.length-1]+"]");
    }
}
