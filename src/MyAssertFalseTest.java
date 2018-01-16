import org.junit.Test;
import static org.junit.Assert.*;
 
public class MyAssertFalseTest {
 
    public boolean esNumeroPar(int number){
         
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
     
    @Test
    public void testNumeroPar(){
        MyAssertFalseTest prueba = new MyAssertFalseTest();
        assertFalse(prueba.esNumeroPar(3));
    }
}