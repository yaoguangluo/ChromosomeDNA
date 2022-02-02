package SEM.reflection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI_XCDX;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapA_IDUQ_C;
import SEM.bloom.StaticFunctionMapA_IDUQ_E;

//��dna���ܵ� main test ���з�װ�ɺ�����׼���Ż��¡�
//����Ȩ��+ ����= ������
public class StaticReflectionMapA_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_E, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getPDW")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= StaticFunctionMapA_IDUQ_C.getPDW((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getLock")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= StaticFunctionMapA_IDUQ_C.getLock();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCode")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= StaticFunctionMapA_IDUQ_C.getCode((String)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doPDE")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= StaticFunctionMapA_IDUQ_C.doPDE((FullDNATokenPDI_XCDX)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doPrefixPDE")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= StaticFunctionMapA_IDUQ_C.doPrefixPDE((FullDNATokenPDI_XCDX)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doPostfixPDE")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= StaticFunctionMapA_IDUQ_C.doPostfixPDE((FullDNATokenPDI_XCDX)inputValues.get(��������[����++])
						, (FullDNATokenPDI_XCDX)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doSurffixPDE")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= StaticFunctionMapA_IDUQ_C.doSurffixPDE((FullDNATokenPDI_XCDX)inputValues.get(��������[����++])
						, (FullDNATokenPDI_XCDX)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}

	public static void load(StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_E) {
		//�Ժ��װ
		StaticFunctionMapA_IDUQ_C.annotationMap.put("getPDW", "string");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("getLock", "void");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("getCode", "lock:pdw");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("doPDE", "pDE_RNA_FullFormular");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("doPrefixPDE", "pDE_RNA_FullFormular");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("doPostfixPDE", "pDE_RNA_FullFormular:pDE_RNA_FullFormularNew");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("doSurffixPDE", "pDE_RNA_FullFormular:pDE_RNA_FullFormularNew"); //֮����Щ123 �Ҷ�������������
	}
}
