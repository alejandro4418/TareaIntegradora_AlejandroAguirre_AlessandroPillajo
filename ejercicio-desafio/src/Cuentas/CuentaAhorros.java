package Cuentas;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String numeroCuenta, String titular, double saldo) {
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
        return getSaldo() * 0.03 / 12;
    }
}