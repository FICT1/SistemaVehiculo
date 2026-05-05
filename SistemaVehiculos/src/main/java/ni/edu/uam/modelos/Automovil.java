package ni.edu.uam.modelos;

public class Automovil extends Vehiculo {

    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int anio, double velocidadMaxima,
                     int numeroPuertas, String tipoCombustible) {
        super(marca, modelo, anio, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public StringBuilder mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== AUTOMOVIL ===\n");
        sb.append(super.mostrarInformacion());
        sb.append("Puertas: ").append(numeroPuertas).append("\n");
        sb.append("Combustible: ").append(tipoCombustible).append("\n");
        return sb;
    }

    public int getNumeroPuertas() { return numeroPuertas; }
    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }
}