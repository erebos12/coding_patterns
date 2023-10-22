package factorial;


import static java.lang.Math.E;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Factorial {

  public static long factorial(int n) {
    if (n <= 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  /*
  The stirling formular calculates approximately factorial.
  Good for very big factorial calculations.
   */
  public static double factorialStirlingFormular(int n) {
    return sqrt(2 * PI * n) * pow((n / E), n);
  }

  public static double factorialLowerBound01(int n) {
    return pow(2, n - 1);
  }

  public static double factorialUpperBound01(int n) {
    return pow(n, n);
  }

  public static double factorialLowerBound02(int n) {
    return pow(n, ((double) n / 2));
  }

  public static double factorialUpperBound02(int n) {
    return pow((double) (n + 1) / 2, n);
  }

  public static double factorialLowerBound03(int n) {
    return E * pow((n / E), n);
  }

  public static double factorialUpperBound03(int n) {
    return n * E * pow((n / E), n);
  }

}
