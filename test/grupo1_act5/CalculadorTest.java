package grupo1_act5;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadorTest {
    private Calculador calculador;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("¡Bienvenido a la suite de pruebas!");
    }

    @Before
    public void setUp() {
        calculador = new Calculador();
        System.out.println("Prueba: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void testSumar() {
        System.out.println("Probando suma");
        double result = calculador.sumar(10.0, 5.0);
        assertEquals(15.0, result, 0.001);
    }

    @Test
    public void testRestar() {
        System.out.println("Probando resta");
        double result = calculador.restar(10.0, 5.0);
        assertEquals(5.0, result, 0.001);
    }

    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("La operación ha finalizado");
    }
}
