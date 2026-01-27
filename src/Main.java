public class Main {
    public static void main(String[] args) {
        StackTester tester = new StackTester();
        tester.pushNumber(5);
        tester.listNumbersInStack();
        tester.pushNumber(7);
        tester.listNumbersInStack();
        tester.pushNumber(2);
        tester.listNumbersInStack();
        tester.popNumber();
        tester.pushNumber(9);
        tester.listNumbersInStack();
    }
}