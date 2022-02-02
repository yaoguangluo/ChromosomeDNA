package SEM.bloom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import OSI.SIQ.tinMap.TinMap;
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapS_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 
	//TinMap extends ConcurrentHashMap<String, Object> implements Cloneable{	
	public TinMap clone(TinMap tinMap) throws CloneNotSupportedException; 
	// DoSplit
	public List<String>splitRegex(String input, String split, String unSplit);
}
