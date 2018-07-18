package com.ex2;
//import java.util.Scanner;
/*public class Newest {

	     public static void main(String args[]){  
         int i,fact=1;  
         
        

         int number = 25;

         for(i=1;i<=number;i++){    
             fact=fact*i;    
            // long l = Long.valueOf(fact);
            
         }  
         long l = new Long(fact);
         System.out.println("Factorial of "+number+" is: "+l);    
        }  
       }  */

public class Newest {
           public int fact(int a) {
        	   int fact=1;
        	   for(int i=1;i<=a;i++) {
        		   fact = fact*i;
        	   }
        	   return fact;
           }
	    
   public static void main(String[] args) {

     Newest n = new Newest();
     int obj = n.fact(27);
     System.out.println(Long.valueOf(obj));
      
   }
}
