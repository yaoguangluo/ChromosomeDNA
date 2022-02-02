package SEM.reflection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapM_IDUQ_E;

//����Ȩ��+ ����= ������
public class StaticReflectionMapM_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_C
			, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getQ_OulerRing")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getQ_OulerRing();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getQ_OulerRing16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getQ_OulerRing16();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDecadeToPDS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getDecadeToPDS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDecadeToPDS16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getDecadeToPDS16();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getPDE_PDS_DL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getPDE_PDS_DL();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getPDE_PDS_DL16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_IDUQ_C.getPDE_PDS_DL16();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
}
