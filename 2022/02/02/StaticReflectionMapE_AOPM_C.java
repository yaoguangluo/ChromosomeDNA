package SEM.reflection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapE_AOPM_C;
import SEM.bloom.StaticFunctionMapE_AOPM_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapE_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_C, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getSensingMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getSensingMap();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getEmotionMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getEmotionMap();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCogsBinaryForest_A")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getCogsBinaryForest_A();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getEuclid_C")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getEuclid_C();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		
		if(callFunctionKey.equalsIgnoreCase("getQuick6DLuoYaoguangSort")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getQuick6DLuoYaoguangSort();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getNERO_C_OneTime")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNERO_C_OneTime();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getNERO_C")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNERO_C();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getNLP_C")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNLP_C();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getBehaviorMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getBehaviorMap();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getFMHMMList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getFMHMMList();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getPos_C_XCDX_P")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getPos_C_XCDX_P();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getPos_C_XCDX_E")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getPos_C_XCDX_E();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getPos_C_XCDX_O")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getPos_C_XCDX_O();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getNlp_C_XCDX_S")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNlp_C_XCDX_S();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getNlp_C_XCDX_A")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getNlp_C_XCDX_A();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getA_XCDX_Map")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getA_XCDX_Map();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getA")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getA();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};if(callFunctionKey.equalsIgnoreCase("getBinaryForest_A")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_AOPM_C.getBinaryForest_A();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapE_AOPM_C.annotationMap.put("getSensingMap", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getEmotionMap", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getCogsBinaryForest_A", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getEuclid_C", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getQuick6DLuoYaoguangSort", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNERO_C_OneTime", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNERO_C", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNLP_C", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getBehaviorMap", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getFMHMMList", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getPos_C_XCDX_P", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getPos_C_XCDX_E", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getPos_C_XCDX_O", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNlp_C_XCDX_S", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getNlp_C_XCDX_A", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getA_XCDX_Map", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getA", "void");
		StaticFunctionMapE_AOPM_C.annotationMap.put("getBinaryForest_A", "void");	
	}
}
