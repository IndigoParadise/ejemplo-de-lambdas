import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import refactorizando.blog.implementacion.ImplementacionInterfacesCorrecta;

public class LambdaTest {
    public ImplementacionInterfacesCorrecta implementacion;

    @BeforeEach
    public void init(){
        implementacion=new ImplementacionInterfacesCorrecta();
    }
    @Test
    public void sumarDosNumeros(){
        Integer resultado1=implementacion.sumarNormal.suma(5,10);
        System.out.println(resultado1);
        Assert.assertNotNull(resultado1);
        Integer resultado2=implementacion.sumarInferido.suma(5,10);
        System.out.println(resultado2);
        Assert.assertNotNull(resultado2);
        Integer resultado3=implementacion.sumarInferidoSinNulos.suma(null,null);
        System.out.println(resultado3);
        Assert.assertNotNull(resultado3);

    }

}
