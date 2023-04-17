import java.util.Scanner;
import java.util.ArrayList;

public class Ingresar {
  private ArrayList<Registro> registros;
    public Ingresar(ArrayList<Registro> registros) {
        this.registros = registros;
    }
    public void ingresar(){
        Scanner scanner = new Scanner(System.in);
        Registro usuario = new Registro();
        System.out.println("Ingresa el nombre completo");
        usuario.nombreCompleto = scanner.nextLine();
        System.out.println("Ingresa la organizacion");
        usuario.organizacion = scanner.nextLine();
        System.out.println("Ingresa el correo electronico");
        usuario.correo = scanner.nextLine();
        System.out.println("Ingresa el numero de telefono");
        usuario.numero = scanner.nextInt();
        registros.add(usuario);
    }
}
