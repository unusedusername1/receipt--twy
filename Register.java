import java.util.Scanner;
/* Kevin xiao september 2020
*/

public class Register {

//tThis could be the interactions for the user, that may include login, custom message, etc.
// a menu system may call upon the transaction 'window' or screen
// then you could call up a receipt printer function.

public static void main (String[] args) {
   
   
   Scanner s = new Scanner(System.in);
   
   int[] stock = new int[4]; // 0 = coffee, 1 = donut, 2 = croissant, 3 = icetea; 100 each in stock
   for(int i = 0; i < stock.length; i++)stock[i] = 100;
   double earnings = 0; 
   
   //loop so that you dont need to run program every time u use it. there is option to quit
   while(true){
      System.out.print("r(register), q(quit), i(inventory): ");
      String response = s.nextLine();
      if(response.equals("r")){
         double[] fetch = reg();
         for(int i = 0; i<4; i++){
            stock[i] -= fetch[i];
         }
         earnings += fetch[4];
      }
      else if(response.equals("q")) break;
      else if(response.equals("i")){inv(stock, earnings);       
      }
      
      
   }	
}  //close main method


//register function--------
public static double[] reg (){
      
	Transaction t1 = new Transaction();//reference other classes
	Printer p1 = new Printer();
	
	t1.greet();
   int[] purch = t1.purchase();//takes customer input as arrays, 
   
   p1.line();
   p1.print("                 _     _   ");
	p1.print(" ___ ___ ___ ___|_|___| |_ ");
   p1.print("|  _| -_|  _| -_| | . |  _|");
   p1.print("|_| |___|___|___|_|  _|_|  ");
   p1.print("                  |_|      ");
   
   int i1 = 0;//receipt
   if(purch[i1] != 0) p1.print(purch[i1] + " coffee(s): " + "$" + 4.00*purch[i1]); i1++;//iterate to next set of values in array
   if(purch[i1] != 0) p1.print(purch[i1] + " donut(s): " + "$" + 5.00*purch[i1]); i1++;
   if(purch[i1] != 0) p1.print(purch[i1] + " croissant(s): " + "$" + 9.00*purch[i1]); i1++;
   if(purch[i1] != 0) p1.print(purch[i1] + " icetea(s): " + "$" + 2.00*purch[i1]);
   p1.print("---------------------");
   double cost = Math.round(100*(4.00*purch[0]+5.00*purch[1]+9.00*purch[2]+2.00*purch[3]))/100.0;
   p1.print("sub-total: $" + cost);
   p1.print("total (with 12% VAT): $" + Math.round(1.12*cost*100)/100.0); 
   p1.print("");
   p1.line();
   System.out.println("\n");
   double[] rt = new double[5];//1st four are the fooditems, and the last one is the cash earned
   for(int i = 0; i<4; i++){
   rt[i] = purch[i];
   }
   rt[4] = cost;
   return rt;//returns as rt
}
//----- end of reg funct ---

public static void inv(int[] stock, double rev){
   Printer p2 = new Printer();
   p2.line();
   p2.print("");
   p2.print("inventory: ");
   String[] def = new String[]{"coffee", "donut", "croissant", "icetea"};
   for(int i = 0; i < stock.length; i++){
      p2.print(stock[i] + def[i] + "s left");
   }
   p2.print("$" + rev + " earned");
   p2.print("");
   p2.line();
}

}  // close the class
