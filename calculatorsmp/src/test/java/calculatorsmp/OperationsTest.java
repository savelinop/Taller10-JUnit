/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculatorsmp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author CltControl
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of MakeFormula method, of class Operations.
     */
    
    
    @Test
    @DisplayName("Prueba de construccion sin datos null")
    public void testMakeFormula_no_null() {
        String formula = "";
        Assertions.assertNotNull(formula);
        Assertions.assertFalse(formula.isEmpty());
        
        
    }


    @Test
    @DisplayName("Prueba de multiplicacion luego suma")
    public void testSolveMultiplicacionLuegoSuma() {
        String resultado = Operations.Solve("8*2+1");
        assertEquals("8*2+1=17", resultado);
    }

    @Test
    @DisplayName("Prueba de solo resta y multiplicacion")
    public void testSolveRestaMultiplicacion() {
        String resultado = Operations.Solve("20-5*2");
        assertEquals("20-5*2=10", resultado);
    }

    @Test
    @DisplayName("Prueba de solo suma")
    public void testSolveSoloSuma() {
        String resultado = Operations.Solve("7+3+2");
        assertEquals("7+3+2=12", resultado);
    }

    @Test
    @DisplayName("Prueba de solo multiplicacion")
    public void testSolveMultiplicacion() {
        String resultado = Operations.Solve("2*3*4");
        assertEquals("2*3*4=24", resultado);
    }

    @Test
    
    @DisplayName("Prueba de solo Division")
    public void testSolveDivision() {
        String resultado = Operations.Solve("12/3+1");
        assertEquals("12/3+1=5", resultado);
    }

    
    @Test
    @DisplayName("Prueba de Construccion 2 signos juntos")
    public void testMakeFormula_no_operadores_juntas(){
        assertThrows(IllegalArgumentException.class, ()->{
            String question = "02++02";
            System.out.println(question);
            
        });
    
        
        
    
    }
    
    
    
    
    
}
