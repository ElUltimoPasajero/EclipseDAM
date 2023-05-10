package calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

@DisplayName("Tests para la tabla de multiplicar del 5")
public class TablaMultiplicarTest {

    @DisplayName("Imprime la tabla de multiplicar del 5")
    @RepeatedTest(value = 1, name = "Tabla de multiplicar del 5")
    public void testTablaMultiplicarDel5() {
        int numero = 5;
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }
    }
}