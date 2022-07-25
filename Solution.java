//LA IMPORTACIÓN SIGUIENTE ES
//NECESARIA PARA MANIPULAR EL
//PARÁMETRO DE ENTRADA DE SU
//PROPUESTA DE SOLUCIÓN. NO LA
//DESCARTE
import java.util.ArrayList;

public class Solution{
    public static Object [] reporte(ArrayList <Corredor> carrera){
        
        //ESCRIBA LA LÓGICA DE SU PROPUESTA
        //DE SOLUCIÓN. NO OLVIDE INDICAR EL
        //OBJETO QUE ESTA VA A RETORNAR
        double suma = 0;
        double prom = 0;
        
        String nombreMenorTiempo = " ";
        double menorTiempo = Double.MAX_VALUE;
        
        String nombreMayorTiempo = " ";
        double mayorTiempo = Double.MIN_VALUE;
     
        
         for (Corredor i:carrera){
             
            suma += i.getTiempoMeta();
            
            if (i.getTiempoMeta() < menorTiempo){
                nombreMenorTiempo = i.getNombreCompleto();
                menorTiempo = i.getTiempoMeta();
            }
            if (i.getTiempoMeta() > mayorTiempo){
                nombreMayorTiempo = i.getNombreCompleto();
                mayorTiempo = i.getTiempoMeta();
            }
        }
        prom = suma /carrera.size();
        
        Object[] reporte = {prom, nombreMenorTiempo, menorTiempo, nombreMayorTiempo, mayorTiempo};
        return reporte;
        }
        
}
