import java.util.Scanner;
public class Transaction{

public void greet(){
	System.out.println("welcome");
	System.out.println("Choose an item: ");
}

//----------------------

public void purchase(){
   Scanner scan = new Scanner(System.in);
	System.out.print("coffee(1) or donut(2) (separate orders with commas): ");
	String reply = scan.nextLine();
   int n = reply.length();
   int n1 = 1; //first functions as counter then functions as indexer in the 2nd for loop
   String number = "";
   for(int i = 0; i<n;i++){
      if(reply.charAt(i)+"" == ",")n1++;
   }
   int[] choice = new int[n1+1];
   n1 = 0; //reset n1 for repurpose
   for(int i = 0; i<n; i++){
      if(reply.charAt(i)+"" == ","){
         choice[n1] = Integer.parseInt(number);
         n1++;
         number = "";
      }
      number += reply.charAt(i);
   }
}
	
	
}
