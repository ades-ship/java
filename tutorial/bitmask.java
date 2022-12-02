import java.util.*;
// bitmasking is used to find the bit at particular position;
public class bitmask {
    public static void main(String []args) {
        int n=5;
        int position=3;
        int bitmask=1<<position;
        if((bitmask & n) ==0) {
            System.out.println("bit is 0");
        }
        else {
            System.out.println("bit is 1");
        }
    }
}

// setbit is used to set the bit ;
class setBit {
    public static void main(String []args) {
        int position=0,setbit;
        int n=5;
        int newnumber=(setbit=(1<<position)) | n;
        System.out.println(newnumber);
    }
}

//it is used to clear the bit and make it 0;
class clearbit {
    public static void main(String []args) {
        int position,bitmask,number;
        Scanner sc=new Scanner(System.in);
        position=sc.nextInt();
        number=sc.nextInt();
        bitmask=1<<position;
         bitmask= ~bitmask;
         bitmask=bitmask & number;
        System.out.println("clear the bit at position "+position +" now number is "+bitmask);
    }
}

class update {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);

        int operation,position,number,bitmask;
          position=sc.nextInt();
            number=sc.nextInt();
            operation=sc.nextInt();
        bitmask=1<<position;
        int newbitmask= ~bitmask;
        if(operation==1) {
            //set
            bitmask=bitmask | number;
            System.out.println(bitmask);
        }
        else {
            //clear
            newbitmask=newbitmask & number;
            System.out.println(newbitmask);
        }
    }
}

// problem
class isPowerOf2 {
    public static void main(String []args) {
        int checknumber;
        Scanner sc=new Scanner(System.in);
        checknumber=sc.nextInt();
        if((checknumber & checknumber-1) == 0)
        {
            System.out.println("power of 2");
        }
        else {
            System.out.println("not power of 2 ");
        }
    }
}