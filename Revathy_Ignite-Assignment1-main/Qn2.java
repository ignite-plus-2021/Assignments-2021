class Qn2{
    public static void main(String args[]){
        int b_num[] = {0,1,1,0,1,1,0,1,0,0};
        int k=0;
        for(int i=0;i<b_num.length;i++){
            if(b_num[i]==0){
                b_num[k++] = 0;
            }
        }
        for(int i=k;i<b_num.length;i++){
            b_num[k++] = 1;
        }
    }
}
