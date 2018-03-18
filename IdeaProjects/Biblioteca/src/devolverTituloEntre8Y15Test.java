import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class devolverTituloEntre8Y15Test {
    static Biblioteca biblioteca7caracteres;
    static Biblioteca biblioteca8caracteres;
    static Biblioteca biblioteca15caracteres;
    static Biblioteca biblioteca16caracteres;
    static Biblioteca bibliotecaVacia;
    static Biblioteca bibliotecaConLibroNull;
    static Libro libro7caracteres;
    static Libro libro8caracteres;
    static Libro libro15caracteres;
    static Libro libro16caracteres;
    static Libro libroNull;
    static int contador = 0;


    @BeforeAll
    static void prepararTestAll(){
        Autor d1 = new Autor ("Pepe");
        Fecha f1 = new Fecha();

        biblioteca7caracteres = new Biblioteca("Biblioteca con un libro de 7 caracteres");
        biblioteca8caracteres = new Biblioteca("Biblioteca con un libro de 8 caracteres");
        biblioteca15caracteres = new Biblioteca("Biblioteca con un libro de 15 caracteres");
        biblioteca16caracteres = new Biblioteca("Biblioteca con un libro de 16 caracteres");
        bibliotecaVacia = new Biblioteca("Biblioteca sin libros");
        bibliotecaConLibroNull = new Biblioteca("Biblioteca con libro null");

        libro7caracteres = new Libro("1234567", "Fantasía", d1, f1);
        libro8caracteres = new Libro("12345678", "Fantasía", d1, f1);
        libro15caracteres = new Libro("123456789012345", "Fantasía", d1, f1);
        libro16caracteres = new Libro("1234567890123456", "Fantasía", d1, f1);
        libroNull = null;

        biblioteca7caracteres.añadir(libro7caracteres);
        biblioteca8caracteres.añadir(libro8caracteres);
        biblioteca15caracteres.añadir(libro15caracteres);
        biblioteca16caracteres.añadir(libro16caracteres);
    }

    @BeforeEach
    void imprimirObjetos (){
        System.out.println("Elementos a probar:\n"
                + biblioteca7caracteres + "\n"
                + biblioteca8caracteres + "\n"
                + biblioteca15caracteres + "\n"
                + biblioteca16caracteres + "\n"
                + libro7caracteres + "\n"
                + libro8caracteres + "\n"
                + libro15caracteres + "\n"
                + libro16caracteres + "\n");
    }

    @AfterEach
    void contador (){
        System.out.println( "Pruebas realizadas: " + ++contador + "\n");
    }

    @AfterAll
    static void  hacerNull (){
        biblioteca7caracteres = null;
        biblioteca8caracteres = null;
        biblioteca15caracteres = null;
        biblioteca16caracteres = null;
        bibliotecaVacia = null;
        libro7caracteres = null;
        libro8caracteres = null;
        libro15caracteres = null;
        libro16caracteres = null;
    }

    /**
     * Pruebas de valores límite
     */

    /**
     * Se comprueba el resultado de introducir un libro de 7 caracteres
     */
    @DisplayName("Test1: La biblioteca tiene un libro de 7 caracteres")
    @Test
    public void libro7caracteres (){
        assertNull(biblioteca7caracteres.devolverTituloEntre8Y15());
    }

    /**
     * Se comprueba el resultado de introducir un libro de 8caracteres
     */
    @DisplayName("Test2: La biblioteca tiene un libro de 8 caracteres")
    @Test
    public void libro8caracteres (){
        assertNotNull(biblioteca8caracteres.devolverTituloEntre8Y15());
    }

    /**
     * Se comprueba el resultado de introducir un libro de 15 caracteres
     */
    @DisplayName("Test3: La biblioteca tiene un libro de 15 caracteres")
    @Test
    public void libro15caracteres (){
        assertNotNull(biblioteca15caracteres.devolverTituloEntre8Y15());
    }

    /**
     * Se comprueba el resultado de introducir un libro de 16 caracteres
     */
    @DisplayName("Test4: La biblioteca tiene un libro de 16 caracteres")
    @Test
    public void libro16caracteres (){
        assertNull(biblioteca16caracteres.devolverTituloEntre8Y15());
    }

    /**
     * Se comprueba el resultado de buscar en una biblioteca sin libros
     */
    @DisplayName("Test5: Biblioteca sin libros")
    @Test
    public void bibliotecaVacia (){
        assertNull(bibliotecaVacia.devolverTituloEntre8Y15());
    }

    /**
     * Se comprueba el resultado de buscar en una biblioteca con un libro null
     */
    @DisplayName("Test6: Biblioteca con libro null")
    @Test
    public void libroNull (){
        assertNull(bibliotecaConLibroNull.devolverTituloEntre8Y15());
    }
}