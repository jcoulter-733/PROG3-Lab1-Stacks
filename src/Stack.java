/**
 * class Stack
 * 
 * @author Jim
 * @version 1.0
 */
public class Stack {
    private Object[] stack ;        // to hold the stack of integers
    private int total;      // to track number of items
    
    public Stack(int size) {
        stack = new Object[size];    // size array with parameter
        total = 0;          // set number of items to zero
    }
    
    /**
     * add an item to the array
     */
    public boolean push(Object obj) {
        if ( isFull() == false)         // checks if space in stack
        {
            stack[total] = obj;   // add item
            total++;        // increment item counter
            return true;        // to indicate success
        }
        else {
            return false;       // to indicate failure
        }
    }
    
    /**
     * remove an item by obeying LIFO rule
     */
    public Object pop() {
        if (isEmpty() == false)     // makes sure stack is not empty
        {
            // reduce counter by one
            Object obj = stack[total-1];
            stack[total-1]= null;    // to indicate success
            total--;
            return obj;
        }
        else {
            return null;       // to indicate failure
        }
    }
    
    /**
     * checks if array is empty
     */
    public boolean isEmpty() {
        if (total ==0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * checks if array is full
     */
    public boolean isFull() {
        if (total ==stack.length) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    /**
     * returns the item at index i
     */
    public Object getItem(int i) {
        return stack[i-1];      // ith item at position i-1
    }
    
    
    /**
     * return the number of items in the array
     */
    public int getTotal() {
        return total;
    }
    
}

