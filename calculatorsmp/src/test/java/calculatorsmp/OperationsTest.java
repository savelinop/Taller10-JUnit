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
    @DisplayName("Prueba de Construccion 2 signos juntos")
    public void testMakeFormula_no_operadores_juntas(){
        assertThrows(IllegalArgumentException.class, ()->{
            String question = "02++02";
            System.out.println(question);
            
        });
        
        
        
        
        
    
    }
    
}
