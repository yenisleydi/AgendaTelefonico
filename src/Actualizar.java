import java.util.ArrayList;
import java.util.Scanner;

public class Actualizar {
    private ArrayList<Registro> registros;

    public Actualizar(ArrayList<Registro> registros) {
        this.registros = registros;
    }
    public void actualizar(Registro registro) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nuevo nombre completo:");
        registro.setNombreCompleto(scanner.nextLine());

        System.out.println("Ingrese la nueva organización:");
        registro.setOrganizacion(scanner.nextLine());

        System.out.println("Ingrese el nuevo correo electrónico:");
        registro.setCorreo(scanner.nextLine());

        System.out.println("Ingrese el nuevo número de teléfono:");
        registro.setNumero(scanner.nextInt());

        registros.set(registros.indexOf(registro),registro);
        System.out.println("Registro actualizado con éxito.");

    }
}


