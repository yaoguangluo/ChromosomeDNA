package SEM.register;

import SEM.bloom.StaticFunctionMapU_AOPM_C;
import SEM.bloom.StaticFunctionMapU_AOPM_E;

//著作权人+ 作者= 罗瑶光
public class StaticRegisterU_AOPM_C {
	public static void load(StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapU_AOPM_C.annotationMap.put("mapClassification", "input:keywords");
		StaticFunctionMapU_AOPM_C.annotationMap.put("mapClassification2D", "input:keywords");
		StaticFunctionMapU_AOPM_C.annotationMap.put("stringClassification2D", "input:keywords");
		StaticFunctionMapU_AOPM_C.annotationMap.put("listClassification2D", "input:keywords");
		StaticFunctionMapU_AOPM_C.annotationMap.put("mapCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("listCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("intArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("doubleArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("longArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("floatArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("StringArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("charArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("byteArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("vectorCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("DNAAuthStatusCheckEmailAndPds", "app:string:data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("DNAAuthStatusCheckEmailAndPde", "app:string:data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("DNAAuthStatusCheckEmailAndPassword", "app:string:data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("DNAAuthCheck", "app:string:data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("encode", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("decode", "str");
		StaticFunctionMapU_AOPM_C.annotationMap.put("EncoderByMd5", "salt:pwd:enctimes");
		StaticFunctionMapU_AOPM_C.annotationMap.put("EncoderByDNA", "key:uPassword:token");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getNewTokenFromUsrAndUsrToken", "usr:usrToken");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getSecondMD5Password", "uPassword");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getFirstMD5Password", "key:uPassword");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getFirstDNAPassword", "key:uPassword:token");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getNewTokenFromUsrAndUsrTokenByDNA", "usr:usrToken");
		StaticFunctionMapU_AOPM_C.annotationMap.put("CheckRange_P", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Closing_P", "g:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Color_P", "r:g:b");
		StaticFunctionMapU_AOPM_C.annotationMap.put("convexHull", "vertices");
		StaticFunctionMapU_AOPM_C.annotationMap.put("compareSlope", "dy2:dx2:dy1:dx1");
		StaticFunctionMapU_AOPM_C.annotationMap.put("PNGWrite", " g:pix:output");
		StaticFunctionMapU_AOPM_C.annotationMap.put("CSVWrite", "g:pix:outputcsv");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Dilation_P", "g:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Emboss_P", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Erosion_P", "g:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("print_Mean", "outDIR");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Guassian_P_2D", " g:d:e:sig");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Guassian_P_1D", "g:frection:kernel:sig");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Guassian_P", "lygimage:d:e:k");
		StaticFunctionMapU_AOPM_C.annotationMap.put("HitAndMiss_P", "g:pix:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("HoughTransformLoop", "g:pix:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("IV_HTMatrix", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Laplacian_P", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Mask_P", "mag:dir");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Median_P", "g:d:e");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Opening_P", "g:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("PrintCurrent", "g:pix");
		StaticFunctionMapU_AOPM_C.annotationMap.put("writePNG", "args:outmag");
		StaticFunctionMapU_AOPM_C.annotationMap.put("GRNpngRead", "args");
		StaticFunctionMapU_AOPM_C.annotationMap.put("REDpngRead", "args");
		StaticFunctionMapU_AOPM_C.annotationMap.put("BLUpngRead", "args");
		StaticFunctionMapU_AOPM_C.annotationMap.put("sizeHW", "args");
		StaticFunctionMapU_AOPM_C.annotationMap.put("createBufferImage", "r:g:b");
		StaticFunctionMapU_AOPM_C.annotationMap.put("smallToNormal", "r:s:b");
		StaticFunctionMapU_AOPM_C.annotationMap.put("PadImage", "_image:height:width");
		StaticFunctionMapU_AOPM_C.annotationMap.put("RegionGet", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("buildGraph", "g:output");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Sobel_P", "g:choice");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Sobel_P_WithMask", "g:choice:mask");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Strech_P", "g:d:e");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Threshold_P", "g:Td");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Threshold_P_Section", "g:Ts:Td");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getCnnMeansure", "inputs");
		StaticFunctionMapU_AOPM_C.annotationMap.put("WAVtoLYG", "WAVf:LYGf");
		StaticFunctionMapU_AOPM_C.annotationMap.put("summing_P", "inputNLP");
		StaticFunctionMapU_AOPM_C.annotationMap.put("initATableSorterZYNK", "void");
		StaticFunctionMapU_AOPM_C.annotationMap.put("initATimeCheck", "void");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("zhiShu", "input:scale:shehold");
		StaticFunctionMapU_AOPM_C.annotationMap.put("copy2d", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("copy1d", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("copy1dx2", "input:scale");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("initADFT", "void");
		StaticFunctionMapU_AOPM_C.annotationMap.put("initAFFT", "void");
		StaticFunctionMapU_AOPM_C.annotationMap.put("guassian1d", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("laplasian1d", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("max_v", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("max_i", "input");
	 
		StaticFunctionMapU_AOPM_C.annotationMap.put("min_v", "input:rank");
		StaticFunctionMapU_AOPM_C.annotationMap.put("min_i", "input:rank");
		StaticFunctionMapU_AOPM_C.annotationMap.put("median1D", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengTong1D", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengPaixX", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengPaiyY", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengPaiXx", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengPaiYy", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("newX", "input:width");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("newY", "input:hight");//height
		StaticFunctionMapU_AOPM_C.annotationMap.put("newXY", "input:width:hight");
		StaticFunctionMapU_AOPM_C.annotationMap.put("newXYBest", "input:width:hight");
		StaticFunctionMapU_AOPM_C.annotationMap.put("newYwithoutBound", "input:hight");
		StaticFunctionMapU_AOPM_C.annotationMap.put("newXYYwithoutBound", "input:width:hight");
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaDengChaAdd", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaXiHua", "input:scale");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaDengChaMines", "input:scale");//稍后去掉拼音接口，只有中文和英文
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaEqualDelete", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaXiHuaHalfSide", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("shehold1D", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("caiJian1D", "input:left:right");
		StaticFunctionMapU_AOPM_C.annotationMap.put("unZipWithPath", "zipFullPath:zipCategory");
		StaticFunctionMapU_AOPM_C.annotationMap.put("bootBackupByUsingGzip", "zipPath");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fileToZip", "sourceFilePath:zipFilePath:fileName");
		StaticFunctionMapU_AOPM_C.annotationMap.put("compress", "data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("uncompress", "data");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("P_Heart", "zuoBiao:distance:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("P_Model", "zuoBiao:yanjing");
	}
}
