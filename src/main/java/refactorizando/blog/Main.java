package refactorizando.blog;

import refactorizando.blog.implementacion.ImplementacionInterfacesCorrecta;

public class Main {

    public static void main(String[] args) {
        ImplementacionInterfacesCorrecta implementacion=new ImplementacionInterfacesCorrecta();
        Integer resultado1=implementacion.sumarInferido.suma(5,10);
        System.out.println(resultado1);
        Integer resultado2=implementacion.sumarInferidoSinNulos.suma(null,null);
        System.out.println(resultado1);
        String cadena="Me voy a invertir";
        String cadenaInvertida=implementacion.invierteCadena.invierteCadena(cadena);
        System.out.println(cadenaInvertida);
        //var x = () -> {};

        System.out.println(resultado1);
    }

}
