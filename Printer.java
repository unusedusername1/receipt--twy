//kevin xiao sept 2020
public class Printer {

public void print(String txt){
   //manages 1 line of text
   int n = txt.length();
   System.out.print("*    "); System.out.print(txt); 
   for(int i = 0; i < 34-n; i++) System.out.print(" "); //insert space until line length is 40
   System.out.println("*");

}

public void line(){

	System.out.println("****************************************");

}


}
