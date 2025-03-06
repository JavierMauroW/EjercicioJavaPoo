public class CuentaBancaria {

    private String titular;
    private double saldo;
    private int numeroCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo, int numeroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo; // Corregido: se debe asignar a this.saldo
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }

    public void depositarDinero(double cantidad) {
        if (cantidad > 0) {

            saldo += cantidad;
            System.out.println("Se han depositado " + cantidad + " en la cuenta de " + titular);
        } else {
            System.out.println("La cantidad debe ser diferente a cero");
        }
    }

    public void retirarDinero(double cantidad) {
          if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;

             System.out.println("Se han retirado " + cantidad + " de la cuenta de " + titular);
              } else if (cantidad > saldo) {
            System.out.println("No hay suficiente saldo para retirar " + cantidad);
               } else {
                System.out.println("La cantidad debe ser diferente a cero");
        }
    }
}


