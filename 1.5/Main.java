public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(500, true); // Cuenta activa con saldo
        CuentaBancaria cuenta2 = new CuentaBancaria(100, false); // Cuenta inactiva

        Banco banco = new Banco();

        // Opción 1: Manejo de excepciones con try-catch dentro del método procesarRetiro()
        System.out.println("Ejecutando procesarRetiro() con manejo de excepciones:");
        banco.procesarRetiro(cuenta1, 600);
        banco.procesarRetiro(cuenta2, 50);


        System.out.println("\nEjecutando realizarTransaccion() sin manejo interno de excepciones:");
        try {
            banco.realizarTransaccion(cuenta1, 300);
            banco.realizarTransaccion(cuenta1, 300);
        } catch (SaldoInsuficienteException | CuentaInactivaException ex) {
            System.out.println("Excepción propagada capturada en main: " + ex.getMessage());
        }
    }
}