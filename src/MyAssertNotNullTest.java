
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.Test;

public class MyAssertNotNullTest {

	@SuppressWarnings("unchecked")
	public String getPropValue(final String key){
		@SuppressWarnings("rawtypes")
		Map appProps = new HashMap();
		appProps.put("key1", "value 1");
		appProps.put("key2", "value 2");
		appProps.put("key3", "value 3");
		return (String) appProps.get(key);
	}
	
	@Test
	public void test(){
		MyAssertNotNullTest msnt = new MyAssertNotNullTest();
		assertNotNull(msnt.getPropValue("key1"));
	}
}