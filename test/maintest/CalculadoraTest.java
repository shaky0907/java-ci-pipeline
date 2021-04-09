package maintest;
import static org.junit.Assert.*;

import main.Calculadora;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    public void escenario(){
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar(){
        escenario();
        assertTrue(calculadora.sumar(2,2)==(2+2));
        assertTrue(calculadora.sumar(3,3)==(3+3));

    }
    @Test
    public void testRestar(){
        escenario();
        assertTrue(calculadora.restar(2,2)==(2-2));
        assertTrue(calculadora.restar(4,4)==(4-4));
    }
    @Test
    public void testMult(){
        escenario();
        assertTrue(calculadora.mult(2,2)==(2*2));
        assertTrue(calculadora.mult(5,5)==(5*5));
    }
    @Test
    public void testDiv(){
        escenario();
        assertTrue(calculadora.div(2,2)==(2/2));
        assertTrue(calculadora.div(6,6)==(6/6));
    }

}
