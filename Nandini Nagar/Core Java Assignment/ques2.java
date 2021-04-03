package target;

public class ques2 {
    static int []b_nums={ 0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
    static int i,count=0,n=b_nums.length;
    public static void sort(int count){
        i=0;
        while(i<count) {
            b_nums[i] = 0;
            b_nums[n - i - 1] = 1;
            i++;
        }
    }
    public static void print(){
        for(i=0;i<n;i++) {
            System.out.print(b_nums[i]+" ");}
    }
    public static void main(String args[]){
    for(i=0;i<n;i++) {
        if(b_nums[i]==0) count++;}
    sort(count);
    print();

    }}
