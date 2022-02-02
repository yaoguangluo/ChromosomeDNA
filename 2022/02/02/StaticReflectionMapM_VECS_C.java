package SEM.reflection;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ME.APM.VSQ.App;
import MVQ.label.DetaLabel;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OSI.AOP.MEC.SIQ.plorm.PLORM_C;
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse;
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapM_VECS_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapM_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_C, Map<String, Object> output) throws Exception {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinCondition(
						(Map<String,Object>)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinAggregation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinAggregation(
						(Map<String,Object>)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinGetCulumns")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinGetCulumns(
						(Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinRelation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinRelation(
						(Map<String,Object>)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "updateRowsByAttributesOfJoinRelation");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinCondition(
						(Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  

		}//, "selectRowsByAttributesOfJoinCondition");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinAggregation")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinAggregation(
						(Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "selectRowsByAttributesOfJoinAggregation");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinGetCulumns")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinGetCulumns(
						(Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "selectRowsByAttributesOfJoinGetCulumns");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinRelation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinRelation(
						(Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "selectRowsByAttributesOfJoinRelation");
		if(callFunctionKey.equalsIgnoreCase("insertRowByTablePathAndIndex")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.insertRowByTablePathAndIndex(
						(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(JSONObject)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "insertRowByTablePathAndIndex");
		if(callFunctionKey.equalsIgnoreCase("insertRowByBaseName")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.insertRowByBaseName((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(JSONObject)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "insertRowByBaseName");
		if(callFunctionKey.equalsIgnoreCase("IU_RowByAttributes")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.IU_RowByAttributes((Map<String,Object>)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "IU_RowByAttributes");
		if(callFunctionKey.equalsIgnoreCase("I_Table")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.I_Table((Map<String,Object>)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "I_Table");
		if(callFunctionKey.equalsIgnoreCase("deleteRowByTablePathAndIndex")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.deleteRowByTablePathAndIndex(
						(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "deleteRowByTablePathAndIndex");
		if(callFunctionKey.equalsIgnoreCase("D_RowByAttributesOfCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.D_RowByAttributesOfCondition(
						(Map<String,Object>)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "D_RowByAttributesOfCondition");
		if(callFunctionKey.equalsIgnoreCase("updateRowByTablePathAndIndex")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowByTablePathAndIndex(
						(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(JSONObject)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowByTablePathAndIndex");
		if(callFunctionKey.equalsIgnoreCase("updateRowByTablePathAndAttribute")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowByTablePathAndAttribute(
						(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(JSONObject)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowByTablePathAndAttribute");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByRecordConditions")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByRecordConditions(
						(Map<String,Object>)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByRecordConditions");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfCondition(
						(Map<String,Object>)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByAttributesOfCondition");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfAggregation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfAggregation(
						(Map<String,Object>)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByAttributesOfAggregation");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfGetCulumns")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfGetCulumns(
						(Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByAttributesOfGetCulumns");
		if(callFunctionKey.equalsIgnoreCase("E_PLSQL")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.E_PLSQL((String)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "E_PLSQL");
		if(callFunctionKey.equalsIgnoreCase("E_PLORM")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.E_PLORM((PLORM_C)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "E_PLORM");
		if(callFunctionKey.equalsIgnoreCase("P_AggregationLimitMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_AggregationLimitMap((String[])inputValues.get(传参因子[因子++])
						,(List<Map<String,Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_AggregationLimitMap");
		if(callFunctionKey.equalsIgnoreCase("P_Cache")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Cache((String[])inputValues.get(传参因子[因子++])
						,(List<Map<String,Object>>)inputValues.get(传参因子[因子++]),
						(String) inputValues.get(传参因子[因子++]), (String) inputValues.get(传参因子[因子++])
						, (Map<String,Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Cache");
		if(callFunctionKey.equalsIgnoreCase("P_kernel")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_kernel((String)inputValues.get(传参因子[因子++])
						, (File) inputValues.get(传参因子[因子++]), (File) inputValues.get(传参因子[因子++])
						, (BufferedReader) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>) inputValues.get(传参因子[因子++])
						, (Row) inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_kernel");
		if(callFunctionKey.equalsIgnoreCase("rowToRowMap")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.rowToRowMap((Row)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "rowToRowMap");
		if(callFunctionKey.equalsIgnoreCase("P_Map")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Map((String[])inputValues.get(传参因子[因子++]),
						(List<Map<String,Object>>)inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Map");
		if(callFunctionKey.equalsIgnoreCase("P_Table")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Table((String[])inputValues.get(传参因子[因子++]),
						(List<Map<String,Object>>)inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Table");
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMapWithAs")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getCulumnsMapWithAs(
						(String[])inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getCulumnsMapWithAs");
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getCulumnsMap((String[])inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getCulumnsMap");
		if(callFunctionKey.equalsIgnoreCase("P_GetCulumnsMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.P_GetCulumnsMap(
						(List<Map<String,Object>>)inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_GetCulumnsMap");
		if(callFunctionKey.equalsIgnoreCase("P_AndMap")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_AndMap((String[])inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>)inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>)inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_AndMap");
		if(callFunctionKey.equalsIgnoreCase("P_OrMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_OrMap((String[]) inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>) inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>) inputValues.get(传参因子[因子++])
						, (Map<String,Object>) inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>) inputValues.get(传参因子[因子++])
						, (Map<String,Boolean>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_OrMap");
		if(callFunctionKey.equalsIgnoreCase("P_SetRoot")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_SetRoot((String[])inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_SetRoot");
		if(callFunctionKey.equalsIgnoreCase("P_BaseName")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_BaseName((String[])inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_BaseName");
		if(callFunctionKey.equalsIgnoreCase("P_TableName")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_TableName((String[])inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_TableName");
		if(callFunctionKey.equalsIgnoreCase("P_ListNeedStart")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_ListNeedStart((String[])inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_ListNeedStart");
		if(callFunctionKey.equalsIgnoreCase("P_Join")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Join((String[])inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Join");
		if(callFunctionKey.equalsIgnoreCase("P_E")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_E((String[])inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_E");
		if(callFunctionKey.equalsIgnoreCase("P_Check")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Check((String)inputValues.get(传参因子[因子++])
						,(Map<String,Object>)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Check");
		if(callFunctionKey.equalsIgnoreCase("wordsForestNotContainsKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.wordsForestNotContainsKey(
						(Map<String,WordFrequency>)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++])
						, (StringBuilder[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "wordsForestNotContainsKey");
		if(callFunctionKey.equalsIgnoreCase("prefixWordEqualZero")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.prefixWordEqualZero(
						(Map<String,WordFrequency>) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (StringBuilder[]) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "prefixWordEqualZero");
		if(callFunctionKey.equalsIgnoreCase("wordsForestContainsKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.wordsForestContainsKey(
						(Map<String,WordFrequency>) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (StringBuilder[]) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "wordsForestContainsKey");
		if(callFunctionKey.equalsIgnoreCase("WordFrequencyFindCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.WordFrequencyFindCheck(
						(Map<String,WordFrequency>) inputValues.get(传参因子[因子++])
						, (StringBuilder[]) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "WordFrequencyFindCheck");
		if(callFunctionKey.equalsIgnoreCase("WordFrequencyCompareCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.WordFrequencyCompareCheck(
						(Map<String,WordFrequency>) inputValues.get(传参因子[因子++])
						, (StringBuilder[]) inputValues.get(传参因子[因子++])
						,(String) inputValues.get(传参因子[因子++])); 
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "WordFrequencyCompareCheck");
		if(callFunctionKey.equalsIgnoreCase("sessionCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionCheck((Token)inputValues.get(传参因子[因子++])
						,(TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionCheck");
		if(callFunctionKey.equalsIgnoreCase("sessionTokenUpdateByDNA")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionTokenUpdateByDNA((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionTokenUpdateByDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionTokenCertsInitWithHumanWordsByDNA")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionTokenCertsInitWithHumanWordsByDNA(
						(String)inputValues.get(传参因子[因子++]),(boolean)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionTokenCertsInitWithHumanWordsByDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionTokenCertsInitWithHumanWordsByDNA_ETL")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionTokenCertsInitWithHumanWordsByDNA_ETL(
						(String)inputValues.get(传参因子[因子++]),(boolean)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionTokenCertsInitWithHumanWordsByDNA_ETL");
		if(callFunctionKey.equalsIgnoreCase("sessionInitByTokenPDICertsDNA")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionInitByTokenPDICertsDNA(
						(TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionInitByTokenPDICertsDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionInitByTokenCertsDNA")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionInitByTokenCertsDNA(
						(TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionInitByTokenCertsDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionCheckWithOrderPDSKey")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionCheckWithOrderPDSKey(
						(Token)inputValues.get(传参因子[因子++]),(TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionCheckWithOrderPDSKey");
		if(callFunctionKey.equalsIgnoreCase("sessionCheckWithPostPDSKey")){    
			//这接口惹毛我了，有时间我会写个文本阅读函数，智能替换字符串。
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionCheckWithPostPDSKey(
						(Token)inputValues.get(传参因子[因子++]),(TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionCheckWithPostPDSKey");
		if(callFunctionKey.equalsIgnoreCase("arrayIntCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayIntCheck((int[])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayIntCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayIntFix")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayIntFix((int[])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayIntFix");
		if(callFunctionKey.equalsIgnoreCase("arrayLongCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayLongCheck((long[])inputValues.get(传参因子[因子++])
						,(long)inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayLongCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayLongFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayLongFix((long[])inputValues.get(传参因子[因子++])
						,(long)inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayLongFix");
		if(callFunctionKey.equalsIgnoreCase("arrayDoubleCheck")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayDoubleCheck((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayDoubleCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayDoubleFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayDoubleFix((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayDoubleFix");
		if(callFunctionKey.equalsIgnoreCase("arrayFloatCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayFloatCheck((float[])inputValues.get(传参因子[因子++])
						,(float)inputValues.get(传参因子[因子++]),(float)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayFloatCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayFloatFix")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayFloatFix((float[])inputValues.get(传参因子[因子++])
						,(float)inputValues.get(传参因子[因子++]),(float)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayFloatFix");
		if(callFunctionKey.equalsIgnoreCase("currentSystemTimeCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.currentSystemTimeCheck((long)inputValues.get(传参因子[因子++])
						, (long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "currentSystemTimeCheck");
		if(callFunctionKey.equalsIgnoreCase("currentSystemTimeToUTC")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.currentSystemTimeToUTC((long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "currentSystemTimeToUTC");
		if(callFunctionKey.equalsIgnoreCase("getTranslator")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getTranslator();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getTranslator");
		if(callFunctionKey.equalsIgnoreCase("ListSetsCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.ListSetsCheck((List<Object>)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "ListSetsCheck");
		if(callFunctionKey.equalsIgnoreCase("ListSetsFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.ListSetsFix((List<Object>)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "ListSetsFix");
		if(callFunctionKey.equalsIgnoreCase("matrixCheck")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.matrixCheck((Object[][])inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "matrixCheck");
		if(callFunctionKey.equalsIgnoreCase("matrixFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.matrixFix((Object[][])inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "matrixFix");
		if(callFunctionKey.equalsIgnoreCase("checkNULL")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.checkNULL((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "checkNULL");
		if(callFunctionKey.equalsIgnoreCase("getCfxButton")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getCfxButton((String)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getCfxButton");
		if(callFunctionKey.equalsIgnoreCase("DetaButton")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaButton((String)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaButton");
		if(callFunctionKey.equalsIgnoreCase("YLJShowButton")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.YLJShowButton((String)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "YLJShowButton");
		if(callFunctionKey.equalsIgnoreCase("DetaIndexLabel")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaIndexLabel((String)inputValues.get(传参因子[因子++])
						,(List<DetaLabel>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaIndexLabel");
		if(callFunctionKey.equalsIgnoreCase("DetaLabel")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaLabel((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaLabel");
		if(callFunctionKey.equalsIgnoreCase("DetaSlider")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaSlider((int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaSlider");
		if(callFunctionKey.equalsIgnoreCase("DetabbedPane")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetabbedPane((int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetabbedPane");
		if(callFunctionKey.equalsIgnoreCase("getColorTableRender")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getColorTableRender();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getColorTableRender");
		if(callFunctionKey.equalsIgnoreCase("CfxTextArea")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.CfxTextArea((String)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "CfxTextArea");
		if(callFunctionKey.equalsIgnoreCase("CfxTextField")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.CfxTextField((String)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "CfxTextField");
		if(callFunctionKey.equalsIgnoreCase("CfxTextPane")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.CfxTextPane((String)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "CfxTextPane");
		if(callFunctionKey.equalsIgnoreCase("forwardToRestMap")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.forwardToRestMap((App)inputValues.get(传参因子[因子++])
						,(VPCSRequest)inputValues.get(传参因子[因子++])
						,(VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "forwardToRestMap");
		if(callFunctionKey.equalsIgnoreCase("P_Rest")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Rest((App)inputValues.get(传参因子[因子++])
						,(VPCSRequest)inputValues.get(传参因子[因子++])
						,(VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Rest");
		if(callFunctionKey.equalsIgnoreCase("P_RestDB")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_RestDB((App)inputValues.get(传参因子[因子++])
						,(VPCSRequest)inputValues.get(传参因子[因子++])
						,(VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_RestDB");
		if(callFunctionKey.equalsIgnoreCase("P")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P((String[]) inputValues.get(传参因子[因子++])
						, (Socket) inputValues.get(传参因子[因子++])
						,(CogsBinaryForest_AE) inputValues.get(传参因子[因子++])
						, (EmotionMap) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P");
	}
}
