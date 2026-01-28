/**
 * class Stacktester
 *
 * @author Jim
 * @version 1.0
 */
public class StackTester {
    private Stack stack;
    
    public StackTester(){
        stack = new Stack(10);
    }
    
    public StackTester(Stack stack){
        this.stack = stack;
    }
    
    /**
     * push item onto stack
     */
    public void pushString(String str) {
        boolean ok = stack.push(new String(str));   // attempt to push
        if (!ok)                // check if push was unsuccessful
            System.out.println("Push unsuccessful");
        else
            System.out.println("Push successful");
    }
    
    /**
     * pop number from staff
     */
    public void popString() {
        String result = (String) stack.pop();
        if (result!=null)
            System.out.println("String is :" + result);
        else
            System.out.println("Pop unsuccessful");
    }
    
    /**
     * check if stack is empty
     */
    public void checkIfEmpty() {
        if (stack.isEmpty())
            System.out.println("Stack empty");
        else
            System.out.println("Stack is not empty");
    }
    
    /**
     * check if stack is full
     */
    public void checkIfFull() {
        if (stack.isFull())
            System.out.println("Stack full");
        else
            System.out.println("Stack is not full");
    }
    
    /**
     * list the numbers in stack
     */
    public void listStringsInStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack empty");
        }
        else {
            System.out.println("Numbers in stack are: ");
            System.out.println();
            for (int i=stack.getTotal(); i>=1; i--) {
                System.out.println(stack.getItem(i));
            }
            System.out.println();
        }
    }
    
}  
