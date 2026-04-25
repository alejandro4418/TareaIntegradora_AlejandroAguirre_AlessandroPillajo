package Cuentas;

public class CuentaInversion extends Cuenta {

    public CuentaInversion(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Retiro invalido");
        }
    }

    @Override
    public double calcularInteresMensual() {

        if (getSaldo() < 1000) {
            return getSaldo() * 0.04 / 12;
        } else if (getSaldo() <= 5000) {
            return getSaldo() * 0.05 / 12;
        } else {
            return getSaldo() * 0.06 / 12;
        }
    }
}
