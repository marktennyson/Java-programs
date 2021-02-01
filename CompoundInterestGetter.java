import java.util.Scanner;

class Claculator{
    double rate;
    Claculator(double rate){
        this.rate = rate; 
    }
    double getInterest(double interval, double duration, double principal){
        double n = 12/interval;
        double x = Math.pow((1+(this.rate/(100*n))), (n*duration));
        double interest = principal*(x-1);
        return interest;
    }
}

public class CompoundInterestGetter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter interest rate: ");
        double rate = sc.nextDouble();
        System.out.println("Please Enter the interest interval(in months): ");
        double interval = sc.nextDouble();
        System.out.println("Please enter the time duration(in Years): ");
        double duration = sc.nextDouble();
        System.out.println("Please enter the principal amount: ");
        double principal = sc.nextDouble();
        Claculator claculator = new Claculator(rate);
        double interest = claculator.getInterest(interval, duration, principal);
        System.out.println("Your interest is: "+interest);
        System.out.println("Total amount after "+duration+" years: "+(principal+interest));
        sc.close();

    }
}