package Lab1.Library1;

public class eMath {
    public static int Power(int Base, int Exponent) {
        if (Exponent == 1)
            return Base * Exponent;
        else
            return Base * Power(Base, Exponent - 1);
    }
    public static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return (n * factorial(n-1));
    }
}