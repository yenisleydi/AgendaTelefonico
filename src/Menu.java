import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String elegir;
        Scanner scanner=new Scanner(System.in);
        ArrayList<Registro> registros=new ArrayList<Registro>();
        Ingresar ingresar=new Ingresar(registros);
        Consultar consultar=new Consultar(registros);
        Buscar buscar=new Buscar(registros);
        Eliminar eliminar=new Eliminar(registros);
        do {
            System.out.println("-------MENU------");
            System.out.println("Registrar");
            System.out.println("Consultar");
            System.out.println("Actualizar");
            System.out.println("Eliminar");
            System.out.println("Salir");
            elegir=scanner.nextLine();
            switch (elegir){
                case "Registrar" ->
                   ingresar.ingresar();
                case "Consultar" ->
                    consultar.consultar();
                case "Actualizar" ->
                        buscar.buscarPorCorreo();
                case "Eliminar" ->
                    eliminar.eliminar();
                default ->System.out.println("Opcion invalida");


            }
        }while(!elegir.equals("Salir"));
    }
}
