import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HayMismoGeneroTest {

    static Biblioteca bibliotecaConLibro;
    static Biblioteca bibliotecaSinLibro;
    static Biblioteca bibliotecaConMismoLibro;
    static Libro libroAComparar;
    static int contador = 0;

    @BeforeAll
    static void prepararTestAll(){
        Autor d1 = new Autor ("Pepe");
        Fecha f1 = new Fecha();

        bibliotecaConLibro = new Biblioteca("Biblioteca con libro del mismo género");
        bibliotecaSinLibro = new Biblioteca("Biblioteca sin libro del mismo género");
        bibliotecaConMismoLibro = new Biblioteca("Biblioteca con el mismo libro que el introducido");
        libroAComparar = new Libro("Libro a comparar", "Fantasía", d1, f1);

        Libro libroMismoGenero = new Libro("Libro del mismo género", "Fantasía", d1, f1);
        Libro libroDistintoGenero = new Libro("Libro de distinto género", "Historia", d1, f1);

        bibliotecaConLibro.añadir(libroMismoGenero);
        bibliotecaConLibro.añadir(libroDistintoGenero);
        bibliotecaSinLibro.añadir(libroDistintoGenero);
        bibliotecaConMismoLibro.añadir(libroAComparar);
    }

    @BeforeEach
    void imprimirObjetos (){
        System.out.println("Elementos a probar:\n"
                + bibliotecaConLibro + "\n"
                + bibliotecaSinLibro + "\n"
                + bibliotecaConMismoLibro + "\n"
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
        bibliotecaConMismoLibro = null;
        libroAComparar = null;
    }

    /**
     * Se comprueba el resultado de consultar una biblioteca con un libro del mismo género
     */
    @DisplayName("Test1: La biblioteca tiene un libro del mismo género")
    @Test
    public void bibliotecaTieneGenero (){
        assertTrue(bibliotecaConLibro.hayMismoGenero(libroAComparar));
    }

    /**
     * Se comprueba el resultado de consultar una biblioteca con un libro de distinto género
     */
    @DisplayName("Test2: La biblioteca tiene un libro de distinto género")
    @Test
    public void bibliotecaNoTieneGenero (){
        assertFalse(bibliotecaSinLibro.hayMismoGenero(libroAComparar));
    }

    /**
     * Se comprueba el resultado de consultar una biblioteca con el mismo libro
     */
    @DisplayName("Test3: La biblioteca tiene el mismo libro")
    @Test
    public void mismoLibro (){
        assertFalse(bibliotecaConMismoLibro.hayMismoGenero(libroAComparar));
    }

}