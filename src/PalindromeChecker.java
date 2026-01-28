import java.util.Scanner;

public class PalindromeChecker {
    Stack myStack = new Stack(28);
    Scanner scanner = new Scanner(System.in);

    public void check(){
        System.out.println("Enter a word: ");
        String forwardString = scanner.nextLine();

        String reverseString = getReverseString(forwardString);

        boolean isPalindrome = checkWord(reverseString, forwardString);

        printResult(isPalindrome, forwardString);


    }
    private void printResult(boolean palindrome, String forwardString){
        if (palindrome){
            System.out.println(forwardString + " is a palindrome");
        }
        else{
            System.out.println(forwardString + " is not a palindrome");
        }
    }

    private boolean checkWord(String forward, String reverse){
        if(forward.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
    private String getReverseString(String word){
        String reverseString = "";

        for(char c: word.toCharArray()){
            myStack.push(c);
        }

        while(!myStack.isEmpty()){
            String c = myStack.pop().toString();
            reverseString = reverseString + c;
        }
        System.out.println(reverseString);
        return reverseString;

    }
}
