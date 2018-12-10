public class ProblemTwo {

    static int a = 0; 
    static int b = 1;
    static int c = 0;

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