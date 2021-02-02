import java.util.Scanner;

class Solver{
    int getFactorial(int n){
        int sum = 1;
        for (int base = 2; base <= n; base++) {
            sum *= base;
        }return sum;
    }
    int getFactorialByRecursion(int n){
        if (n==1) return n;
        else return n*(getFactorialByRecursion(n-1));
    }
}

public class GetFactorial{
    public static void main(String[] args) {
        Solver solver = new Solver();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int num = sc.nextInt();
        if (num == 0) System.out.println("Factorial of "+num+" is: "+1);
        else if (num < 0) System.out.println("Factorial can not be possiable for: "+num);
        else{
            int factorialValue = solver.getFactorialByRecursion(num);
            System.out.println("Factorial of "+num+" is: "+factorialValue);
            sc.close();
        }
    }
}