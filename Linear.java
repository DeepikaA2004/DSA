/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class CustomStack {
	private int[] stackArray;
	int top = -1;

	public CustomStack(int size) {
		stackArray = new int[size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!");
			return -1;
		} else {
			return stackArray[top];
		}
	}

	public void push(int element) {
		if (top == stackArray.length - 1) {
			System.out.println("Stack is Full!");
		} else {
			stackArray[++top] = element;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty!");
			return -1;
		} else {
			return stackArray[top--];
		}
	}

	public int size() {
		return top + 1;
	}

}

class GFG {
	public static void main(String[] args) {
		/*
		 * 
		 * - STACK -
		 * 1. Check for Empty: Write a function to determine if a stack is empty.
		 * 2. Peek: Write a function to return the top element of a stack without
		 * removing it.
		 * 3. Push: Write a function to add an element to the top of a stack.
		 * 4. Pop: Write a function to remove and return the top element of a stack.
		 * 5. Get Size: Write a function to return the number of elements in a stack.
		 * 6. Implement a Stack: Create a stack data structure using an array or linked
		 * list.
		 * 7. Reverse a String: Use a stack to reverse the characters of a given string.
		 * 8. Balanced Parentheses: Check if a string of parentheses is balanced (e.g.,
		 * "(())" is balanced, ")(())" is not).
		 * 
		 * - QUEUE -
		 * 9. Check for Empty: Write a function to determine if a queue is empty.
		 * 10. Enqueue: Write a function to add an element to the rear of a queue.
		 * 11. Dequeue: Write a function to remove and return the element at the front
		 * of a queue.
		 * 12. Peek: Write a function to return the element at the front of a queue
		 * without removing it.
		 * 13. Get Size: Write a function to return the number of elements in a queue.
		 * 14. Implement a Queue: Create a queue data structure using an array or linked
		 * list.
		 * 15. Reverse a Queue: Reverse the elements of a given queue.
		 * 
		 */

		Stack<Integer> stack = new Stack<>();

		// Q1

		// 1st Way
		System.out.println(stack.isEmpty());

		// 2nd Way
		System.out.println(stack.size() == 0);

		// Q3
		stack.push(2);
		stack.push(3);
		stack.push(4);

		// Q2
		System.out.println(stack.peek());

		// Q4
		System.out.println(stack.pop());

		// Q5
		System.out.println(stack.size());

		// Q6
		CustomStack stack2 = new CustomStack(10);
		stack2.push(10);
		stack2.push(11);
		stack2.push(12);
		System.out.println("The size of CustomStack is : " + stack2.size());
		System.out.println("The top element of CustomStack is : " + stack2.peek());
		System.out.println("The top element of CustomStack is : " + stack2.pop());
		System.out.println(stack2.isEmpty());

		// Q7
		// Saturday => yadrutaS
		String str = "Saturday", str2 = "";
		int n = str.length();

		Stack<Character> stack3 = new Stack<>();

		for (int i = 0; i < n; i++) {
			stack3.push(str.charAt(i));
		}

		while (stack3.size() > 0) {
			str2 += stack3.pop();
		}

		System.out.println(str2);

		// Q8
		int flag = 1;
		stack3 = new Stack<>();

		String exp = "{[]}()";

		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				stack3.push(ch);
			} else if (stack3.isEmpty() || isMatchingPair(stack3.pop(), ch) == false) {
				System.out.println("Not a valid parentheses");
				flag = 0;
				break;
			}
		}

		if (stack3.isEmpty()) {
			System.out.println("Valid parentheses");
		}

		// QUEUE - A NICE DATA structure

		Queue<Integer> queue = new LinkedList<>();

		// Q9

		// 1st Way
		// System.out.println(queue.isEmpty());

		// //2nd Way
		// System.out.println(queue.size() == 0 );

		// Q10
		// 1st way
		queue.offer(2);
		queue.offer(4);
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);

		// 2nd way
		queue.add(3);
		queue.add(5);

		// q11
		System.out.println(queue.poll());

		// Q12
		System.out.println(queue.peek());

		// Q13
		System.out.println(queue.size());

		System.out.println(queue);

		// Q14 : HOME ASSIGNMENT

		// Q15

		queue.offer(2);
		queue.offer(4);
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);

		Stack<Integer> helper = new Stack<>();

		System.out.println(queue);

		while (queue.size() > 0) {
			helper.push(queue.poll());
		}

		while (helper.size() > 0) {
			queue.add(helper.pop());
		}
		System.out.println(queue);

	}

	public static boolean isMatchingPair(char opening, char closing) {

		return ((opening == '(' && closing == ')') ||
				(opening == '[' && closing == ']') ||
				(opening == '{' && closing == '}'));
	}

}
