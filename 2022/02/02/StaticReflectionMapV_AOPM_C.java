package SEM.reflection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapV_AOPM_E;

//����Ȩ��+ ����= ������
public class StaticReflectionMapV_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey, StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_C
			, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("PdeSwapPdcToPde")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapPdcToPde((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapPdcToPds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapPdcToPds((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapPdeToPds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapPdeToPds((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapPdsToPde")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapPdsToPde((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdcToPde")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdcToPde((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdcToPds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdcToPds((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdsToPde")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdsToPde((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdeToPds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdeToPds((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixtextToPdw")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixtextToPdw((FullDNATokenPDI)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixtextToPdw")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixtextToPdw((FullDNATokenPDI)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdwToPdc")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdwToPdc((FullDNATokenPDI)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaDBUtilDBRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaDBUtilDBRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaDBUtilbackEndRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaDBUtilbackEndRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaDBUtilcacheRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaDBUtilcacheRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_CulumnNameType")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_AOPM_C.IV_CulumnNameType();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("withoutCulumnNameType")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.withoutCulumnNameType((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaFrontEndUtilbackEndRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaFrontEndUtilbackEndRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaFrontEndUtilbackEndRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaFrontEndUtilbackEndRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("DetaFrontEndUtilhuaRuiJiRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaFrontEndUtilhuaRuiJiRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaFrontEndUtilcacheRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaFrontEndUtilcacheRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_DB")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_AOPM_C.IV_DB((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("compress")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.compress((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("uncompress")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.uncompress((byte[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
}
