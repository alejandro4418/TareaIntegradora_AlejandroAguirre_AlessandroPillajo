package principal;

import ec.gob.subsidio.modelo.SolicitanteSubsidio;
import java.util.Scanner;

public class Main {
    void main(){
        SolicitanteSubsidio.mostrarReglasSubsidio();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        String nombreCompleto = sc.nextLine();
        System.out.println("Ingrese su numero de cedula: ");
        String cedula = sc.nextLine();
        System.out.println("Ingrese sus ingresos mensuales: ");
        double ingresosMensuales = sc.nextDouble();
        System.out.println("Ingrese la cantidad de vehiculos: ");
        int cantidadVehiculos = sc.nextInt();
        System.out.println("Vide en Ecuador? (true/false): ");
        boolean viveEnEcuador = sc.nextBoolean();

        SolicitanteSubsidio s1 = new SolicitanteSubsidio(
                nombreCompleto,
                cedula,
                ingresosMensuales,
                cantidadVehiculos,
                viveEnEcuador);
        s1.mostrarToString();
        s1.generarResultado();

        System.out.println("===== Resultado de la evaluacion =====");
        System.out.println("Consumo mensual estimado (sin km extra): " + s1.calcularConsumoMensual() + " galones\n");
        System.out.println("===== Calculo de consumo mensual =====");
        double kmExtra = 80;
        System.out.println("Consumo con kilometros extra (" + kmExtra + " km extra): " + s1.calcularConsumoMensual(kmExtra) + " galones");
    }
}
