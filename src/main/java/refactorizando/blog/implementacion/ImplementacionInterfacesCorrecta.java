package refactorizando.blog.implementacion;

import lombok.NonNull;
import refactorizando.blog.interfaces.InvierteCadena;
import refactorizando.blog.interfaces.SumaDosNumeros;


public class ImplementacionInterfacesCorrecta {
    public  SumaDosNumeros sumarNormal=(( x, y)-> x+y);
    public  SumaDosNumeros sumarInferido=((var x,var y)-> x+y);
    public  SumaDosNumeros sumarInferidoSinNulos=((@NonNull var x, @NonNull var y)->  x+y);

    public InvierteCadena invierteCadena=((var cadena)->{
       StringBuffer stringBuffer=new StringBuffer(cadena);
       stringBuffer=stringBuffer.reverse();
       return stringBuffer.toString();
    });


}
