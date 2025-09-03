public class main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("detras del ultimo no hay nadie", "steven", 5, 6);
        Libro libro2 = new Libro("la ultima patada del mocho", "carlos", 3 , 1);

        // como fue profe Préstamo de libros
        if (libro1.prestar()) {
            System.out.println("Préstamo de (detras del ultimo no hay nadie) realizado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para prestar de (detras del ultimo no hay nadie.)");
        }

        if (libro2.prestar()) {
            System.out.println("Préstamo de (la ultima patada del mocho) realizado con éxito.");
        } else {
            System.out.println("No hay ejemplares disponibles para prestar de (la ultima patada del mocho.)");
        }

        // que mas profe (devolver libros)
        if (libro1.devolver()) {
            System.out.println("Devolución de (detras del ultimo no hay nadie) realizada con éxito.");
        } else {
            System.out.println("No hay ejemplares prestados para devolver de (detras del ultimo no hay nadie.)");
        }

        if (libro2.devolver()) {
            System.out.println("Devolución de (la ultima patada del mocho) realizada con éxito.");
        } else {
            System.out.println("No hay ejemplares prestados para devolver de (la ultima patada del mocho.");
        }
    }
    
}
