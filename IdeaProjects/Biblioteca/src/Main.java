public class Main {
    public static void main(String[] args) {
        Autor a1 = new Autor ("Adolf Hitler");
        Autor a2 = new Autor ("El perchas");
        Autor a3 = new Autor ("Roberto Pamplinas");

        Libro l1 = new Libro ("Mein Kampf", "Educativo", a1);
        Libro l2 = new Libro ("Caca culo pedo pis", "Superación y psicología", a2);
        Libro l3 = new Libro ("El método del calcetín", "Adultos", a3);
        Libro l4 = new Libro ("Semana de exámenes", "Drama", a3);
        Libro l5 = new Libro ("Programación avanzada en java", "Terror psicológico", a2);
        Libro l6 = new Libro ("Sevoio y el café de vainilla", "Romántico", a3);

        Biblioteca b1 = new Biblioteca("Meloinvento");

        b1.añadir(l1);
        b1.añadir(l2);
        b1.añadir(l3);
        b1.añadir(l4);
        b1.añadir(l5);
        b1.añadir(l6);

    }
}