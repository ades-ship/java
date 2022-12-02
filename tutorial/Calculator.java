/*Q17. Create a class MyCalculator which consists of a single method power(int, int). 
This method takes two integers, n and p, as parameters and finds np .
If either n or p is negative, then the method must throw an exception which says "n 
and p should be non-negative". 
Input Format 
Each line of the input contains two integers, n and p .
Output Format
Each line of the output contains the result ,if neither of n and p is negative. Otherwise the output contains "n and p should be non-negative". 
Sample Input 
35 24 00 -1 -2 -1 3 
Sample Output 
243
16
java.lang.Exception: n and p should not be zero. java.lang.Exception: n or p should not be negative. java.lang.Exception: n or p should not be negative. 
Explanation
In the first two cases, both n and p are positive. So, the power function returns the answer correctly. 
 
In the third case, both n and p are zero. So, the exception, "n and p should not be zero.” is printed. 
 
In the last two cases, at least one out of n and p is negative. So, the exception, "n or p should not be negative.” is printed for these two cases. 
Solution: 
*/
import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
for(int i=0;i<5;i++)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter n :");
int n=sc.nextInt();
System.out.println("Enter p :");
int p=sc.nextInt();
try{
if(n==0 && p==0)
throw new ArithmeticException("Both n and b are Zero");
}
catch(Exception e)
{
System.out.println(e);
}
try{
if(n<0||p<0)
throw new ArithmeticException("Either n or b is negative");
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(Math.pow(n,p));
}
}
}
