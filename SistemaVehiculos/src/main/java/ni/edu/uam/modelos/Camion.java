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

    
}
