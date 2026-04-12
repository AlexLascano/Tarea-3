class Libro {
    String titulo;
    String autor;
    int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
    }

    public void mostrarInformacion(){
        System.out.println("========== LIBRO ===========");
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Anio de publicacion: "+ anioPublicacion);
    }
}
