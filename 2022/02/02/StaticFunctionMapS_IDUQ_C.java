package SEM.bloom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import OSI.SIQ.tinMap.TinMap;
//����Ȩ��+ ����= ������
public interface StaticFunctionMapS_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 
	//TinMap extends ConcurrentHashMap<String, Object> implements Cloneable{	
	public TinMap clone(TinMap tinMap) throws CloneNotSupportedException; 
	// DoSplit
	public List<String>splitRegex(String input, String split, String unSplit);
}
