package recursividad;

public class Factorial {
    public int factorialCiclo(int n){
        int factor=1;
        if(n<0){
            return 0;
        }else {
            while(n!=0){
                factor = n*factor;
                n--;
            }
            return factor;
        }
    }

    public int factorialRecursivo(int n){
        //validamos
        if(n<0){
            return 0;
        }else {
            if (n==0){
                return 1;
            }else {
                //Dominio (problema-1)
                return n*factorialRecursivo(n-1);
            }
        }
    }

    public static void main(String[] args) {
        Factorial factorial1 = new Factorial();
        System.out.println(factorial1.factorialRecursivo(5));
    }
}
