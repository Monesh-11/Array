import java.util.*;

class large_in_array{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>m){
                m=i;
            }
        }
        System.out.println(m);

    }
}