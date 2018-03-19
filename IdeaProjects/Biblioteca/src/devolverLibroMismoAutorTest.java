import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class devolverLibroMismoAutorTest {

    static Biblioteca bibliotecaConLibro;
    static Biblioteca bibliotecaSinLibro;
    static Biblioteca bibliotecaConMismoLibro;
    static Libro libroAComparar;
    static int contador = 0;


    @BeforeAll
    static void prepararTestAll(){
        Autor mismoAutor = new Autor("Pepe");
        Autor distintoAutor = new Autor("Manolete");
        Fecha f1 = new Fecha();

        bibliotecaConLibro = new Biblioteca("Biblioteca con un libro del mismo autor");
        bibliotecaSinLibro = new Biblioteca("Biblioteca sin un libro del mismo autor");
        bibliotecaConMismoLibro = new Biblioteca("Biblioteca con el mismo libro introducido");
        libroAComparar = new Libro("Libro a comparar", "Meloinvento", mismoAutor, f1);

        Libro libroMismoAutor = new Libro("Libro con el mismo autor", "Meloinvento", mismoAutor, f1);
        Libro libroDistintoAutor = new Libro("Libro con distinto autor", "Meloinvento", distintoAutor, f1);

        bibliotecaConLibro.añadir(libroMismoAutor);
        bibliotecaConLibro.añadir(libroDistintoAutor);
        bibliotecaSinLibro.añadir(libroDistintoAutor);
        bibliotecaConMismoLibro.añadir(libroAComparar);
    }

    @BeforeEach
     void imprimirObjetos (){
        System.out.println("Elementos a probar:\n"
                + bibliotecaConLibro + "\n"
                + bibliotecaSinLibro + "\n"
                + libroAComparar + "\n");
    }

    @AfterEach
    void contador (){
        System.out.println( "Pruebas realizadas: " + ++contador + "\n");
    }

    @AfterAll
    static void  hacerNull (){
        bibliotecaConLibro = null;
        bibliotecaSinLibro = null;
        libroAComparar = null;
    }

    /**
     * Se comprueba el resultado de consultar una biblioteca con un libro del mismo autor
     */
    @DisplayName("Test1: La biblioteca tiene un libro del mismo autor")
    @Test
    public void bibliotecaTieneLibro(){
        assertNotNull(bibliotecaConLibro.devolverLibroMismoAutor(libroAComparar));
    }

    /**
     * Se comprueba el resultado de consultar una biblioteca con un libro de distinto autor
     */
    @DisplayName("Test2: La biblioteca no tiene un libro del mismo autor")
    @Test
    public void bibliotecaNoTieneLibro(){
        assertNull(bibliotecaSinLibro.devolverLibroMismoAutor(libroAComparar));
    }

    /**
     * Se comprueba el resultado de consultar una biblioteca con el mismo libro
     */
    @DisplayName("Test3: La biblioteca tiene el mismo juego")
    @Test
    public void mismoLibro(){
        assertNull(bibliotecaConMismoLibro.devolverLibroMismoAutor(libroAComparar));
    }

}


