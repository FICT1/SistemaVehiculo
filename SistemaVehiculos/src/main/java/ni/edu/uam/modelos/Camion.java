package ni.edu.uam.modelos;

public class Camion extends Vehiculo{
    private double capacidadCarga;
    private int numeroejes;


    public Camion() {
    }

    public Camion(String marca, String modelo, int anio, double velocidadMaxima,
                  double capacidadCarga, int numeroejes) {
        super(marca, modelo, anio, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
        this.numeroejes = numeroejes;
    }

    public StringBuilder mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== CAMION ===\n");
        sb.append(super.mostrarInformacion());
        sb.append("Capacidad de Carga: ").append(capacidadCarga).append(" toneladas\n");
        sb.append("Número de Ejes: ").append(numeroejes).append("\n");
        return sb;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroejes() {
        return numeroejes;
    }

    public void setNumeroejes(int numeroejes) {
        this.numeroejes = numeroejes;
    }
}
