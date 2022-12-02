import java.util.*;
public class reverseString {
    public static void main(String []args) {
        StringBuilder st=new StringBuilder("hello");
        //StringBuffer front=new StringBuffer();
        for(int i=0 ; i<st.length()/2 ; i++)
      {
             int front=i;
             int back=st.length()-1-i;
             char frontchar=st.charAt(front);
             char backchar=st.charAt(back);
             st.setCharAt(front,backchar);
             st.setCharAt(back,frontchar);

        }
        System.out.println(st);
    }
}
