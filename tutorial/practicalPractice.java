import java.util.*;
import java.util.Scanner;

public class practicalPractice {
    public static void main(String[] k) {
        System.out.println("hello adesh");
        byte a = 10;
        byte b = 20;
        int c = a + b;
        int d = 89;
        System.out.println(c);
        System.out.println(d);
    }

    public static void main() {

    }
}

class xyz {
    int a,b,c;
    void display() {
        System.out.println("hello world");
        a=8; b=9;c=90;
        System.out.println(+a+""+b+" "+c);
    }

    xyz(int a,int b) {
        System.out.println("parameterised constructor");
    }

    static void  xyz() {
        System.out.println("constructor\n");
    }

    public static void get(int a,int b) {
              int p=a;
              int q=b;

     System.out.println(p+" "+q);
    }
    public static void main(String[] k) {
         int arr[]={1,2,3,4,5};
         int arr1[]=new int[5];
         String s=new String("welcome");
         String s1="adesh";
         StringBuffer obj1=new StringBuffer("hello");
         obj1.append("pawan");
         System.out.println(obj1);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("pawan");
        xyz obj=new xyz(56,78);
        obj.display();
        xyz();
        get(2,3);
        xyz.get(3,4);
    }
}

class Substring {
    public static void main(String[] k) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') {
                str = str.substring(0, i) + '1' + str.substring(i + 1);
            }
        }

        System.out.println(str);
        xyz obj=new xyz(45,67);
        obj.display();
    }
}

class cmdla {
    public static void main(String[] k) {
        int n = k.length;
        // for(int i=0; i<n ; i++)
        // {
        // System.out.println(k[i]+" ");
        // }

        int a = Integer.parseInt(k[0]);
        int b = Integer.parseInt(k[1]);
        int c = a + b;
        System.out.println(+c);
        for (String str : k) {
            System.out.println(str + " ");
        }
    }
}
