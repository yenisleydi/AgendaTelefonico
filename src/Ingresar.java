import java.util.Scanner;
import java.util.ArrayList;

public class Ingresar{
  private ArrayList<Registro> registros;
    public Ingresar(ArrayList<Registro> registros) {
        this.registros = registros;
    }
    public void ingresar(){
        Scanner scanner = new Scanner(System.in);
        Registro usuario = new Registro();
        System.out.println("Ingresa el nombre completo");
        usuario.setNombreCompleto(scanner.nextLine());
        System.out.println("Ingresa la organizacion");
        usuario.setOrganizacion(scanner.nextLine());
        System.out.println("Ingresa el correo electronico");
        usuario.setCorreo( scanner.nextLine());
        System.out.println("Ingresa el numero de telefono");
        usuario.setNumero(scanner.nextInt());
        registros.add(usuario);
    }
}
