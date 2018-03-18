import java.util.ArrayList;

public class Autor {
    String nombre;
    ArrayList<Libro> librosDeAutor = new ArrayList<>();

    public Autor(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
