package SEM.register;

import SEM.bloom.StaticFunctionMapA_IDUQ_C;
import SEM.bloom.StaticFunctionMapA_IDUQ_E;

//著作权人+ 作者= 罗瑶光
public class StaticRegisterA_IDUQ_C {
	public static void load(StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_E) {
		//稍后封装
		StaticFunctionMapA_IDUQ_C.annotationMap.put("getPDW", "string");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("getLock", "void");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("getCode", "lock:pdw");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("doPDE", "pDE_RNA_FullFormular");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("doPrefixPDE", "pDE_RNA_FullFormular");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("doPostfixPDE", "pDE_RNA_FullFormular:pDE_RNA_FullFormularNew");
		StaticFunctionMapA_IDUQ_C.annotationMap.put("doSurffixPDE", "pDE_RNA_FullFormular:pDE_RNA_FullFormularNew"); //之后这些123 我都会重新命名。
	}
}
