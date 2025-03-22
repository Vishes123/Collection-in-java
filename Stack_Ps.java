package collection;

import java.util.Stack;

public class Stack_Ps {
	public static void main(String[] args) {
		
// Stack is Implemented class of list Interface in java it extend vector 
// Stack Flow LIFO Order in java it is ledges class in java 
		
		Stack s = new Stack<>();
		
		// some method in stack in java 
		
		// by using push method you can add element in stack
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		// by using pop method you can remove Top element to the stack and
		//we can not pass index in pop method
		Integer top = (Integer) s.pop();
		System.out.println(s);
		System.out.println("Remove by pop Method : "+top);
		System.out.println(s);
		// you can cheak top element to the stack by using peek method and 
		//we can pass any index in peep method
		Integer peekTop = (Integer) s.peek();
		System.out.println("Cheack Top element by peek : "+peekTop);
		System.out.println(s);
		// search method in stack search find element -1 
		// Ex ---> search(3);
		//3-1= 2 index 
		// give value of 2nd index	 
		 System.out.println(s.search(3));
		
		
		
		
	}
}
