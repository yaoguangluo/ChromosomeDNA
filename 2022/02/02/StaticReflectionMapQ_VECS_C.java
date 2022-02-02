package SEM.reflection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapQ_VECS_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapQ_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C
			, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("searchFromTable")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapQ_VECS_C.searchFromTable((String) inputValues.get(传参因子[因子++])
						, (DefaultTableModel) inputValues.get(传参因子[因子++])
						, (Object[][]) inputValues.get(传参因子[因子++])
						, (ArrayList<String>) inputValues.get(传参因子[因子++])
						, (Map<String, String>) inputValues.get(传参因子[因子++])
						, (App) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("searchFromTablewithScale")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapQ_VECS_C.searchFromTablewithScale((String) inputValues.get(传参因子[因子++])
						, (ArrayList<String>) inputValues.get(传参因子[因子++])
						, (Map<String, String>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
}
