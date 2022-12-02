import java.util.*;

public class sorting {
    void bubbleSort(int arr[]) {
        int n=arr.length;
        for(int j=0; j<n ; j++)
         {
            for(int i=0 ; i<n-1-j ; i++) {
                if(arr[i]>arr[i+1]) 
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
           }
           
        }
       
    }
     public static void main(String []args) {
         int []arr={5,4,3,2,1};
         sorting obj=new sorting();
          obj.bubbleSort(arr);
         for(int i=0 ; i<arr.length ; i++) 
           System.out.print(arr[i]+" ");
     }
}

class selectionSort {
   static void printarr(int []arr) {
       for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
   }
    public static void main(String []args) {
        int arr[]={2,3,41,5,67};
        int i=0;
        for(; i<arr.length ; i++) {
            int min=i;
            for(int j=i+1 ; j<arr.length ; j++) {
                if(arr[min]>arr[j]) {
                    min=j;
                }
            }
            int temp=arr[min];
          arr[min]=arr[i];
          arr[i]=temp;
        }
        printarr(arr);
    }
}

class insertionSort {
    static void printarr(int []arr) {
        for(int i=0; i<arr.length; i++)
         System.out.print(arr[i]+" ");
    }
    public static void main(String []args) {
       
        Scanner sc=new Scanner(System.in);
        int size;
        size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0 ; i<arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        
        for(int i=1; i<arr.length; i++) {
            int current =arr[i];
            int j=i-1;
            while(j>=0 && arr[j]> current) {
                arr[j+1]=arr[j];
                j--;
            }
            
            arr[j+1]=current;
            
        }
        printarr(arr);
    }
}
