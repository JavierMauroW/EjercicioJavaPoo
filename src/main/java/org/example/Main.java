public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Perez", 1000.0, 123456);
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria Lopez", 500.0, 654321);


        System.out.println(cuenta1);
        System.out.println(cuenta2);


        cuenta1.depositarDinero(200.0);
        cuenta2.depositarDinero(150.0);


        System.out.println(cuenta1);
        System.out.println(cuenta2);


        cuenta1.retirarDinero(300.0);
        cuenta2.retirarDinero(700.0);


        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}