public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("detras del ultimo no hay nadie", "steven", 5, 12);
        Libro libro2 = new Libro("la ultima patada del mocho", "carlos", 3, 0);

      
        System.out.println("Información inicial de los libros:");
        libro1.imprimir();
        libro2.imprimir();

        System.out.println("\nIntentando prestar libros:");
        libro1.prestar();
        libro2.prestar();

        
        System.out.println("\nInformación después de prestar:");
        libro1.imprimir();
        libro2.imprimir();

        // Devolver libros
        System.out.println("\nIntentando devolver libros:");
        libro1.devolver();
        libro2.devolver();

   
        System.out.println("\nInformación final de los libros:");
        libro1.imprimir();
        libro2.imprimir();
    }
}