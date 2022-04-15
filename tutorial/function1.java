import java.util.*;

public class function1 {
    public static void count(){
        Scanner sc= new Scanner(System.in);
        int countneg,countpos,countzero;
        countneg=countpos=countzero=0;
            int ch=1;
        while(ch!=0) {
               int n;
               n=sc.nextInt();
            // ch=sc.nextInt();
             if(n>0)
             countpos++;
             else if(n<0)  countneg++;
             else countzero++;
            ch=sc.nextInt();
             if(ch==0)  break;
    
        }
        System.out.println(+countpos);
        System.out.println(+countneg);
        System.out.println(countzero);

    }

    public static void main(String []k) {
          count();
    }
}