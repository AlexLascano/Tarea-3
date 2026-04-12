public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;

    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
    }

    public void mostrarInformacion(){
        System.out.println(" =========== DATOS ============");
        System.out.println("Nombre del titular: "+ nombreTitular);
        System.out.println("Saldo: $"+ saldo);
        System.out.println("---------------------------------");
    }

    public void depositar(double monto){
        saldo= saldo+monto;
        System.out.println("Deposito exitoso de $"+monto);
        System.out.println("Saldo actual: $"+saldo);
        System.out.println("----------------------------------");
    }
    public void retirar(double monto){
        if (monto>saldo){
            System.out.println("Saldo insuficiente para retirar $"+monto);
        }else {
            saldo= saldo-monto;
            System.out.println("Retiro exitoso de: $"+monto);
            System.out.println("Saldo actual: $"+saldo);
        }
        System.out.println("------------------------------------");
    }
}
