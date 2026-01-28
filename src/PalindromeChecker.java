import java.util.Scanner;

public class PalindromeChecker {
    Stack myStack = new Stack(28);
    Scanner scanner = new Scanner(System.in);

    public void getWord(){
        System.out.println("Enter a word: ");
        String forwardString = scanner.nextLine();

        String reverseString = getReverseString(forwardString);


    }

    private String getReverseString(String w){
        String reverseString = "";

        while(!myStack.isEmpty()){
            String c = myStack.pop().toString();
            reverseString += c;
        }
        return reverseString;

    }
}
