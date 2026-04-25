package Cuentas;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && getSaldo() - monto >= -500) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Sobregiro no permitido");
        }
    }

    @Override
    public double calcularInteresMensual() {
        return 0;
    }
}
