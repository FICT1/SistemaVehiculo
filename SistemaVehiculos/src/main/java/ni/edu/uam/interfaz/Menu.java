package ni.edu.uam.interfaz;
import ni.edu.uam.modelos.*;
import javax.swing.JOptionPane;

public class Menu {
    public void iniciar() {
        Vehiculo[] vehiculos = new Vehiculo[10];
        int contador = 0;



        int opcion = -1;
        do {
            try {
                String input = JOptionPane.showInputDialog(
                        "1. Crear Automóvil\n" +
                                "2. Crear Motocicleta\n" +
                                "3. Crear Camión\n" +
                                "4. Mostrar Vehículos\n" +
                                "0. Salir"
                );

                if (input == null) return; // cancelar o X
                opcion = Integer.parseInt(input);

                switch (opcion) {

                    case 1:
                        vehiculos[contador++] = crearAutomovil();
                        break;

                    case 2:
                        vehiculos[contador++] = crearMotocicleta();
                        break;

                    case 3:
                        vehiculos[contador++] = crearCamion();
                        break;

                    case 4:
                        mostrarVehiculos(vehiculos, contador);
                        break;

                    case 0:
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            }

        } while (opcion != 0);
    }

    private Automovil crearAutomovil() {
        try {
            String marca = JOptionPane.showInputDialog("Marca:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            int anio = Integer.parseInt(JOptionPane.showInputDialog("Año:"));
            double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad:"));
            int puertas = Integer.parseInt(JOptionPane.showInputDialog("Puertas:"));
            String combustible = JOptionPane.showInputDialog("Combustible:");

            return new Automovil(marca, modelo, anio, velocidad, puertas, combustible);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear automóvil");
            return null;
        }
    }

    private Motocicleta crearMotocicleta() {
        try {
            String marca = JOptionPane.showInputDialog("Marca:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            int anio = Integer.parseInt(JOptionPane.showInputDialog("Año:"));
            double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad:"));
            int cilindrada = Integer.parseInt(JOptionPane.showInputDialog("Cilindrada:"));
            String tipo = JOptionPane.showInputDialog("Tipo:");

            return new Motocicleta(marca, modelo, anio, velocidad, cilindrada, tipo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear motocicleta");
            return null;
        }
    }

    private Camion crearCamion() {
        try {
            String marca = JOptionPane.showInputDialog("Marca:");
            String modelo = JOptionPane.showInputDialog("Modelo:");
            int anio = Integer.parseInt(JOptionPane.showInputDialog("Año:"));
            double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Velocidad:"));
            double carga = Double.parseDouble(JOptionPane.showInputDialog("Carga:"));
            int ejes = Integer.parseInt(JOptionPane.showInputDialog("Ejes:"));

            return new Camion(marca, modelo, anio, velocidad, carga, ejes);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear camión");
            return null;
        }
    }

    private void mostrarVehiculos(Vehiculo[] vehiculos, int contador) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < contador; i++) {
            if (vehiculos[i] != null) {
                sb.append(vehiculos[i].mostrarInformacion())
                        .append("\n-----------------\n");
            }
        }

        JOptionPane.showMessageDialog(null, sb.toString());
    }
}