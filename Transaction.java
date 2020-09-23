//Kevin xiao sept 2020

import java.util.Scanner;
//import java.util.*;
//import java.util.Arrays;  
public class Transaction{




public void greet(){
	System.out.println("welcome");
	System.out.println("here is today's menu: ");
}

//----------------------

   public int[] purchase(){
      Scanner scan = new Scanner(System.in);
      //dud code
      
   	/*System.out.print("coffee(1), donut(2), croissant(3), icedtea(4) (separate orders with commas): ");
   	String reply = scan.nextLine();
      int n = reply.length();
      int n1 = 1; //first functions as counter then functions as indexer in the 2nd for loop
      String number = "";
      for(int i = 0; i<n;i++){
         if(reply.charAt(i)+"" == ",")n1++;
      }
      int[] choice = new int[n1+1];
      choice[0]=0;
      n1 = 0; //reset n1 for repurpose
      for(int i = 0; i<n; i++){
         if((reply.charAt(i)+"").equals(",")){
            choice[n1] = Integer.parseInt(number);
            n1++;
            number = "";
         }
         else number += reply.charAt(i);
      }
      return choice;*/
      
      //end of dud code
      
      int[] reply = new int[4];//array to fetch customer reply
      System.out.print("number of coffee ($4 each):");
      reply[0] = scan.nextInt();
      scan.nextLine();
      
      System.out.print("number of donuts ($5 each):");
      reply[1] = scan.nextInt();
      scan.nextLine();
      
      System.out.print("number of croissant ($9 each):");
      reply[2] = scan.nextInt();
      scan.nextLine();
      
      System.out.print("number of icetea ($2 each):");
      reply[3] = scan.nextInt();
      scan.nextLine();
      
    
      return reply; 
   }
	
	


}
 
