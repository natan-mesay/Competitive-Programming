package Week1;

public class FibonacciNumber {
    public int fib(int n) {
        if(n == 0) return 0;

        if(n <=2 ) return 1;


        return fib(n-1)+fib(n-2);
    }
}
