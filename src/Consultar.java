import java.util.ArrayList;

public class Consultar {
    private ArrayList<Registro> registros;
    public Consultar(ArrayList<Registro> registros){
        this.registros=registros;
    }
    public void consultar(){
        for(Registro registro:registros){
            System.out.println("Nombre completo: " + registro.nombreCompleto);
            System.out.println("Organizacion: " + registro.organizacion);
            System.out.println("Correo electronico: " + registro.correo);
            System.out.println("Numero de telefono: " + registro.numero);
            System.out.println();
        }

    }
}
