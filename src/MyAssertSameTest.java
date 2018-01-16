
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MyAssertSameTest {

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
	public void isSameReferenceTest(){
		
		MyAssertSameTest msnt = new MyAssertSameTest();
		assertSame(msnt.getPropValue("key1"), msnt.getPropValue("key1"));
	}
}