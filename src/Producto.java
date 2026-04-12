public class Producto {

    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }
    public Producto(String nombre){
        this.nombre="Pera";
        this.precio=2.50;
        this.cantidad=10;
    }
    public Producto(){
    }
    public void mostrarInformacionProfucctos(){
        System.out.println("============ PRODUCTOS =============");
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("--------------------------------------");
    }
}
