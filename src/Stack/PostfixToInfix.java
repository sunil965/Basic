package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {

	 private boolean isOperator(char c){
         return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
     }
	  
	 /**
	  * Converts any postfix to infix
	  */
	 public String convert(String postfix){
	  Stack<String> s = new Stack<String>();
	   
	  for(int i = 0; i < postfix.length(); i++){
	   char c = postfix.charAt(i);
	   if(isOperator(c)){
	    String b = s.pop();
	    String a = s.pop();
	    s.push("("+a+c+b+")");
	   }
	   else
	    s.push(""+c);
	  }
	   
	  return s.pop();
	 }
	  
	 public static void main(String[] args) {
	  PostfixToInfix obj = new PostfixToInfix();
	  Scanner sc =new Scanner(System.in);
	  System.out.print("Postfix : ");
	  String postfix = sc.next();
	  System.out.println("Infix : "+obj.convert(postfix));
	 }
}
