public class ProblemTwo {

    static int a = 1; 
    static int b = 2;
    static int c = 1;

    static void fib(int count) {
        if (count > 0) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(" " + c);

            //to make recursive, include: 
            fib(count - 1);
        }
    }

    public static void main(String args[]) {
        int count = 10;
        System.out.print("Fibonacci sequence is: ");
        System.out.print(a + " " + b);
        fib(count - 2);  
    }
}