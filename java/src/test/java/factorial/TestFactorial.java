package factorial;

import static factorial.Factorial.factorial;
import static factorial.Factorial.factorialLowerBound01;
import static factorial.Factorial.factorialLowerBound02;
import static factorial.Factorial.factorialLowerBound03;
import static factorial.Factorial.factorialStirlingFormular;
import static factorial.Factorial.factorialUpperBound01;
import static factorial.Factorial.factorialUpperBound02;
import static factorial.Factorial.factorialUpperBound03;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFactorial {


  @Test
  void testFactorial_simple() {
    assertEquals(6, factorial(3));
    assertEquals(24, factorial(4));
  }

  @Test
  void factorialTest_not_calculatable() {
    // cannot be calculated - to big
    assertEquals(0, factorial(80));
  }

  @Test
  void testSterlingFormular() {
    // 7.14949447318118E118 = 7.14949447318118 × 10^118
    assertEquals(7.14949447318118E118, factorialStirlingFormular(80));
  }

  @Test
  void testSmallFactorial_with_stirling() {
    // 5! = 120 ~ 118.0191679575901
    assertEquals(118.0191679575901, factorialStirlingFormular(5));
  }


  @Test
  void testFactorial_estimation_03() {
    // rough estimation
    int n = 4;
    double lower = factorialLowerBound03(n);
    assertEquals(12.74548950217317, lower);
    double upper = factorialUpperBound03(n);
    assertEquals(50.98195800869268, upper);
    var msg = String.format("Factorial of %s is between %s and %s", n, lower, upper);
    System.out.println(msg);
  }

  @Test
  void testFactorial_estimation_02() {
    // very rough estimation
    int n = 4;
    double lower = factorialLowerBound02(n);
    assertEquals(16.0, lower);
    double upper = factorialUpperBound02(n);
    assertEquals(39.0625, upper);
    var msg = String.format("Factorial of %s is between %s and %s", n, lower, upper);
    System.out.println(msg);
  }

  @Test
  void testFactorial_estimation_01() {
    // very very rough estimation ;-)
    int n = 4;
    double lower = factorialLowerBound01(n);
    assertEquals(8.0, lower);
    double upper = factorialUpperBound01(n);
    assertEquals(256.0, upper);
    var msg = String.format("Factorial of %s is between %s and %s", n, lower, upper);
    System.out.println(msg);
  }

}
