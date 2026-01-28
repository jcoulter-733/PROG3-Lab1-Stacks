import java.util.Scanner;
public class Reverse {

    private Stack myStack = new Stack(5);
    Scanner scanner = new Scanner(System.in);

    public void getChars(){
        for (int i = 1; i < 6; i++){
            System.out.println("Enter character " + i +":");
            char c = scanner.nextLine().charAt(0);
            myStack.push(c);
        }
    }

    public void reverseChars(){
        System.out.println("---Stack Reversed---");
        while(!myStack.isEmpty()){
            String c = myStack.pop().toString();

            System.out.println(c);
        }



    }
}
