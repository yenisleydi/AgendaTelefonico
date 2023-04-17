import java.util.ArrayList;
import java.util.Scanner;

public class Buscar {
    private ArrayList<Registro> registros;

    public Buscar(ArrayList<Registro> registros) {
        this.registros = registros;
    }

    public void buscarPorCorreo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el correo electrónico a buscar:");
        String correoABuscar = scanner.nextLine();

        boolean encontrado = false;
        for (Registro registro : registros) {
            if (registro.getCorreo().equals(correoABuscar)) {
                Actualizar actualizar=new Actualizar(registros);
                actualizar.actualizar(registro);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún registro con el correo electrónico proporcionado.");
        }
    }
}
