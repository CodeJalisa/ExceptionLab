package Hewitt.Jalisa;

/**
 * Created by jalisahewitt on 9/30/16.
 */
public class Calc{

    public static int add(int x, int y){
        int ans = x+y;
        return ans;

    }

    public static int sub(int x, int y) {
        int ans= x-y;
        return ans;

    }

    public static int mult(int x, int y){
        int ans= x*y;
        return ans;

    }

    public static int divide(int x, int y) throws DivisionByZeroException{
        if(y==0){
            throw new DivisionByZeroException();
        }
        int ans = x/y;

        return ans;

    }

    public static double squareRoot(double x) throws ComplexException{
        if(x<0){
            throw new ComplexException();
        }
        double y = Math.sqrt(x);
        return y;

    }




}

