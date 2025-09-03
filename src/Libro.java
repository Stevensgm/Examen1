public class Libro {
    private String titulo;
    private String autor;
    private int numeroEjemplares = 0;
    private int numeroEjemplaresPrestados = 0;

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }
    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }
    public boolean prestar() {
    if (numeroEjemplares > numeroEjemplaresPrestados) {
        numeroEjemplaresPrestados++;
        System.out.println("Préstamo realizado con éxito.");
        return true;
    } else {
        System.out.println("No hay ejemplares disponibles para prestar.");
        return false;
    }
}

public boolean devolver() {
    if (numeroEjemplaresPrestados > 0) {
        numeroEjemplaresPrestados--;
        System.out.println("Devolución realizada con éxito.");
        return true;
    } else {
        System.out.println("No hay ejemplares prestados para devolver.");
        return false;
    }
}

        public void imprimir() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Número de ejemplares: " + numeroEjemplares);
            System.out.println("Número de ejemplares prestados: " + numeroEjemplaresPrestados);
        }
    }





