import java.util.ArrayList;

public class Consultar {
    private ArrayList<Registro> registros;
    public Consultar(ArrayList<Registro> registros){
        this.registros=registros;
    }
    public void consultar(){
        for(Registro registro:registros){
            System.out.println("Nombre completo: " + registro.getNombreCompleto());
            System.out.println("Organizacion: " + registro.getOrganizacion());
            System.out.println("Correo electronico: " + registro.getCorreo());
            System.out.println("Numero de telefono: " + registro.getCorreo());
            System.out.println();
        }
    }
}
