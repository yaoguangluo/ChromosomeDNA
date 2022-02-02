package SEM.reflection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OCI.ME.analysis.C.A;
import PCI.ASQ.basic.RatioMatrix;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapP_VECS_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapP_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_C
			, Map<String, Object> output) throws IOException
	, InstantiationException, IllegalAccessException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("aNNTest")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.aNNTest((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "aNNTest");
		if(callFunctionKey.equalsIgnoreCase("dNNTest")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.dNNTest((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "dNNTest");
		if(callFunctionKey.equalsIgnoreCase("rNNTest")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.rNNTest((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "rNNTest");
		if(callFunctionKey.equalsIgnoreCase("sensingTest")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.sensingTest((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "sensingTest");
		if(callFunctionKey.equalsIgnoreCase("educationLevelTest")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.educationLevelTest((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "educationLevelTest");
		if(callFunctionKey.equalsIgnoreCase("literarinessLevelTest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.literarinessLevelTest((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "literarinessLevelTest");
		if(callFunctionKey.equalsIgnoreCase("successICATest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.successICATest((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "successICATest");
		if(callFunctionKey.equalsIgnoreCase("getSideEnd2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getSideEnd2D((List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getSideEnd2D");
		if(callFunctionKey.equalsIgnoreCase("getSideEnd3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getSideEnd3D((List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getSideEnd3D");
		if(callFunctionKey.equalsIgnoreCase("addNewPositionWithoutHeart")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.addNewPositionWithoutHeart(
						(Map<Double,List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++])
						, (AMV_MVS_VSQ_2D) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "addNewPositionWithoutHeart");
		if(callFunctionKey.equalsIgnoreCase("addNewPositionWithHeart")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.addNewPositionWithHeart(
						(Map<Double, List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++]),
						(AMV_MVS_VSQ_2D) inputValues.get(传参因子[因子++])
						, (Map<Double, AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "addNewPositionWithHeart");
		if(callFunctionKey.equalsIgnoreCase("getShortestSamplePosition2DGroup")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShortestSamplePosition2DGroup(
						(AMV_MVS_VSQ_2D) inputValues.get(传参因子[因子++])
						, (Map<Double, List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShortestSamplePosition2DGroup");
		if(callFunctionKey.equalsIgnoreCase("getShorterSamplePosition2DGroupsWithScale")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShorterSamplePosition2DGroupsWithScale(
						(AMV_MVS_VSQ_2D) inputValues.get(传参因子[因子++])
						, (Map<Double, List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShorterSamplePosition2DGroupsWithScale");
		if(callFunctionKey.equalsIgnoreCase("getShortestSamplePosition3DGroup")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShortestSamplePosition3DGroup(
						(AMV_MVS_VSQ_3D) inputValues.get(传参因子[因子++])
						, (Map<Double, List<AMV_MVS_VSQ_3D>>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShortestSamplePosition3DGroup");
		if(callFunctionKey.equalsIgnoreCase("getShortestSamplePosition3DGroupsWithScale")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShortestSamplePosition3DGroupsWithScale(
						(AMV_MVS_VSQ_3D) inputValues.get(传参因子[因子++])
						, (Map<Double, List<AMV_MVS_VSQ_3D>>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShortestSamplePosition3DGroupsWithScale");
		if(callFunctionKey.equalsIgnoreCase("fissilePosition2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.fissilePosition2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fissilePosition2D");
		if(callFunctionKey.equalsIgnoreCase("fissilePosition3D")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.fissilePosition3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fissilePosition3D");
		if(callFunctionKey.equalsIgnoreCase("fusionPosition2DwithHeart")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.fusionPosition2DwithHeart(
						(Map<Double, List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++]),
						(Map<Double, AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fusionPosition2DwithHeart");
		if(callFunctionKey.equalsIgnoreCase("fusionPosition3DwithHeart")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.fusionPosition3DwithHeart(
						(Map<Double, List<AMV_MVS_VSQ_3D>>) inputValues.get(传参因子[因子++]),
						(Map<Double, AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fusionPosition3DwithHeart");
		if(callFunctionKey.equalsIgnoreCase("getTSPIsolationGroups2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTSPIsolationGroups2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTSPIsolationGroups2D");
		if(callFunctionKey.equalsIgnoreCase("getTSPIsolationGroups3D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTSPIsolationGroups3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTSPIsolationGroups3D");
		if(callFunctionKey.equalsIgnoreCase("getTSPForestIsolationGroups2D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTSPForestIsolationGroups2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTSPForestIsolationGroups2D");
		if(callFunctionKey.equalsIgnoreCase("getTSPForestIsolationGroups3D")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTSPForestIsolationGroups3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTSPForestIsolationGroups3D");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition2DHeartsWithSingerGroup")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition2DHeartsWithSingerGroup(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition2DHeartsWithSingerGroup");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition3DHeartsWithSingerGroup")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition3DHeartsWithSingerGroup(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition3DHeartsWithSingerGroup");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition2DByHearts")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition2DByHearts(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition2DByHearts");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition3DByHearts")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition3DByHearts(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition3DByHearts");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition2DHeartsWithFissileGroups")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition2DHeartsWithFissileGroups(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition2DHeartsWithFissileGroups");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition3DHeartsWithFissileGroups")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition3DHeartsWithFissileGroups(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition3DHeartsWithFissileGroups");
		if(callFunctionKey.equalsIgnoreCase("findMeanDistanceFromPositions2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanDistanceFromPositions2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanDistanceFromPositions2D");
		if(callFunctionKey.equalsIgnoreCase("findMeanDistanceFromPositions3D")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanDistanceFromPositions3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanDistanceFromPositions3D");
		if(callFunctionKey.equalsIgnoreCase("findPascalMeanDistanceByEachPositions2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findPascalMeanDistanceByEachPositions2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findPascalMeanDistanceByEachPositions2D");
		if(callFunctionKey.equalsIgnoreCase("findPascalMeanDistanceByEachPositions3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findPascalMeanDistanceByEachPositions3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findPascalMeanDistanceByEachPositions3D");
		if(callFunctionKey.equalsIgnoreCase("getPosition2DsGroupPascalHearts")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition2DsGroupPascalHearts(
						(ArrayList<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition2DsGroupPascalHearts");
		if(callFunctionKey.equalsIgnoreCase("getPosition3DsGroupPascalHearts")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition3DsGroupPascalHearts(
						(ArrayList<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition3DsGroupPascalHearts");
		if(callFunctionKey.equalsIgnoreCase("getPosition2DsGroupPascalMids")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition2DsGroupPascalMids(
						(ArrayList<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition2DsGroupPascalMids");

		if(callFunctionKey.equalsIgnoreCase("getPosition3DsGroupPascalMids")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition3DsGroupPascalMids(
						(ArrayList<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition3DsGroupPascalMids");
		if(callFunctionKey.equalsIgnoreCase("getPosition2DsGroupPascalDirection")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition2DsGroupPascalDirection(
						(Map<Double,AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(Map<Double,AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition2DsGroupPascalDirection");
		if(callFunctionKey.equalsIgnoreCase("getPosition3DsGroupPascalDirection")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition3DsGroupPascalDirection(
						(Map<Double,AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(Map<Double,AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition3DsGroupPascalDirection");
		if(callFunctionKey.equalsIgnoreCase("getPosition3DsGroupPascalDirection")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition3DsGroupPascalDirection(
						(Map<Double,AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(Map<Double,AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition3DsGroupPascalDirection");
		if(callFunctionKey.equalsIgnoreCase("getPosition2DsGroupPascalDirection")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition2DsGroupPascalDirection(
						(Map<Double,AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(Map<Double,AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition2DsGroupPascalDirection");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo2DEulerRingTSP")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo2DEulerRingTSP(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo2DEulerRingTSP");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo3DEulerRingTSP")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo3DEulerRingTSP(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo3DEulerRingTSP");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo2DEulerRingTSP2D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo2DEulerRingTSP2D(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo2DEulerRingTSP2D");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo3DEulerRingTSP2D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo3DEulerRingTSP2D(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo3DEulerRingTSP2D");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo2DEulerRingTSP3D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo2DEulerRingTSP3D(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo2DEulerRingTSP3D");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo3DEulerRingTSP3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo3DEulerRingTSP3D(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo3DEulerRingTSP3D");

		if(callFunctionKey.equalsIgnoreCase("getImagePix2DGroupFilter")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getImagePix2DGroupFilter(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getImagePix2DGroupFilter");
		if(callFunctionKey.equalsIgnoreCase("getImagePix3DGroupFilter")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getImagePix3DGroupFilter(
						(int[][][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getImagePix3DGroupFilter");
		if(callFunctionKey.equalsIgnoreCase("NLPBestSentenceMatch")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.NLPBestSentenceMatch(
						(String)inputValues.get(传参因子[因子++]),(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "NLPBestSentenceMatch");
		if(callFunctionKey.equalsIgnoreCase("NLPBestSentencesMatch")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.NLPBestSentencesMatch(
						(String)inputValues.get(传参因子[因子++]),(String[])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "NLPBestSentencesMatch");
		if(callFunctionKey.equalsIgnoreCase("getNLPBestSentencesMatchScore")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getNLPBestSentencesMatchScore(
						(String)inputValues.get(传参因子[因子++]),(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getNLPBestSentencesMatchScore");
		if(callFunctionKey.equalsIgnoreCase("getNLPBestSentencesMatchScoreRights")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getNLPBestSentencesMatchScoreRights(
						(String) inputValues.get(传参因子[因子++])
						, (String[]) inputValues.get(传参因子[因子++]), (A) inputValues.get(传参因子[因子++]),
						(Map<String, String>) inputValues.get(传参因子[因子++])
						, (Map<String, WordFrequency>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getNLPBestSentencesMatchScoreRights");
		if(callFunctionKey.equalsIgnoreCase("getErrorAsserts")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getErrorAsserts((double)inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getErrorAsserts");
		if(callFunctionKey.equalsIgnoreCase("getBinaryErrorAsserts")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getBinaryErrorAsserts(
						(double)inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getBinaryErrorAsserts");
		if(callFunctionKey.equalsIgnoreCase("findTotalIncrementWithScale")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findTotalIncrementWithScale((double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findTotalIncrementWithScale");
		if(callFunctionKey.equalsIgnoreCase("findMeanIncrementWithScale")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanIncrementWithScale((double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanIncrementWithScale");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfFilterDoubleArrayWithScale")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfFilterDoubleArrayWithScale(
						(double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfFilterDoubleArrayWithScale");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfDoubleArray")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfDoubleArray((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfDoubleArray");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfTwoDoubleArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfTwoDoubleArray(
						(Double[])inputValues.get(传参因子[因子++]),(Double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfTwoDoubleArray");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfTwoDoubleArray2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfTwoDoubleArray2D(
						(Double[][])inputValues.get(传参因子[因子++]),(Double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfTwoDoubleArray2D");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfDoubleMatrix2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findRowMeanOfDoubleMatrix2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findRowMeanOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findRowMeanOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findCulumnMeanOfDoubleMatrix2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findCulumnMeanOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findCulumnMeanOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfDoubleMatrix3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfDoubleMatrix3D(
						(double[][][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfDoubleMatrix3D");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfDoubleList")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfDoubleList(
						(List<Double>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfDoubleList");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfMartrix1DList")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfMartrix1DList(
						(List<Double[]>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfMartrix1DList");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfMartrix2DList")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfMartrix2DList(
						(List<Double[][]>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfMartrix2DList");
		if(callFunctionKey.equalsIgnoreCase("findSumOfDoubleArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfDoubleArray(
						(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfDoubleArray");	
		if(callFunctionKey.equalsIgnoreCase("findSumOfTwoDoubleArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfTwoDoubleArray(
						(Double[])inputValues.get(传参因子[因子++]),(Double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfTwoDoubleArray");
		if(callFunctionKey.equalsIgnoreCase("findSumOfTwoDoubleArray2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfTwoDoubleArray2D(
						(Double[][])inputValues.get(传参因子[因子++]),(Double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfTwoDoubleArray2D");


		if(callFunctionKey.equalsIgnoreCase("findSumOfDoubleMatrix2D")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findRowSumOfDoubleMatrix2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findRowSumOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findRowSumOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findCulumnSumOfDoubleMatrix2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findCulumnSumOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findCulumnSumOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findSumOfDoubleMatrix3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfDoubleMatrix3D(
						(double[][][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfDoubleMatrix3D");
		if(callFunctionKey.equalsIgnoreCase("findSumOfDoubleList")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfDoubleList(
						(List<Double>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfDoubleList");
		if(callFunctionKey.equalsIgnoreCase("findSumOfMartrix1DList")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfMartrix1DList(
						(List<Double[]>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfMartrix1DList");
		if(callFunctionKey.equalsIgnoreCase("findSumOfMartrix2DList")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfMartrix2DList(
						(List<Double[][]>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfMartrix2DList");
		if(callFunctionKey.equalsIgnoreCase("getShareholdCount")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShareholdCount(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShareholdCount");
		if(callFunctionKey.equalsIgnoreCase("encodeEstimateSumOfScoresList")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.encodeEstimateSumOfScoresList(
						(List<Double>)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "encodeEstimateSumOfScoresList");
		if(callFunctionKey.equalsIgnoreCase("encodeEstimateSumOfScoresArray")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.encodeEstimateSumOfScoresArray(
						(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "encodeEstimateSumOfScoresArray");
		if(callFunctionKey.equalsIgnoreCase("getEstimateCartesianSumOfScoresArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getEstimateCartesianSumOfScoresArray(
						(double)inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getEstimateCartesianSumOfScoresArray");
		if(callFunctionKey.equalsIgnoreCase("getEstimateCartesian1DSumOfScoresArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getEstimateCartesian1DSumOfScoresArray(
						(double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getEstimateCartesian1DSumOfScoresArray");
		if(callFunctionKey.equalsIgnoreCase("encodeEstimateInitonsScore")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.encodeEstimateInitonsScore((double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "encodeEstimateInitonsScore");

		if(callFunctionKey.equalsIgnoreCase("decodeEstimateInitonsScore")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.decodeEstimateInitonsScore((double)inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "decodeEstimateInitonsScore");
		if(callFunctionKey.equalsIgnoreCase("getRightsEstimateScore")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getRightsEstimateScore((double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getRightsEstimateScore");
		if(callFunctionKey.equalsIgnoreCase("getSimilarFuzzSetWithScale")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getSimilarFuzzSetWithScale((RatioMatrix)inputValues.get(传参因子[因子++])
						,(List<RatioMatrix>)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getSimilarFuzzSetWithScale");
		if(callFunctionKey.equalsIgnoreCase("getDistanceRatio2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getDistanceRatio2D(
						(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getDistanceRatio2D");
		if(callFunctionKey.equalsIgnoreCase("getARCDistanceRatio2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getARCDistanceRatio2D(
						(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getARCDistanceRatio2D");
		if(callFunctionKey.equalsIgnoreCase("getTrueARCDistanceRatio2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTrueARCDistanceRatio2D(
						(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTrueARCDistanceRatio2D");
		if(callFunctionKey.equalsIgnoreCase("getDistanceRatio3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getDistanceRatio3D(
						(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getDistanceRatio3D");
		if(callFunctionKey.equalsIgnoreCase("getTrueARCDistanceRatio3D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTrueARCDistanceRatio3D(
						(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTrueARCDistanceRatio3D");
		if(callFunctionKey.equalsIgnoreCase("getPercentListByOuterKey")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPercentListByOuterKey(
						(Double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPercentListByOuterKey");
		if(callFunctionKey.equalsIgnoreCase("kernel")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.kernel((List<Double>)inputValues.get(传参因子[因子++])
						,(Double[])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "kernel");
		if(callFunctionKey.equalsIgnoreCase("kernelFix")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.kernelFix((List<Double>)inputValues.get(传参因子[因子++])
						,(Double[])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "kernelFix");
		if(callFunctionKey.equalsIgnoreCase("findTotalIncrementRatioWithScale")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findTotalIncrementRatioWithScale(
						(double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findTotalIncrementRatioWithScale");
		if(callFunctionKey.equalsIgnoreCase("findMeanIncrementRatioWithScale")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanIncrementRatioWithScale(
						(double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanIncrementRatioWithScale");
		if(callFunctionKey.equalsIgnoreCase("frequencyUpSplit")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.frequencyUpSplit(
						(double[])inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "frequencyUpSplit");
		if(callFunctionKey.equalsIgnoreCase("frequencyDownSplit")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.frequencyDownSplit(
						(double[])inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "frequencyDownSplit");
		if(callFunctionKey.equalsIgnoreCase("frequencyUpSplitWithScale")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.frequencyUpSplitWithScale(
						(double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "frequencyUpSplitWithScale");
		if(callFunctionKey.equalsIgnoreCase("frequencyDownSplitWithScale")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.frequencyDownSplitWithScale(
						(double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "frequencyDownSplitWithScale");



		if(callFunctionKey.equalsIgnoreCase("predictionResult")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.predictionResult((RatioMatrix)inputValues.get(传参因子[因子++])
						,(List<RatioMatrix>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "predictionResult");
		if(callFunctionKey.equalsIgnoreCase("predictionMatrixResult")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.predictionMatrixResult(
						(RatioMatrix)inputValues.get(传参因子[因子++])
						,(Map<String, RatioMatrix>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "predictionMatrixResult");
		if(callFunctionKey.equalsIgnoreCase("getImagePixClassificationMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getImagePixClassificationMap(
						(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getImagePixClassificationMap");
		if(callFunctionKey.equalsIgnoreCase("getVWaveFromImagePix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getVWaveFromImagePix(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getVWaveFromImagePix");
		if(callFunctionKey.equalsIgnoreCase("getHWaveFromImagePix")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getHWaveFromImagePix(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getHWaveFromImagePix");
		if(callFunctionKey.equalsIgnoreCase("getPixPercentByDeterPix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPixPercentByDeterPix(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPixPercentByDeterPix");
		if(callFunctionKey.equalsIgnoreCase("getClusterPercentByDeterPixGroup")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getClusterPercentByDeterPixGroup(
						(Map<Double,List<AMV_MVS_VSQ_2D>>)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getClusterPercentByDeterPixGroup");
		if(callFunctionKey.equalsIgnoreCase("getPixPercentByDeterPixGroup")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPixPercentByDeterPixGroup(
						(Map<Double,List<AMV_MVS_VSQ_2D>>)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPixPercentByDeterPixGroup");
		if(callFunctionKey.equalsIgnoreCase("filterFusion2DSetsWithCountScale")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterFusion2DSetsWithCountScale(
						(Map<Double,List<AMV_MVS_VSQ_2D>>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterFusion2DSetsWithCountScale");
		if(callFunctionKey.equalsIgnoreCase("filterFusion3DSetsWithCountScale")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterFusion3DSetsWithCountScale(
						(Map<Double,List<AMV_MVS_VSQ_3D>>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterFusion3DSetsWithCountScale");
		if(callFunctionKey.equalsIgnoreCase("filterPosition2DsWithScaledDistance")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterPosition2DsWithScaledDistance(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterPosition2DsWithScaledDistance");
		if(callFunctionKey.equalsIgnoreCase("filterPosition3DsWithScaledDistance")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterPosition3DsWithScaledDistance(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterPosition3DsWithScaledDistance");
		if(callFunctionKey.equalsIgnoreCase("filterPosition2DsWithScaledDistance")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterPosition2DsWithScaledDistance(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterPosition2DsWithScaledDistance");
		if(callFunctionKey.equalsIgnoreCase("filterPosition3DsWithScaledDistance")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterPosition3DsWithScaledDistance(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterPosition3DsWithScaledDistance");
		if(callFunctionKey.equalsIgnoreCase("getPercentListByOuterKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPercentListByOuterKey(
						(Double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPercentListByOuterKey");
		if(callFunctionKey.equalsIgnoreCase("getPercentArrayByOuterKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPercentArrayByOuterKey(
						(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPercentArrayByOuterKey");
		if(callFunctionKey.equalsIgnoreCase("getEachPercentSetOfArray")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getEachPercentSetOfArray(
						(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getEachPercentSetOfArray");
		if(callFunctionKey.equalsIgnoreCase("getPercentArrayByOuterKey")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPercentArrayByOuterKey(
						(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPercentArrayByOuterKey");
	}	
}
