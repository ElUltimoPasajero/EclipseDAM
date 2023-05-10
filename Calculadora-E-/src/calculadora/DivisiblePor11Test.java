package calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class DivisiblePor11Test {

  @ParameterizedTest
  @ValueSource(ints = {33, 68, 127})
  public void testDivisiblePor11(int numero) {
   
	  if (numero%11==0) {
		  
		  System.out.println("El numero " + numero + " es divisible por 11");
	  }else {
		  
		  System.out.println("El numero " + numero + " no es divisible por 11");

	  }
 
  }

}