import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<persona> lstPersona = new ArrayList<persona>();

        persona c1 = new cliente("pedro", "lopez",26 ,"1010","aux", "aux1010");




        persona e1 = new empleado("lorena", "gil", 35, "2020", "indefinido",32000);

        lstPersona.add(c1);
        lstPersona.add(e1);

        for(persona p : lstPersona){
            System.out.println("Nombre: "+p.mostrarinfo());
        }




    }
}