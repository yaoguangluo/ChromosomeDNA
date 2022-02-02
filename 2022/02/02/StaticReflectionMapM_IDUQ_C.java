package SEM.reflection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapM_IDUQ_C;
import SEM.bloom.StaticFunctionMapM_IDUQ_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapM_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_C
			, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getQ_OulerRing")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getQ_OulerRing();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getQ_OulerRing16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getQ_OulerRing16();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDecadeToPDS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getDecadeToPDS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDecadeToPDS16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getDecadeToPDS16();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getPDE_PDS_DL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getPDE_PDS_DL();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getPDE_PDS_DL16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getPDE_PDS_DL16();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getQ_OulerRing", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getQ_OulerRing16", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getDecadeToPDS", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getDecadeToPDS16", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getPDE_PDS_DL", "void");
		StaticFunctionMapM_IDUQ_C.annotationMap.put("getPDE_PDS_DL16", "void");

	}
}
