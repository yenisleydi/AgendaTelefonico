import java.util.ArrayList;
import java.util.Scanner;

public class Eliminar {
    private ArrayList<Registro> registros;

    public Eliminar(ArrayList<Registro> registros) {
        this.registros = registros;
    }

    public void eliminar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el correo electrónico del registro que deseas eliminar:");
        String correoAEliminar = scanner.nextLine();

        boolean encontrado = false;
        for (Registro registro : registros) {
            if (registro.getCorreo().equals(correoAEliminar)) {
                registros.remove(registro);
                encontrado = true;
                System.out.println("Registro eliminado con éxito.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún registro con el correo electrónico proporcionado.");
        }
    }
}
