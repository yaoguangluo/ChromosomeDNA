package SEM.reflection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import OSI.SIQ.tinMap.TinMap;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapS_IDUQ_C;
import SEM.bloom.StaticFunctionMapS_IDUQ_E;

//����Ȩ��+ ����= ������
public class StaticReflectionMapS_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey, StaticFunctionMapS_IDUQ_E staticFunctionMapS_IDUQ_C
			, Map<String, Object> output) throws IOException, CloneNotSupportedException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("clone")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_IDUQ_C.clone((TinMap)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("splitRegex")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_IDUQ_C.splitRegex((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapS_IDUQ_E staticFunctionMapS_IDUQ_E) {
		//�Ժ��װ
		StaticFunctionMapS_IDUQ_C.annotationMap.put("clone", "tinMap");
		StaticFunctionMapS_IDUQ_C.annotationMap.put("splitRegex", "input:split:unSplit");
	}
}
