package calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class calculadoraTest {
	
	 @BeforeAll
	  static void init() {
	    System.out.println("COMIENZO DE LAS OPERACIONES");
	  }

	  @BeforeEach
	  void setUp() {
	    System.out.println("----------------------");
	  }
	 @Test
	  public void testSumaOk() {
	    int resultadoEsperado = 10;
	    int resultadoActual = Calculadora.suma(6, 4);
	    assertEquals(resultadoEsperado, resultadoActual);
	    System.out.println("TestSumar OK");
	    System.out.println("El resultado esperado de la Suma es: " + resultadoEsperado);
	    System.out.println("El resultado actual de la Suma es " + resultadoActual);
	  }
	  
	  @Test
	  public void testRestaOk() {
	    int resultadoEsperado = 2;
	    int resultadoActual = Calculadora.resta(6, 4);
	    assertEquals(resultadoEsperado, resultadoActual);
	    System.out.println("Test Restar OK");
	    System.out.println("El resultado esperado de la Resta es: " + resultadoEsperado);
	    System.out.println("El resultado actual de la Resta es " + resultadoActual);
	  }
	  
	  @Test
	  public void testSumaFallo() {
	    int resultadoEsperado = 10;
	    int resultadoActual = Calculadora.suma(5, 4); 
	    assertNotEquals(resultadoEsperado, resultadoActual);
	    System.out.println("Test Sumar Fallo");
	    System.out.println("El resultado esperado de la Suma es: " + resultadoEsperado);
	    System.out.println("El resultado actual de la Suma es " + resultadoActual);
	  }
	  
	  @Test
	  public void testRestaFallo() {
	    int resultadoEsperado = 3;
	    int resultadoActual = Calculadora.resta(6, 4); 
	    assertNotEquals(resultadoEsperado, resultadoActual);
	    System.out.println("Test Restar Fallo");
	    System.out.println("El resultado esperado de la Resta es: " + resultadoEsperado);
	    System.out.println("El resultado actual de la Resta es " + resultadoActual);
	  }
	  @Test
	  public void testMultiplicacionOk() {
	      int resultadoEsperado = 20;
	      int resultadoActual = Calculadora.multiplicacion(5, 4);
	      assertEquals(resultadoEsperado, resultadoActual);
	      System.out.println("Test Multiplicación OK");
	      System.out.println("El resultado esperado de la Multiplicación es: " + resultadoEsperado);
	      System.out.println("El resultado actual de la Multiplicación es " + resultadoActual);
	  }

	  @Test
	  public void testMultiplicacionFallo() {
	      int resultadoEsperado = 20;
	      int resultadoActual = Calculadora.multiplicacion(6, 4);
	      assertNotEquals(resultadoEsperado, resultadoActual);
	      System.out.println("Test Multiplicación Fallo");
	      System.out.println("El resultado esperado de la Multiplicación es: " + resultadoEsperado);
	      System.out.println("El resultado actual de la Multiplicación es " + resultadoActual);
	  }

	  @Test
	  public void testDivisionOk() {
	      int resultadoEsperado = 5;
	      int resultadoActual = Calculadora.division(15, 3);
	      assertEquals(5, resultadoActual);
	      System.out.println("Test División OK");
	      System.out.println("El resultado esperado de la División es: " + resultadoEsperado);
	      System.out.println("El resultado actual de la División es " + resultadoActual);
	  }

	  @Test
	  public void testDivisionFallo() {
	      int resultadoEsperado = 15;
	      int resultadoActual = Calculadora.division(20, 2);
	      assertNotEquals(2, resultadoActual);
	      System.out.println("Test División Fallo");
	      System.out.println("El resultado esperado de la División es: " + resultadoEsperado);
	      System.out.println("El resultado actual de la División es " + resultadoActual);
	  }
	  
	  @AfterEach
	  void tearDown() {
	    System.out.println("=================");
	  }

	  @AfterAll
	  static void close() {
	    System.out.println("FIN DE LAS OPERACIONES");
	  }
	  


  }



	
    

