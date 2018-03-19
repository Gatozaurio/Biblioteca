import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calcularTiempoPublicadoTest{

    static Biblioteca biblioteca;

    static Autor a1;
    static Autor a2;
    static Autor a3;

    static Fecha f1;
    static Fecha actual;
    static Fecha f2;

    static Libro l1;
    static Libro l2;
    static Libro l3;
    static Libro l4;
    static Libro l5;
    static Libro l6;

    @BeforeAll
    static void creaobjetos(){
        a1 = new Autor("Adolf Hitler");
        a2 = new Autor("El perchas");
        a3 = new Autor("Roberto Pamplinas");

        f1 = new Fecha(17,4,2018);
        actual = new Fecha(17,4,2020);
        f2 = new Fecha(11,1,2000);

        l1 = new Libro("Mein Kampf", "Educativo", a1,f1);
        l2 = new Libro("Caca culo pedo pis", "Superación y psicología", a2,f1);
        l3 = new Libro("El método del calcetín", "Adultos", a3 ,f1);
        l4 = new Libro("Semana de exámenes", "Drama", a3, f2);
        l5 = new Libro("Programación avanzada en java", "Terror psicológico", a2,f1);
        l6 = new Libro("Sevoio y el café de vainilla", "Romántico", a3,f1);
    }
    static int contador = 0;
    @AfterEach
    void contador (){
        System.out.println( "Pruebas realizadas: " + ++contador + "\n");
    }
    @DisplayName("Método que te devuelva todos los libros a partir de una fecha de lanzamiento.")
    @Test
    void prueba1(){
        assertEquals(2,l1.calcularTiempoPublicado(actual));
    }
    @Test
    void prueba2(){
        assertNotEquals(5,l2.calcularTiempoPublicado(actual));
    }

    @Test
    void prueba3(){
        assertNotEquals(null,l3.calcularTiempoPublicado(actual));
    }
    @Test
    void prueba4(){
        assertNotNull(l1.calcularTiempoPublicado(f2));
    }
}
