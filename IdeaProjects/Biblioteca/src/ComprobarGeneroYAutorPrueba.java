import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ComprobarGeneroYAutorPrueba {


    static Libro l1;
    static Autor a1;
    static Autor a2;

    @BeforeAll
    static void creacion() {
        a1 = new Autor("Paco");
        a2  = new Autor("Pepe");
        Fecha f1 = new Fecha();
        l1 = new Libro("El señor de los pestiños", "Comedia", a1, f1);
    }

    @AfterAll
    static void nulear(){
        l1 = null;
        a1 = null;
        a2 = null;
    }

    @DisplayName("Prueba que comprueba que sea correcto con el mismo genero y autor.")
    @Test
    void pruebaUno(){
        String resultadoEsperado = "Género: sí     Autor: sí";
        assertEquals(resultadoEsperado, l1.comprobarGeneroYAutor("Comedia",a1));
    }



    @DisplayName("Prueba que comprueba que sea correcto sin el mismo genero, pero con el mismo autor.")
    @Test
    void pruebaDos(){
        String resultadoEsperado = "Género: no      Autor: sí";
        assertEquals(resultadoEsperado, l1.comprobarGeneroYAutor("Terror",a1));
    }

    @DisplayName("Prueba que comprueba que sea correcto sin el mismo autor, pero con el mismo genero.")
    @Test
    void pruebaTres(){
        String resultadoEsperado = "Género: sí     Autor: no";
        assertEquals(resultadoEsperado, l1.comprobarGeneroYAutor("Comedia", a2));
    }


    @DisplayName("Prueba que comprueba que sea correcto sin el mismo genero, ni el mismo autor.")
    @Test
    void pruebaCuatro(){
        String resultadoEsperado = "Género: no     Autor: no";
        assertEquals(resultadoEsperado, l1.comprobarGeneroYAutor("Terror", a2));
    }

    @DisplayName("Prueba que comprueba que sea correcto añadiendo null al autor.")
    @Test
    void pruebaCinco(){
        String resultadoEsperado = "Error - El genero o el autor no son validos";
        assertEquals(resultadoEsperado, l1.comprobarGeneroYAutor("Comedia", null));
    }


    @DisplayName("Prueba que comprueba que sea correcto añadiendo null al genero.")
    @Test
    void pruebaSeis(){
        String resultadoEsperado = "Error - El genero o el autor no son validos";
        assertEquals(resultadoEsperado, l1.comprobarGeneroYAutor(null, a1));
    }
}
