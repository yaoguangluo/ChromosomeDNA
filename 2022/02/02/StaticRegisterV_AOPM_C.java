package SEM.register;

import SEM.bloom.StaticFunctionMapV_AOPM_C;
import SEM.bloom.StaticFunctionMapV_AOPM_E;

//著作权人+ 作者= 罗瑶光
public class StaticRegisterV_AOPM_C {
	public static void load(StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdcToPde", "pdc:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdcToPds", "pdc:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdeToPds", "pds:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdsToPde", "pds:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdcToPde", "pdc:lock:de:ds:ie:is"); 

		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdcToPds", "pdc:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdeToPds", "pds:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdsToPde", "pds:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixtextToPdw", "pDE_RNA_FullFormular:password"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdwToPdc", "pDE_RNA_FullFormular"); 
		
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilDBRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilbackEndRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilcacheRequest", "request"); 

		StaticFunctionMapV_AOPM_C.annotationMap.put("IV_CulumnNameType", "void"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("withoutCulumnNameType", "culumnTypeString"); 	

		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilbackEndRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilhuaRuiJiRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilcacheRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("IV_DB", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("compress", "data"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("uncompress", "data"); 
	}
}
