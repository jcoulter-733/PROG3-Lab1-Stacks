import java.util.Scanner;

public class BinaryConvertor
{
    Stack myStack = new Stack(8);
    Scanner scanner = new Scanner(System.in);
    public void getNumber(){
        System.out.println("Enter a number between 0 & 128: ");
        int i = scanner.nextInt();

        convertToBinary(i);
    }

    private void convertToBinary(int n){
        while( n> 0){
            int r = n%2;
            myStack.push(r);
            n/= 2;
        }
    }

    public void displayBinary(){
        String binaryString = "";
        while(!myStack.isEmpty()){
            String n = myStack.pop().toString();
            binaryString += n;
        }

        System.out.println("Binary Value is: " + binaryString);
    }
}
