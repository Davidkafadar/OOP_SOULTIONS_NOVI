package pckg_algoritam;

import java.util.Arrays;

public class ArrayStackImplementation<E> implements STACK<E> {
	private E [] stack;
	private int ind = -1;
	private static final int CAPACITY=50;
	
	public ArrayStackImplementation() {
		this.stack =(E[]) new Object [CAPACITY];
		
	}
	public ArrayStackImplementation(int capacity) {
		this.stack = (E[]) new Object[capacity];
	}
	

	@Override
	public int size() {
		
		return ind + 1;
	}

	@Override
	public boolean isEmpty() {
		
		return ind == -1;
	}

	@Override
	public E top() {
		E element = null;
		if(isEmpty()) {
			System.out.println("The stack is empty - nothing to fetch!");
		}else {
			element = stack[ind];
		}
		
		return element;
	}

	@Override
	public E pop() {
		E element = null;
		if(isEmpty()) {
			System.out.println("Nothintg to remove - stack is empty!");
		}else {
			element = stack[ind];
			stack[ind] = null;
			ind--;
			System.out.println("Element removed from stack!: " + element);
		}
		return element;
	}

	@Override
	public void push(E element) {
		ind += 1;
		System.out.println("Pushing to index position: "+ ind + " size : " + size() + " | length " + stack.length);
		if (ind >= stack.length) {
			ind -= 1;
			System.out.println("Stack is full - unable to push up until pop operation");
		}else {
			stack [ind]= element;
			System.out.println("Pushed element on the top of the stack!");
			
			
		}
		
		
	}
	@Override
	public String toString() {
		String rep = "size: "+ size()+ "\n";
		for (int k = stack.length-1; k >=0; k--) {
			rep = rep + "| " + stack [k] + " |\n";
		}
		return rep;
	}
	

}
