package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    /*// A utility function to return precedence of a given operator
    // Higher returned value means higher precedence
    static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
      
    // The main method that converts given infix expression
    // to postfix expression. 
    static String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");
         
        // initializing empty stack
        Stack<Character> stack = new Stack<Character>();
         
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
             
             // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
              
            // If the scanned character is an '(', push it to the stack.
            else if (c == '(')
                stack.push(c);
             
            //  If the scanned character is an ')', pop and output from the stack 
            // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result += stack.pop();
                 
                if (!stack.isEmpty() && stack.peek() != '(')
                    return "Invalid Expression"; // invalid expression                
                else
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek()))
                    result += stack.pop();
                stack.push(c);
            }
        }
      
        // pop all the operators from the stack
        while (!stack.isEmpty())
            result += stack.pop();
        return result;
    }
   
    // Driver method 
    public static void main(String[] args) 
    {
    	String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println("Actaul expression is "+exp);
		System.out.println("**************************");
		System.out.println(infixToPostfix(exp));
    }*/
	
	/***************** ANOTHER WAY **************/
	/**
	  * Checks if the input is operator or not
	  * @param c input to be checked
	  * @return true if operator
	  */
	 private boolean isOperator(char c){
         return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
     }
	  
	 /**
	  * Checks if c2 has same or higher precedence than c1
	  * @param c1 first operator
	  * @param c2 second operator
	  * @return true if c2 has same or higher precedence
	  */
	 private boolean checkPrecedence(char c1, char c2){
	  if((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
	   return true;
	  else if((c2 == '*' || c2 == '/') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
	   return true;
	  else return (c2 == '^') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/');
	 }
	  
	 /**
	  * Converts infix expression to postfix
	  * @param infix infix expression to be converted
	  * @return postfix expression
	  */
	 public String convert(String infix){
	  System.out.printf("%-8s%-10s%-15s\n", "Input","Stack","Postfix");
	  String postfix = "";  //equivalent postfix is empty initially
	  Stack<Character> s = new Stack<Character>();  //stack to hold symbols
	  s.push('#');  //symbol to denote end of stack
	 
	  System.out.printf("%-8s%-10s%-15s\n", "",format(s.toString()),postfix);  
	 
	  for(int i = 0; i < infix.length(); i++){
	   char inputSymbol = infix.charAt(i);  //symbol to be processed
	   if(isOperator(inputSymbol)){  //if a operator
	    //repeatedly pops if stack top has same or higher precedence
	    while(checkPrecedence(inputSymbol, s.peek()))
	     postfix += s.pop();
	    s.push(inputSymbol);
	   }
	   else if(inputSymbol == '(')
	    s.push(inputSymbol);  //push if left parenthesis
	   else if(inputSymbol == ')'){
	    //repeatedly pops if right parenthesis until left parenthesis is found
	    while(s.peek() != '(') 
	     postfix += s.pop();
	    s.pop();
	   }
	   else
	    postfix += inputSymbol;
	   System.out.printf("%-8s%-10s%-15s\n", ""+inputSymbol,format(s.toString()),postfix);  
	  }
	 
	  //pops all elements of stack left
	  while(s.peek() != '#'){
	   postfix += s.pop();
	   System.out.printf("%-8s%-10s%-15s\n", "",format(s.toString()),postfix);  
	 
	  }
	   
	  return postfix;
	 }
	  
	 /**
	  * Formats the input  stack string
	  * @param s It is a stack converted to string
	  * @return formatted input
	  */
	 private String format(String s){
	  s = s.replaceAll(",","");  //removes all , in stack string
	  s = s.replaceAll(" ","");  //removes all spaces in stack string
	  s = s.substring(1, s.length()-1);  //removes [] from stack string
	   
	  return s;
	 }
	  
	 public static void main(String[] args) {
	  InfixToPostfix obj = new InfixToPostfix();
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Infix : \t");
	  String infix = sc.next();
	  System.out.print("Postfix : \t"+obj.convert(infix));
	 }
}
