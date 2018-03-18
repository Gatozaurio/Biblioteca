import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CompararLibrosPrueba extends Contador{


    static Libro l1;
    static Libro l2;
    static Libro l3;
    static Libro l4;
    static Libro l5;


    @BeforeAll
    static void creacion() {
        Autor a1 = new Autor("Paco");
        Fecha f1 = new Fecha();
        l1 = new Libro("Viva er Whiskey", "Comedia", f1,a1);
        l2 = new Libro("Viva er Whiskey", "Comedia", f1,a1);
        l3 = new Libro("Suspenso en Programacion", "Terror", f1,a1);
        l4 = null;
        l5 = l1;
    }


    @AfterEach
    void afterEach() {
        super.afterEach();
    }

    @AfterAll
    static void nulear(){
        l1 = null;
        l2 = null;
        l3 = null;
        l4 = null;
        l5 = null;
    }

    @DisplayName("Prueba que comprueba si es falso el resultado.")
    @Test
    void pruebaUno(){
        assertFalse(l1.compararLibros(l3));
    }

    @DisplayName("Prueba que comprueba si es verdadero el resultado.")
    @Test
    void pruebaDos(){
        assertTrue(l1.compararLibros(l2));
    }


    @DisplayName("Prueba que comprueba que el resultado no sea correcto al meterle un null.")
    @Test
    void pruebaTres(){
        assertFalse(l1.compararLibros(l4));
    }


    @DisplayName("Prueba que comprueba si al compararlo consigo mismo da correcto.")
    @Test
    void pruebaCuatro(){
        assertTrue(l1.compararLibros(l1));
    }


    @DisplayName("Prueba que compreuba si da correcto con un objeto que tiene la misma referencia.")
    @Test
    void pruebaCinco(){
        assertTrue(l1.compararLibros(l5));
    }
}
