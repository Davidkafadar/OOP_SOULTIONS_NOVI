package pckg_algoritam;

public interface STACK<E> {
	/**
	 * Method that returns actual size of a stack
	 * size is equal 
	 * 
	 */
	int size();
	
	/**
	 * Method that checks if stack is empty
	 * true if empty false if not
	 * @return true or false
	 */
	boolean isEmpty();
	
	/**
	 * Fetch but doesn't remove last element in the stack.
	 * @return element or null
	 */
	E top();
	
	/**
	 *fetch and remove last element in the stack 
	 * @return element or null
	 */
	E pop();
	
	/**
	 * Add the element at the last position in the stack
	 * @param element
	 */
	void push (E element);
	

}
