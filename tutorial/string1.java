import java.util.*;

public class string1 {
     public static void main(String []k) {
         Scanner sc=new Scanner(System.in);
         String str,result="";
         str=sc.nextLine();
         for(int i=0 ; i<str.length() ; i++) {
             if(str.charAt(i)=='@') {
                 break;
             }
        result+=str.charAt(i);
         }
         System.out.println(result);
     }
}

class combinedstring {
     public static void main(String []k) {
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
            int totalLength=0;
         StringBuilder str=new StringBuilder();
         String arr[]=new String[size];
         for(int i=0 ; i<size ; i++)
          {
           arr[i]=sc.next();  // take care about enter key as counted size string .
        }
         for(int i=0 ; i<size ; i++) {
             totalLength+=arr[i].length();
         }
         System.out.println(totalLength);
     }
}
