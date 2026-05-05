package ni.edu.uam.modelos;

public class Motocicleta extends Vehiculo{
    private int cilindrada;
    private String tipo;


    public Motocicleta(){
    }

    public Motocicleta(String marca, String modelo, int anio, double velocidadMaxima,
                       int cilindrada, String tipo) {
        super(marca, modelo, anio, velocidadMaxima);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public StringBuilder mostrarInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== MOTOCICLETA ===\n");
        sb.append(super.mostrarInformacion());
        sb.append("Cilindrada: ").append(cilindrada).append(" cc\n");
        sb.append("Tipo: ").append(tipo).append("\n");
        return sb;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
