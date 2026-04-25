package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    private static final double rendimiento_km_galon = 40.0;
    private static final double km_base_mensual = 400.0;

    public SolicitanteSubsidio(String nombreCompleto,
                               String cedula,
                               double ingresosMensuales,
                               int cantidadVehiculos,
                               boolean viveEnEcuador){
        setNombreCompleto(nombreCompleto);
        setCedula(cedula);
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        setViveEnEcuador(viveEnEcuador);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470){
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("Ingresos no validos");
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos > 0){
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("No se admiten valores negativos o cero");
        }
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    public boolean subsidioAprobado(){
        if (ingresosMensuales <= 1200 && cantidadVehiculos <= 1 && viveEnEcuador == true){
            return true;
        } else {
            return false;
        }
    }

    public void generarResultado(){
        if (subsidioAprobado() == true){
            System.out.println("Subsidio aprobado: Cumple con todos los requisitos establecidos por el Gobierno del Ecuador");
        } else {
            System.out.println("Subsidio rechazado: No cumple uno o mas requisitos establecidos por el Gobierno del Ecuador");
        }
    }

    public void mostrarToString(){
        System.out.println("===== Datos del solicitante =====");
        System.out.println("Nombre: "+ getNombreCompleto());
        System.out.println("Cedula: "+ getCedula());
        System.out.println("Ingresos mensuales: "+ getIngresosMensuales());
        System.out.println("Cantidad de vehiculos: "+ getCantidadVehiculos());
        System.out.println("Vive en Ecuador: "+ isViveEnEcuador());
        System.out.println();
    }

    public static void mostrarReglasSubsidio(){
        System.out.println("===== Reglas para obtener el subsidio =====");
        System.out.println("1. Tener ingresos mensuales menores o iguales a $1,200.");
        System.out.println("2. No poseer más de un vehículo registrado.");
        System.out.println("3. Tener residencia en Ecuador.");
        System.out.println("===============================================");
        System.out.println();
    }

    public double calcularConsumoMensual() {
        double consumoGalones = km_base_mensual  / rendimiento_km_galon;
        return consumoGalones;
    }

    public double calcularConsumoMensual(double kmExtra) {
        double kmTotal = km_base_mensual  + kmExtra;
        double consumoGalones = kmTotal / rendimiento_km_galon;
        return consumoGalones;
    }

}
