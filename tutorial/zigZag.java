import java.util.*;

public class zigZag {
    public static void zzag(int arr[]) {
        boolean flag=true;
        for (int i=0; i<arr.length-2; i++)
        {
            if(flag){
                if(arr[i]>arr[i+1]) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else {
                if(arr[i+1]>arr[i]) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        if(flag==true)
          flag=false;
        else {
            flag=true;
        }

    }

    public static void main(String []k) {
        int arr[]=new int[5];
         Scanner sc=new Scanner(System.in);
          for(int i=0; i<5 ;i++) {
             arr[i]=sc.nextInt();
          }

          zzag(arr);

          for(int i=0 ;i <5 ; i++) {
            System.out.println(arr[i]+" ");
          }
    }
}
