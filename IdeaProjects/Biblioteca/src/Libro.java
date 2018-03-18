public class Libro {

    String nombre;
    String genero;
    Fecha publicacion;
    Autor autor;

    public Libro(String nombre, String genero, Autor autor, Fecha publicacion){
        this.nombre = nombre;
        this.genero = genero;
        this.publicacion = publicacion;
        this.autor = autor;
    }

    public Libro(String nombre, String genero, Autor autor){
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
    }

    public Fecha getPublicacion(){
        return publicacion;
    }

    // Método que compara si dos libros son el mismo
    public boolean compararLibros (Libro lib){
        if (lib == null) return false;
        if (this.nombre.equals(lib.nombre) && this.autor.equals(lib.autor) && this.genero.equals(genero)) return true;
        return false;
    }

    /*
    Método que si le indicas un género y un autor
    a un libro te indique si es o no de ese género
    y si pertenece al autor.
    */
    public void comprobarGeneroYAutor (String gen, String autor) {
        if (genero.equals(gen) && autor.equals(autor)) {
            System.out.println("Género: sí     Autor: sí");
        }
        if (!genero.equals(gen) && autor.equals(autor)) {
            System.out.println("Género: no      Autor: sí");
        }
        if (genero.equals(gen) && !autor.equals(autor)) {
            System.out.println("Género: sí     Autor: no");
        }
        if (!genero.equals(gen) && !autor.equals(autor)) {
            System.out.println("Género: no     Autor: no");
        }
    }

    // Método que calcula los años que lleva publicado un libro.
    public long calcularTiempoPublicado(Fecha fechaActual){
        long actual = fechaActual.getTimeInMillis()/1000;
        long publicacion = getPublicacion().getTimeInMillis()/1000;
        return (((actual-publicacion)/3600)/8760);
    }


    @Override
    public String toString() {

        return nombre;
    }
}
