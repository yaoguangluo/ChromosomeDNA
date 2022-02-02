package SEM.reflection;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ME.APM.VSQ.App;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapI_VECS_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapI_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_C, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("main")){ 
			StaticFunctionMapI_VECS_E.main(null);//稍后分出去
			output.put("I_VECS_main", "void");//非void接口就直接put进去即可。
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithImageAPP")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doTestWithImageAPP((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doFourJianPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				//24组设计完后统一用 linked map 以后接口写法传参只有linked map 一个变量
				map= staticFunctionMapI_VECS_C.doFourJianPDErosion((int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doFourSuanPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doFourSuanPDErosion((int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doEightSuanPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doEightSuanPDErosion((int)inputValues.get(传参因子[因子++])
						, (int)inputValues.get(传参因子[因子++]), (int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}			
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doEightJianPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doEightJianPDErosion((int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doFirstPDErosionWithTop")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doFirstPDErosionWithTop((double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doSecondPDErosionWithTop")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doSecondPDErosionWithTop((double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doThirdPDErosionWithTop")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doThirdPDErosionWithTop((double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(List<String>)inputValues.get(传参因子[因子++]), (BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("initDeciphring")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.initDeciphring((String)inputValues.get(传参因子[因子++])
						, (int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithFilePath")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doTestWithFilePath((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithImage")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doTestWithImage((Image)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithBufferedImage")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doTestWithBufferedImage((BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("staticMain")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.staticMain((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doPDERangePDI16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doPDERangePDI16((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
}
