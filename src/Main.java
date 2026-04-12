public class Main {
    public static void main(String[] args){

        Libro libro1=new Libro("Rebelion en la granja", "Alex Lascano", 1980);
        libro1.mostrarInformacion();

        Libro libro2=new Libro("Hombre Araña", "Malcom", 1942);
        libro2.mostrarInformacion();

        Producto producto1=new Producto("Manzana    ", 10.0, 9);
        producto1.mostrarInformacionProfucctos();

        Producto producto2=new Producto("Pera");
        producto2.mostrarInformacionProfucctos();

        Producto producto3=new Producto();
        producto3.mostrarInformacionProfucctos();

        CuentaBancaria cuenta1 =new CuentaBancaria("Alex Lascano", 45.80);
        cuenta1.mostrarInformacion();
        cuenta1.depositar(50);
        cuenta1.retirar(26);
        cuenta1.retirar(1598);
        cuenta1.mostrarInformacion();

        Persona p1 = new Persona("Alex", 21);
        p1.mostrarInformacion();

        p1.setNombre("Paul");
        p1.setEdad(25);
        p1.mostrarInformacion();

        System.out.println("---------------------------------------");

        Producto2 pr1 = new Producto2("Arroz", 1.50);
        pr1.mostrarInformacion();

        pr1.setPrecio(2.00);
        pr1.mostrarInformacion();

    }
}