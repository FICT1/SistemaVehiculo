package ni.edu.uam.modelos;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private double velocidadMaxima;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void encender() {
        System.out.println("Vehículo encendido");
    }

    public void apagar() {
        System.out.println("Vehículo apagado");
    }

    public StringBuilder mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: ").append(marca).append("\n");
        sb.append("Modelo: ").append(modelo).append("\n");
        sb.append("Año: ").append(anio).append("\n");
        sb.append("Velocidad Máxima: ").append(velocidadMaxima).append("\n");
        return sb;
    }

    // getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }
}