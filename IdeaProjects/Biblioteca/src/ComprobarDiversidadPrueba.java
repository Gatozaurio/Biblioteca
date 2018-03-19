import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ComprobarDiversidadPrueba{

    static Autor a1;
    static Biblioteca b1;
    static Biblioteca b2;
    static Biblioteca b3;
    static Libro l1;
    static Libro l2;
    static Libro l3;
    static Libro l4;
    static Libro l5;
    static Libro l6;
    static Libro l7;
    static Libro l8;
    static Libro l9;
    static Libro l10;
    static Libro l11;
    static int contador = 0;




    @BeforeAll
    static void creacion() {
        a1 = new Autor("Pepe");
        Fecha f1 = new Fecha();
        l1 = new Libro("Como suspender Aplicaciones Web","Historias de la vida",a1, f1);
        l2 = new Libro("Desde Paris con Amor","Historia",a1, f1);
        l3 = new Libro("Gato Gordo y la tajada mortal","Accion",a1,f1);
        l4 = new Libro("Viejo Oeste","Vaqueros",a1,f1);
        l5 = new Libro("¿Quien anda ahi?","Terror",a1,f1);
        l6 = new Libro("100 dias en Africa","Drama",a1,f1);
        l7 = new Libro("Suspenso improvisado de Programacion","Realidad",a1, f1);
        l8 = new Libro("El violin","Musical",a1,f1);
        l9 = new Libro("El cabesita dalea","Comedia",a1,f1);
        l10 = new Libro("Como contratar un autobus", "Escolares",a1,f1);
        l11 = l1;
        b1 = new Biblioteca("Pepe Reads");
        b2 = new Biblioteca("El templo de Sevoio");
        b3 = new Biblioteca("El intestino del Gato Gordo");
        b1.añadir(l1);
        b1.añadir(l2);
        b1.añadir(l3);
        b1.añadir(l4);
        b1.añadir(l5);
        b1.añadir(l6);
        b1.añadir(l7);
        b1.añadir(l8);
        b1.añadir(l9);
        b1.añadir(l10);
        b2.añadir(l1);
        b2.añadir(l2);
        b2.añadir(l3);
        b2.añadir(l4);
        b2.añadir(l5);
        b2.añadir(l6);
        b2.añadir(l7);
        b2.añadir(l8);
        b2.añadir(l9);
        b3.añadir(l1);
        b3.añadir(l2);
        b3.añadir(l3);
        b3.añadir(l4);
        b3.añadir(l5);
        b3.añadir(l6);
        b3.añadir(l7);
        b3.añadir(l8);
        b3.añadir(l9);
        b3.añadir(l11);
    }

    @AfterAll
    static void nulear(){
        a1 = null;
        b1 = null;
        b2 = null;
        b3 = null;
        l1 = null;
        l2 = null;
        l3 = null;
        l4 = null;
        l5 = null;
        l6 = null;
        l7 = null;
        l8 = null;
        l9 = null;
        l10 = null;
        l11 = null;
    }

    @AfterEach
    void contador (){
        System.out.println( "Pruebas realizadas: " + ++contador + "\n");
    }

    @DisplayName("Comprueba que tiene diversidad.")
    @Test
    void pruebaUno(){
        assertTrue(b1.comprobarDiversidad());
    }

    @DisplayName("Comprueba que no tiene diversidad con un juego menos.")
    @Test
    void PruebaDos(){
        assertFalse(b2.comprobarDiversidad());
    }

    @DisplayName("Comprueba que no tiene diversidad con 10 juegos y dos juegos del mismo genero.")
    @Test
    void PruebaTres(){
        assertFalse(b3.comprobarDiversidad());
    }
}