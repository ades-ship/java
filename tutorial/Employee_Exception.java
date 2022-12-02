/*
Q16
 Write a java program to accept and print the employee details during runtime. The details will include employee id, name, dept_ Id. The program should raise an exception if user inputs incomplete or incorrect data. The entered value should meet the following conditions: 
(i) First Letter of employee name should be in capital letter. (ii) Employee id should be between 2001 and 5001 (iii) Department id should be an integer between 1 and 5. 
If the above conditions are not met then the application should raise specific exception else should complete normal execution. 

 */

import java.util.*;
class B {

     String name;
     int dp_id,em_id;
     B(String name,int em_id,int dp_id)
     {
         this.name=name;
         this.dp_id=dp_id;
         this.em_id=em_id;
     }
     void p()
     {
         int i=0;
       try{
           if(!(name.charAt(i)>='A' && name.charAt(i)<='Z'))
               throw new Exception("First letter of name should be in Capital Letter");
           System.out.println("Name: "+name);
         }
         catch(Exception e)
         {
        	 System.out.println(e);
         }

     	 try{
    		 if(dp_id>5 || dp_id<1)
                throw new Exception("Department id shou;ld be in range of 1 to 5");
    		  System.out.println("Department id: "+dp_id);
       	}
    	 catch(Exception e)
        {
      	 System.out.println(e);
        }
     	 try {
 			if(em_id>5001 || em_id<2001)
 	            throw new Exception("Empoloyee Id must be in range 2001 to 5001");
 			System.out.println("Employee id: "+em_id);
 		  }
 		 catch(Exception e)
         {
        	 System.out.println(e);
         }
    }
   }
        

public class Employee_Exception {
    public static void main(String []args)
   {
    
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the name:");
     String s=sc.nextLine();
     System.out.print("Enter the employee id:");
     int em_id=sc.nextInt();
     System.out.print("Enter the depatment id:");
     int dp_id=sc.nextInt();
     B obj=new B(s,em_id,dp_id);
      obj.p();
   }
}