// push pop peek
import java.util.*;
import java.io.*;
public class  myStack {
	
	static void stack_push(Stack<Integer>stack) {
	for	(int i=0; i<5; i++) {
		
		stack.push(i);
	}
	}
	 static void stack_pop(Stack<Integer> stack)
	    {
	        System.out.println("Pop Operation:");
	 
	        for(int i = 0; i < 5; i++)
	        {
	       
	            System.out.println(stack.pop());
	        }
	    }
	static void stack_peek(Stack<Integer> stack)
    {
		
        System.out.println("Element on stack top: " + stack.peek());
    }
	public static void main(String[]args) {
	
		//stack<integer>stack= new stack<integer>();
		 Stack<Integer> stack = new Stack<Integer>();
		 stack_push(stack);
	      stack_pop(stack);
	        stack_push(stack);
	       stack_peek(stack);
		
	}
}