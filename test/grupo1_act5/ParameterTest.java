package grupo1_act5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterTest {
    private double a;
    private double b;
    private double expectedResult;

    public ParameterTest(double a, double b, double expectedResult) {
        this.a = a;
        this.b = b;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {8.0, 7.0, 15.0},  // Suma esperada: 8 + 7 = 15
            {2.0, 0.0, 2.0},   // Suma esperada: 2 + 0 = 2
            {10.0, -1.0, 9.0}  // Suma esperada: 10 + (-1) = 9
        });
    }

    @Test
    public void testSumar() {
        Calculador calculador = new Calculador();
        double result = calculador.sumar(a, b);
        System.out.println("Probando suma de " + a + " + " + b + " = " + result);
        assertEquals(expectedResult, result, 0.001);
    }
}
