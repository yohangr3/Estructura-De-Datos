package recursividad;

public class Fibonacci {

    public int FibonacciRecursivo(int n) {

        if (n == 1 || n == 2) {
            //Caso base
            return 1;
        } else {
            return FibonacciRecursivo(n - 1) + FibonacciRecursivo(n - 2);
        }

    }

    public int fibonacciCiclo(int n) {
        int fibo = 0,primero =1,segundo =0;
        while (n>0){
            fibo =primero+segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        return fibo;
    }

    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci();
        System.out.println(f1.FibonacciRecursivo(12));
        System.out.println(f1.fibonacciCiclo(12));
    }

}
