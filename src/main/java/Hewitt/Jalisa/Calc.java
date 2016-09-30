package Hewitt.Jalisa;

/**
 * Created by jalisahewitt on 9/30/16.
 */
public class Calc {

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

    public static int divide(int x, int y) throws ArithmeticException{
        int ans = x/y;
        if(y==0){
            throw new ArithmeticException("You cant divide by zero, dumbass");
        }
        return ans;

    }





}

