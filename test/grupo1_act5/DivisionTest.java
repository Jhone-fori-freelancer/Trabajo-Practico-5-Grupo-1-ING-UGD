package grupo1_act5;

import org.junit.Test;
import static org.junit.Assert.assertThrows;

public class DivisionTest {
    @Test
    public void testDivisionCero() {
        Calculador calculador = new Calculador();
        assertThrows(ArithmeticException.class, () -> calculador.dividir(10.0, 0.0));
    }
}
