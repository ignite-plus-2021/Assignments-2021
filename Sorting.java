public class Sorting {
    public static void main(String[] args){
        /*
         Write a Java program to sort a given binary array in linear times. b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
         Output: After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
         */
        int[]a={ 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        System.out.println("THE GIVEN ARRAY");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("THE SORTED ARRAY");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
