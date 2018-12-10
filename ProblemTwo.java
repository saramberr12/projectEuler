public class ProblemTwo {

    static int a = 0; 
    static int b = 1;
    static int c = 0;

    static void fib(int count) {
        int sum = 0;
        if (count > 0) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(" " + c);

            if (c % 2 == 0) {
                sum += c;
            }

            //to make recursive, include: 
            fib(count - 1);

            System.out.println();
            System.out.print("Even sums: " + sum);
        }
    }

    public static void main(String args[]) {
        int count = 35;
        int sum = 0;

        System.out.print("Fibonacci sequence is: ");
        System.out.print(a + " " + b);
        fib(count - 2);
    }
}