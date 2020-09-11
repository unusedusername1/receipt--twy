/* This is a java file 'stub' or piece of a file designed to get you started on 
* learning to code in java, while at the same time, exploring a little more about
* collaboration, version control and multiple file scenarios.
*
*For this assignment, I would like you to fork, modify and commit this file, while
* adding the following elements to your code.
* 
*   1. Leave this comment header block in place, but replace elements of name, date and
*         project name with your own (remmber you cannot change file or class name.
*   2. Imagine the following scenario and design your software to complete the following:
*        a. Using the concole window (AKA terminal screen) design a POS (Point of Sale System) printer
*        b. You are to generate a printed receipt for a Point of sale system, that includes:
*             i.   Line separation headers   i.e. *********************************'
*             ii.  ASCII simple art for a box around name of Store, location, date of transaction
*             iii. line for cashier user account logged in
*             iv.  transaction details for at least three items purchases in POS recent memory
*             v.   lines for subtotals, tax, and total amound due as well as tender type and 
*             vi.  where necessary, change due or a mock credit card number (last 4 digits and expiry date
*       c. Menu system for your POS (Point of Sale) operation could include more static elements like:
*             i.   Variation of tax amount
*             ii.  user login, store number
*             iii. seasonal or promotional message that could change from time to time.
*
* That's a good start.
*/

public class Register {

//this could be the interactions for the user, that may include login, custom message, etc.
// a menu system may call upon the transaction 'window' or screen
// then you could call up a receipt printer function.

public static void main (String[] args) {

	//main menu system
	// how will you call upon or implement other classes?

	Transaction t1 = new Transaction();
	Printer p1 = new Printer();
	
	t1.greet();
	t1.purchase();
	p1.print("e");
	
	}  //close main method

}  // close the class

