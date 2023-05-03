import java.util.ArrayList; 

public class Inicio{
    public static void main (String [] args){
        // creamos objetos de la clase Incidencia
        Incidencia inc1 = new Incidencia(105,"no tiene acceso a internet");
        
        Incidencia inc2 = new Incidencia(14,"no arranca");
        inc2.resolverIncidencia("El equipo no estaba enchufado");
        
        ArrayList <Incidencia> arrinc2 = new ArrayList<Incidencia>();
        Incidencia inc3 = new Incidencia(5,"la pantalla se ve rosa");
        inc3.resolverIncidencia("cambio del cable VGA");
        
        Incidencia inc4 = new Incidencia(237,"hace un ruido extraño");
        
        Incidencia inc5 = new Incidencia(111,"se queda colgado al abrir 3 pendientes");
       

        // añadimos los objetos d ela clase incidencia al arraylist creado previamente
        arrinc2.add(inc1);
        arrinc2.add(inc2);
        arrinc2.add(inc3);
        arrinc2.add(inc4);
        arrinc2.add(inc5);
        
        for (Incidencia inc:arrinc2){
            System.out.println(inc);
        }
        
        int count=0; 
        for(int i=0; i<arrinc2.size(); i++){
            if ((arrinc2.get(i).getEstado())=="Pendiente"){
                count++;

            }
            
        } 
        System.out.println("Incidencias pendientes "+count);  
    }

}