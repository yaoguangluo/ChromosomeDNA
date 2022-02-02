package SEM.register;

import SEM.bloom.StaticFunctionMapI_VECS_C;
import SEM.bloom.StaticFunctionMapI_VECS_E;

//著作权人+ 作者= 罗瑶光
public class StaticRegisterI_VECS_C {
	public static void load(StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapI_VECS_C.annotationMap.put("main", "main");
		StaticFunctionMapI_VECS_C.annotationMap.put("doTestWithImageAPP", "app");
		StaticFunctionMapI_VECS_C.annotationMap.put("doFourJianPDErosion", "腐蚀浓度:像素阀值:像素比精度:像素差精度:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doFourSuanPDErosion", "腐蚀浓度:像素阀值:像素比精度:像素差精度:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doEightSuanPDErosion", "腐蚀浓度:像素阀值:像素比精度:像素差精度:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doEightJianPDErosion", "腐蚀浓度:像素阀值:像素比精度:像素差精度:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doFirstPDErosionWithTop", "fourJian:fourSuan:eightJian:eightSuan:scoreMatrix:top:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doSecondPDErosionWithTop", "fourJian:fourSuan:eightJian:eightSuan:scoreMatrix:top:times:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doThirdPDErosionWithTop", "fourJian:fourSuan:eightJian:eightSuan:scoreMatrix:top:times:output:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("initDeciphring", "string,type");
		StaticFunctionMapI_VECS_C.annotationMap.put("doTestWithFilePath", "testImagePath");
		StaticFunctionMapI_VECS_C.annotationMap.put("doTestWithImage", "testImagePath");
		StaticFunctionMapI_VECS_C.annotationMap.put("doTestWithBufferedImage", "testImagePath");
		StaticFunctionMapI_VECS_C.annotationMap.put("staticMain", "string");
		StaticFunctionMapI_VECS_C.annotationMap.put("doPDERangePDI16", "input:酸碱scale");
	}
}
