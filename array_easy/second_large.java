
import java.util.Scanner;

class second_large {   
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl&&arr[i]!=l){
                sl=arr[i];
            }
            
        }
        System.out.println("Second_Largest: "+sl);

    }

}