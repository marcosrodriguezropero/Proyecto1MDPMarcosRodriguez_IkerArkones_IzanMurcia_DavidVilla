
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

class CuentaInactivaException extends Exception {
    public CuentaInactivaException(String message) {
        super(message);
    }
}


class CuentaBancaria {
    private double saldo;
    private boolean activa;

    public CuentaBancaria(double saldoInicial, boolean activa) {
        this.saldo = saldoInicial;
        this.activa = activa;
    }


    public void retirar(double monto) throws SaldoInsuficienteException, CuentaInactivaException {
        if (!activa) {
            throw new CuentaInactivaException("Error: La cuenta está inactiva.");
        }
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Error: Saldo insuficiente.");
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
    }
}


class Banco {


    public void procesarRetiro(CuentaBancaria cuenta, double monto) {
        try {
            cuenta.retirar(monto);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Capturada SaldoInsuficienteException: " + ex.getMessage());
        } catch (CuentaInactivaException ex) {
            System.out.println("Capturada CuentaInactivaException: " + ex.getMessage());
        } finally {
            System.out.println("Bloque 'finally' ejecutado (operación finalizada).");
        }
    }


    public void realizarTransaccion(CuentaBancaria cuenta, double monto) throws SaldoInsuficienteException, CuentaInactivaException {
        cuenta.retirar(monto);
    }
}


