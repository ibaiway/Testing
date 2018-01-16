import org.junit.Test;
 
 
import static org.junit.Assert.*;
 
public class MyAssertEqualsTest {
 
    @Test
    public void mySimpleEqualsTest(){
         
        String expectedName = "Nattu";
        assertEquals(expectedName, Trabajador.getNombreTrabjadorMayorSalario());
    }
     
    @Test
    public void myObjectEqualsTest(){
         
        Trabajador expectedEmpObj = new Trabajador(1, "Nattu", 15000);
        assertEquals(expectedEmpObj, Trabajador.getTrabajadorMayorSalario());
    }
}