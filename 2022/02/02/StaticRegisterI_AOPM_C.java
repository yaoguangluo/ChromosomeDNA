package SEM.register;

import SEM.bloom.StaticFunctionMapI_AOPM_C;
import SEM.bloom.StaticFunctionMapI_AOPM_E;

//著作权人+ 作者= 罗瑶光
public class StaticRegisterI_AOPM_C {
	public static void load(StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapI_AOPM_C.annotationMap.put("getBigWord", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getClassify", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getCoAuthor", "dic_li:_A:pos");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getCoAuthorForWord", "app:_A:pos");//稍后优化传参变量名的 传参因子格式。
		StaticFunctionMapI_AOPM_C.annotationMap.put("getCoDNAAuthorForWord", "app:_A:pos");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getHistogram", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getLineMed", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getJpv", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getRecoder", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getVoicejPanel", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getLYGFileIO", "void");
	}
}
