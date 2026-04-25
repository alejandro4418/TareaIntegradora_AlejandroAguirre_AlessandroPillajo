package principal;

import java.util.Scanner;

import Cuentas.Cuenta;
import Cuentas.CuentaAhorros;
import Cuentas.CuentaCorriente;
import Cuentas.CuentaInversion;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cuenta[] cuentas = new Cuenta[3];

        String numeroCuenta;
        String titular;
        double saldo;

        System.out.println("=== INGRESAR CUENTA AHORROS ===");
        System.out.print("Numero de cuenta: ");
        numeroCuenta = sc.nextLine();
        System.out.print("Titular: ");
        titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        saldo = sc.nextDouble();
        sc.nextLine();

        cuentas[0] = new CuentaAhorros(numeroCuenta, titular, saldo);

        System.out.println("\n=== INGRESAR CUENTA CORRIENTE ===");
        System.out.print("Numero de cuenta: ");
        numeroCuenta = sc.nextLine();
        System.out.print("Titular: ");
        titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        saldo = sc.nextDouble();
        sc.nextLine();

        cuentas[1] = new CuentaCorriente(numeroCuenta, titular, saldo);

        System.out.println("\n=== INGRESAR CUENTA INVERSION ===");
        System.out.print("Numero de cuenta: ");
        numeroCuenta = sc.nextLine();
        System.out.print("Titular: ");
        titular = sc.nextLine();
        System.out.print("Saldo inicial: ");
        saldo = sc.nextDouble();

        cuentas[2] = new CuentaInversion(numeroCuenta, titular, saldo);

        double totalIntereses = 0;

        System.out.println("\n==================================");
        System.out.println("      REPORTE GENERAL DEL BANCO");
        System.out.println("==================================");

        for (int i = 0; i < cuentas.length; i++) {

            double interes = cuentas[i].calcularInteresMensual();

            totalIntereses = totalIntereses + interes;

            cuentas[i].setSaldo(cuentas[i].getSaldo() + interes);

            System.out.println("\nCuenta #" + (i + 1));
            System.out.println("Numero de cuenta: " + cuentas[i].getNumeroCuenta());
            System.out.println("Titular: " + cuentas[i].getTitular());
            System.out.println("Interes mensual generado: $" + interes);
            System.out.println("Saldo actual: $" + cuentas[i].getSaldo());
            System.out.println("----------------------------------");
        }

        System.out.println("TOTAL INTERESES DEL BANCO: $" + totalIntereses);

    }
}