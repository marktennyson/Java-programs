class Equation{
    int a,b,c;
    Equation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;	
    }
    double[] calculate(){
        double d = Math.pow(this.b, 2) - (4*this.a*this.c);
        double e = Math.pow(d, 0.5);
        double x1 = -(this.b-e)/2*this.a;
        double x2 = -(this.b+e)/2*this.a;
        double[] res = {x1, x2};
        return res;
    }
}

public class QuardraticSolver {
    public static void main(String[] args) {
        int a = 1;
        int b = -10;
        int c = 16;
        Equation equation = new Equation(a,b,c);
        double[] ans = equation.calculate();
        System.out.println(ans[0]+" "+ans[1]);
    }
}
