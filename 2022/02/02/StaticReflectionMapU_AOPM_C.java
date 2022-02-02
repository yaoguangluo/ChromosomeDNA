package SEM.reflection;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import ME.APM.VSQ.App;
import PEU.P.dna.Token;
import PEU.P.image.ConvexHull;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapU_AOPM_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapU_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_C
			, Map<String, Object> output) throws Exception {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("mapClassification")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.mapClassification((Map<String, Object>)inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "mapClassification") ;
		if(callFunctionKey.equalsIgnoreCase("mapClassification2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.mapClassification2D((Map<String, Object>)inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "mapClassification2D");
		if(callFunctionKey.equalsIgnoreCase("stringClassification2D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.stringClassification2D((String[])inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "stringClassification2D");
		if(callFunctionKey.equalsIgnoreCase("listClassification2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.listClassification2D((List<String>)inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "listClassification2D");
		if(callFunctionKey.equalsIgnoreCase("mapCombination")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.mapCombination((Map<String, Object>)inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "mapCombination");
		if(callFunctionKey.equalsIgnoreCase("listCombination")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.listCombination((List<Object>)inputValues.get(传参因子[因子++])
						,(List<Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "listCombination");
		if(callFunctionKey.equalsIgnoreCase("intArrayCombination")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.intArrayCombination((int[])inputValues.get(传参因子[因子++])
						,(int[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "intArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("doubleArrayCombination")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.doubleArrayCombination((double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "doubleArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("longArrayCombination")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.longArrayCombination((long[])inputValues.get(传参因子[因子++])
						,(long[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "longArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("floatArrayCombination")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.floatArrayCombination((float[])inputValues.get(传参因子[因子++])
						,(float[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "floatArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("StringArrayCombination")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.StringArrayCombination((String[])inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "StringArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("charArrayCombination")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.charArrayCombination((char[])inputValues.get(传参因子[因子++])
						,(char[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "charArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("byteArrayCombination")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.byteArrayCombination((byte[])inputValues.get(传参因子[因子++])
						,(byte[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "byteArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("vectorCombination")){           
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.vectorCombination((Vector<Object>)inputValues.get(传参因子[因子++])
						,(Vector<Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "vectorCombination");
		if(callFunctionKey.equalsIgnoreCase("DNAAuthStatusCheckEmailAndPds")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.DNAAuthStatusCheckEmailAndPds((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "DNAAuthStatusCheckEmailAndPds");
		if(callFunctionKey.equalsIgnoreCase("DNAAuthStatusCheckEmailAndPde")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.DNAAuthStatusCheckEmailAndPde((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "DNAAuthStatusCheckEmailAndPde");
		if(callFunctionKey.equalsIgnoreCase("DNAAuthStatusCheckEmailAndPassword")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.DNAAuthStatusCheckEmailAndPassword((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "DNAAuthStatusCheckEmailAndPassword");
		if(callFunctionKey.equalsIgnoreCase("DNAAuthCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.DNAAuthCheck((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "DNAAuthCheck");
		if(callFunctionKey.equalsIgnoreCase("encode")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.encode((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "encode");
		if(callFunctionKey.equalsIgnoreCase("decode")){        
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.decode((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "decode");
		if(callFunctionKey.equalsIgnoreCase("EncoderByMd5")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.EncoderByMd5((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "EncoderByMd5");
		if(callFunctionKey.equalsIgnoreCase("EncoderByDNA")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.EncoderByDNA((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]), (Token)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "EncoderByDNA");
		if(callFunctionKey.equalsIgnoreCase("getNewTokenFromUsrAndUsrToken")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getNewTokenFromUsrAndUsrToken((Usr)inputValues.get(传参因子[因子++])
						,(UsrToken)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getNewTokenFromUsrAndUsrToken");
		if(callFunctionKey.equalsIgnoreCase("getSecondMD5Password")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getSecondMD5Password((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getSecondMD5Password");
		if(callFunctionKey.equalsIgnoreCase("getFirstMD5Password")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getFirstMD5Password((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getFirstMD5Password");
		if(callFunctionKey.equalsIgnoreCase("getFirstDNAPassword")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getFirstDNAPassword((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Token)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getFirstDNAPassword");
		if(callFunctionKey.equalsIgnoreCase("getNewTokenFromUsrAndUsrTokenByDNA")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getNewTokenFromUsrAndUsrTokenByDNA((Usr)inputValues.get(传参因子[因子++])
						,(UsrToken)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getNewTokenFromUsrAndUsrTokenByDNA");
		if(callFunctionKey.equalsIgnoreCase("CheckRange_P")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.CheckRange_P((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "CheckRange_P");
		if(callFunctionKey.equalsIgnoreCase("Closing_P")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Closing_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Closing_P");
		if(callFunctionKey.equalsIgnoreCase("Color_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Color_P((int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Color_P");
		if(callFunctionKey.equalsIgnoreCase("convexHull")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.convexHull((List<ConvexHull.Vertex>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "convexHull");
		if(callFunctionKey.equalsIgnoreCase("compareSlope")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.compareSlope((int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "compareSlope");
		if(callFunctionKey.equalsIgnoreCase("PNGWrite")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.PNGWrite((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "PNGWrite");
		if(callFunctionKey.equalsIgnoreCase("CSVWrite")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.CSVWrite((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "CSVWrite");
		if(callFunctionKey.equalsIgnoreCase("Dilation_P")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Dilation_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Dilation_P");
		if(callFunctionKey.equalsIgnoreCase("Emboss_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Emboss_P((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Emboss_P");
		if(callFunctionKey.equalsIgnoreCase("Erosion_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Erosion_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Erosion_P");
		if(callFunctionKey.equalsIgnoreCase("print_Mean")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.print_Mean((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "print_Mean");
		if(callFunctionKey.equalsIgnoreCase("print_Mean")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.print_Mean((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "print_Mean");
		if(callFunctionKey.equalsIgnoreCase("Guassian_P_2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Guassian_P_2D((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Guassian_P_2D");
		if(callFunctionKey.equalsIgnoreCase("Guassian_P_1D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Guassian_P_1D((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Guassian_P_1D");
		if(callFunctionKey.equalsIgnoreCase("Guassian_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Guassian_P((BufferedImage)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Guassian_P");
		if(callFunctionKey.equalsIgnoreCase("HitAndMiss_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.HitAndMiss_P((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "HitAndMiss_P");
		if(callFunctionKey.equalsIgnoreCase("HoughTransformLoop")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.HoughTransformLoop((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "HoughTransformLoop");
		if(callFunctionKey.equalsIgnoreCase("IV_HTMatrix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.IV_HTMatrix((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "IV_HTMatrix");
		if(callFunctionKey.equalsIgnoreCase("Laplacian_P")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Laplacian_P((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Laplacian_P");
		if(callFunctionKey.equalsIgnoreCase("Mask_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Mask_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Mask_P");
		if(callFunctionKey.equalsIgnoreCase("Median_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Median_P((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Median_P");
		if(callFunctionKey.equalsIgnoreCase("Opening_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Opening_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Opening_P");
		if(callFunctionKey.equalsIgnoreCase("PrintCurrent")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.PrintCurrent((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "PrintCurrent");
		if(callFunctionKey.equalsIgnoreCase("writePNG")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.writePNG((String)inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "writePNG");
		if(callFunctionKey.equalsIgnoreCase("GRNpngRead")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.GRNpngRead((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "GRNpngRead");
		if(callFunctionKey.equalsIgnoreCase("REDpngRead")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.REDpngRead((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "REDpngRead");
		if(callFunctionKey.equalsIgnoreCase("BLUpngRead")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.BLUpngRead((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "BLUpngRead");
		if(callFunctionKey.equalsIgnoreCase("sizeHW")){        
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.sizeHW((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "sizeHW");
		if(callFunctionKey.equalsIgnoreCase("createBufferImage")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.createBufferImage((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "createBufferImage");
		if(callFunctionKey.equalsIgnoreCase("smallToNormal")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.smallToNormal((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "smallToNormal");
		if(callFunctionKey.equalsIgnoreCase("PadImage")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.PadImage((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "PadImage");
		if(callFunctionKey.equalsIgnoreCase("RegionGet")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.RegionGet((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "RegionGet");
		if(callFunctionKey.equalsIgnoreCase("buildGraph")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.buildGraph((int[][])inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "buildGraph");
		if(callFunctionKey.equalsIgnoreCase("Sobel_P")){          
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Sobel_P((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Sobel_P");
		if(callFunctionKey.equalsIgnoreCase("Sobel_P_WithMask")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Sobel_P_WithMask((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Sobel_P_WithMask");
		if(callFunctionKey.equalsIgnoreCase("Strech_P")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Strech_P((int[][])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Strech_P");
		if(callFunctionKey.equalsIgnoreCase("Threshold_P")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Threshold_P((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Threshold_P");
		if(callFunctionKey.equalsIgnoreCase("getCnnMeansure")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getCnnMeansure((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getCnnMeansure");
		if(callFunctionKey.equalsIgnoreCase("WAVtoLYG")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.WAVtoLYG((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "WAVtoLYG");
		if(callFunctionKey.equalsIgnoreCase("summing_P")){        
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.summing_P((String[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "summing_P");
		if(callFunctionKey.equalsIgnoreCase("initATableSorterZYNK")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.initATableSorterZYNK();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "initATableSorterZYNK");
		if(callFunctionKey.equalsIgnoreCase("initATimeCheck")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.initATimeCheck();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "initATimeCheck");

		if(callFunctionKey.equalsIgnoreCase("zhiShu")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.zhiShu((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "zhiShu");
		if(callFunctionKey.equalsIgnoreCase("copy2d")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.copy2d((double[][])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "copy2d");
		if(callFunctionKey.equalsIgnoreCase("copy1d")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.copy1d((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "copy1d");
		if(callFunctionKey.equalsIgnoreCase("copy1dx2")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.copy1dx2((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "copy1dx2");

		if(callFunctionKey.equalsIgnoreCase("initADFT")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.initADFT();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "initADFT");
		if(callFunctionKey.equalsIgnoreCase("initAFFT")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.initAFFT();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "initAFFT");
		if(callFunctionKey.equalsIgnoreCase("guassian1d")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.guassian1d((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "guassian1d");
		if(callFunctionKey.equalsIgnoreCase("laplasian1d")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.laplasian1d((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "laplasian1d");
		if(callFunctionKey.equalsIgnoreCase("max_v")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.max_v((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "max_v");
		if(callFunctionKey.equalsIgnoreCase("max_i")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.max_i((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "max_i");

		if(callFunctionKey.equalsIgnoreCase("min_v")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.min_v((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "min_v");
		if(callFunctionKey.equalsIgnoreCase("min_i")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.min_i((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "min_i");
		if(callFunctionKey.equalsIgnoreCase("median1d")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.median1d((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "median1d");
		if(callFunctionKey.equalsIgnoreCase("fengTong1D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengTong1D((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengTong1");
		if(callFunctionKey.equalsIgnoreCase("fengPaixX")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengPaixX((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengPaixX");
		if(callFunctionKey.equalsIgnoreCase("fengPaiyY")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengPaiyY((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengPaiyY");
		if(callFunctionKey.equalsIgnoreCase("fengPaiXx")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengPaiXx((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengPaiXx");
		if(callFunctionKey.equalsIgnoreCase("fengPaiYy")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengPaiYy((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengPaiYy");
		if(callFunctionKey.equalsIgnoreCase("newX")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newX((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newX");

		if(callFunctionKey.equalsIgnoreCase("newY")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newY((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newY");
		if(callFunctionKey.equalsIgnoreCase("newXY")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newXY((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newXY");
		if(callFunctionKey.equalsIgnoreCase("newXYBest")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newXYBest((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newXYBest");
		if(callFunctionKey.equalsIgnoreCase("newYwithoutBound")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newYwithoutBound((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newYwithoutBound");
		if(callFunctionKey.equalsIgnoreCase("newXYYwithoutBound")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newXYYwithoutBound((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newXYYwithoutBound");
		if(callFunctionKey.equalsIgnoreCase("liangHuaDengChaAdd")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaDengChaAdd((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaDengChaAdd");
		if(callFunctionKey.equalsIgnoreCase("liangHuaXiHua")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaXiHua((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaXiHua");

		if(callFunctionKey.equalsIgnoreCase("liangHuaDengChaMines")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaDengChaMines((double[])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaDengChaMines");
		if(callFunctionKey.equalsIgnoreCase("liangHuaEqualDelete")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaEqualDelete((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaEqualDelete");
		if(callFunctionKey.equalsIgnoreCase("liangHuaXiHuaHalfSide")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaXiHuaHalfSide((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaXiHuaHalfSide");
		if(callFunctionKey.equalsIgnoreCase("shehold1D")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.shehold1D((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "shehold1D");
		if(callFunctionKey.equalsIgnoreCase("caiJian1D")){         
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.caiJian1D((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "caiJian1D");
		if(callFunctionKey.equalsIgnoreCase("unZipWithPath")){        
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.unZipWithPath((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "unZipWithPath");
		if(callFunctionKey.equalsIgnoreCase("bootBackupByUsingGzip")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.bootBackupByUsingGzip((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "bootBackupByUsingGzip");
		if(callFunctionKey.equalsIgnoreCase("fileToZip")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fileToZip((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fileToZip");
		if(callFunctionKey.equalsIgnoreCase("compress")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.compress((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "compress");
		if(callFunctionKey.equalsIgnoreCase("uncompress")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.uncompress((byte[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "uncompress");

		if(callFunctionKey.equalsIgnoreCase("P_Heart")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.P_Heart((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "P_Heart");
		if(callFunctionKey.equalsIgnoreCase("P_Model")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.P_Model((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "P_Model");
	}
}
