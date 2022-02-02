package SEM.reflection;

import java.io.BufferedReader;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapO_VECS_C;
import SEM.bloom.StaticFunctionMapO_VECS_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapO_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_C
			, Map<String, Object> output) throws Exception {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("SortStringDemo")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.SortStringDemo();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("transactionLogin")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.transactionLogin((String)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("transactionRegister")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.transactionRegister((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("aCommonReadWay")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.aCommonReadWay((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("readDBInTXTWay")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.readDBInTXTWay((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("readDBInBaseWay")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.readDBInBaseWay((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("readDBInWebWay")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.readDBInWebWay((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("PLSQLSectionPanel")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.PLSQLSectionPanel((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("VPCSRestPanel")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.VPCSRestPanel((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("YouBiaoSectionPanel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.YouBiaoSectionPanel((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("PL_XA_C")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.PL_XA_C();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinCondition")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinCondition(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinAggregation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinAggregation(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinGetCulumns")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinGetCulumns(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinRelation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinRelation(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestCondition")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestCondition(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestAggregation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestAggregation(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestGetCulumns")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestGetCulumns(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestRelation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestRelation(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttribute")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttribute(
						(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Object)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("XA_ShellQ_Rows_E_main")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.XA_ShellQ_Rows_E_main((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByTablePath")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByTablePath(
						(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfCondition")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfCondition(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfAggregation")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfAggregation(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfGetCulumns")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfGetCulumns(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfPLETL")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfPLETL(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfPLTCP")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfPLTCP(
						(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTable")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTable(
						(String)inputValues.get(传参因子[因子++]),(JTable)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getNewSearchShellTableSpecFromDefaultTableModel")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getNewSearchShellTableSpecFromDefaultTableModel(
						(DefaultTableModel)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getNewSearchShellTableDataFromDefaultTableModel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getNewSearchShellTableDataFromDefaultTableModel(
						(DefaultTableModel)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getNewSearchShellTableRowsFromDefaultTableModel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getNewSearchShellTableRowsFromDefaultTableModel(
						(Object[])inputValues.get(传参因子[因子++])
						,(DefaultTableModel)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTable")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTable(
						(String)inputValues.get(传参因子[因子++]), (JTable)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTableWithObjectData")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTableWithObjectData(
						(String)inputValues.get(传参因子[因子++])
						, (DefaultTableModel)inputValues.get(传参因子[因子++])
						, (Object[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTable")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTable(
						(String)inputValues.get(传参因子[因子++]), (JTable)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTableWithObjectDataReflectionDBRows")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTableWithObjectDataReflectionDBRows(
						(String)inputValues.get(传参因子[因子++])
						, (DefaultTableModel)inputValues.get(传参因子[因子++])
						, (Object[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTableReflectionDBRows")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTableReflectionDBRows(
						(String)inputValues.get(传参因子[因子++])
						, (Row[])inputValues.get(传参因子[因子++])
						, (Object[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addInitSearchShellTable")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addInitSearchShellTable((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("doNeroFlow")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.doNeroFlow((JTextPane) inputValues.get(传参因子[因子++])
						, (NodeShow) inputValues.get(传参因子[因子++])
						, (LinkList) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (HashMap<String, Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("ReadChinese")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.ReadChinese((App)inputValues.get(传参因子[因子++])
						,(A)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("kernel")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.kernel((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackZY")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackZY(
						(App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackXY")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackXY(
						(App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}

		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackZT")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackZT(
						(App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackXT")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackXT(
						(App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackYT")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackYT(
						(App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedback")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedback(
						(App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("doSearch")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.doSearch((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardDB")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardDB((App)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardVPC")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardVPC((App)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardVPCBackEnd")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardVPCBackEnd((EmotionMap)inputValues.get(传参因子[因子++])
						, (CogsBinaryForest_AE)inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardVPCYangliaojing")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardVPCYangliaojing((App)inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getCode")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getCode((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getFilePath")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getFilePath((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("E_pl_XA")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.E_pl_XA((String)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++])
						, (Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("E_pl_XA")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.E_pl_XA((String)inputValues.get(传参因子[因子++])
						, (boolean)inputValues.get(传参因子[因子++])
						, (Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_AggregationLimitMap")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_AggregationLimitMap((String[])inputValues.get(传参因子[因子++])
						, (List<Map<String, Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_PletlLimitMap")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_PletlLimitMap((String[])inputValues.get(传参因子[因子++])
						, (List<Map<String, Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_PltcpLimitMap")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_PltcpLimitMap((String[])inputValues.get(传参因子[因子++])
						, (List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						, (Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Cache")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Cache((String[])inputValues.get(传参因子[因子++])
						, (List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++])
						, (Map<String, Object>)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_kernel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_kernel((String) inputValues.get(传参因子[因子++])
						, (File) inputValues.get(传参因子[因子++])
						, (File) inputValues.get(传参因子[因子++])
						, (BufferedReader) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (List<Map<String, Object>>) inputValues.get(传参因子[因子++])
						, (Row) inputValues.get(传参因子[因子++])
						, (Map<String, Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_kernel_search")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_kernel_search((String) inputValues.get(传参因子[因子++])
						, (File) inputValues.get(传参因子[因子++])
						, (int) inputValues.get(传参因子[因子++])
						, (Object[]) inputValues.get(传参因子[因子++])
						, (Object[][]) inputValues.get(传参因子[因子++])
						, (List<Map<String, Object>>) inputValues.get(传参因子[因子++])
						, (Row) inputValues.get(传参因子[因子++])
						, (Map<String, Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("rowToRowMap")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.rowToRowMap((Row)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("rowMapToRow")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.rowMapToRow((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Map")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Map((String[]) inputValues.get(传参因子[因子++])
						, (List<Map<String, Object>>) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (Map<String, Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMapWithAs")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getCulumnsMapWithAs((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMap")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getCulumnsMap((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_AndMap")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_AndMap((String[])inputValues.get(传参因子[因子++])
						,(List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						,(List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++])
						,(List<Map<String, Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_OrMap")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_OrMap((String[])inputValues.get(传参因子[因子++])
						,(List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						,(List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++])
						,(List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						,(Map<String, Boolean>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_SetRoot")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_SetRoot((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_BaseName")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_BaseName((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_TableName")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_TableName((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_ListNeedStart")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_ListNeedStart((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Join")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Join((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_E")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_E((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Check")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Check((String)inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_StoreValues")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_StoreValues((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_fileOperations")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_fileOperations((String[])inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceString")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceString((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileName")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileName((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++])
						,(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("start")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.start();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileName")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileName((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++])
						,(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileType")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileType((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileSize")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileSize((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileLines")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileLines((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++])
						,(long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("mainShellReplace")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.mainShellReplace((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithLogRecording")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithLogRecording(
						(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
	}

	public static void load(StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_E) {	
		//稍后封装
		StaticFunctionMapO_VECS_C.annotationMap.put("SortStringDemo", "void");
		StaticFunctionMapO_VECS_C.annotationMap.put("transactionLogin", "uEmail:uPassword");
		StaticFunctionMapO_VECS_C.annotationMap.put("transactionRegister", "uEmail:uEmailEnsure:uName:uPassword:uPassWDEnsure:uAddress:uPhone:uWeChat:uQq:uAge:uSex");
		StaticFunctionMapO_VECS_C.annotationMap.put("aCommonReadWay", "app");
		StaticFunctionMapO_VECS_C.annotationMap.put("readDBInTXTWay", "app");
		StaticFunctionMapO_VECS_C.annotationMap.put("readDBInBaseWay", "app");
		StaticFunctionMapO_VECS_C.annotationMap.put("readDBInWebWay", "app");
		StaticFunctionMapO_VECS_C.annotationMap.put("PLSQLSectionPanel", "app");
		StaticFunctionMapO_VECS_C.annotationMap.put("VPCSRestPanel", "app");
		StaticFunctionMapO_VECS_C.annotationMap.put("YouBiaoSectionPanel", "app");
		StaticFunctionMapO_VECS_C.annotationMap.put("PL_XA_C", "void");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfJoinCondition", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfJoinAggregation", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfJoinGetCulumns", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfJoinRelation", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfNestCondition", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfNestAggregation", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfNestGetCulumns", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfNestRelation", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttribute", "currentDB:tableName:culmnName:value");
		StaticFunctionMapO_VECS_C.annotationMap.put("XA_ShellQ_Rows_E_main", "args");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByTablePath", "tablePath:pageBegin:pageEnd:direction");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfCondition", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfAggregation", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfGetCulumns", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfPLETL", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("selectRowsByAttributesOfPLTCP", "object");
		StaticFunctionMapO_VECS_C.annotationMap.put("addNewSearchShellTable", "tableName:jtable");
		StaticFunctionMapO_VECS_C.annotationMap.put("getNewSearchShellTableSpecFromDefaultTableModel", "defaultTableModel");
		StaticFunctionMapO_VECS_C.annotationMap.put("getNewSearchShellTableDataFromDefaultTableModel", "defaultTableModel");
		StaticFunctionMapO_VECS_C.annotationMap.put("getNewSearchShellTableRowsFromDefaultTableModel", "spec:defaultTableModel");
		
		StaticFunctionMapO_VECS_C.annotationMap.put("addNewSearchShellTable", "tableName:defaultTableModel");
		StaticFunctionMapO_VECS_C.annotationMap.put("addNewSearchShellTableWithObjectData", "tableName:defaultTableModel:defaultTableData");
		StaticFunctionMapO_VECS_C.annotationMap.put("addNewSearchShellTable", "tableName:defaultTableData:defaultTableDataSpec");
		StaticFunctionMapO_VECS_C.annotationMap.put("addNewSearchShellTableWithObjectDataReflectionDBRows", "tableName:defaultTableModel:defaultTableData");
		StaticFunctionMapO_VECS_C.annotationMap.put("addNewSearchShellTableReflectionDBRows", "tableName:rows:defaultTableDataSpec");
		StaticFunctionMapO_VECS_C.annotationMap.put("addInitSearchShellTable", "app");
		StaticFunctionMapO_VECS_C.annotationMap.put("doNeroFlow", "rightBotJTextPane:nodeView:first:documentFlowAddress:inputMap");
		StaticFunctionMapO_VECS_C.annotationMap.put("ReadChinese", "app:_A");
		StaticFunctionMapO_VECS_C.annotationMap.put("kernel", "app:string");
		StaticFunctionMapO_VECS_C.annotationMap.put("getMedicineBookFeedbackZY", "app:string");
		StaticFunctionMapO_VECS_C.annotationMap.put("getMedicineBookFeedbackXY", "app:string");

		StaticFunctionMapO_VECS_C.annotationMap.put("getMedicineBookFeedbackZT", "app:string");
		StaticFunctionMapO_VECS_C.annotationMap.put("getMedicineBookFeedbackXT", "app:string");
		StaticFunctionMapO_VECS_C.annotationMap.put("getMedicineBookFeedbackYT", "app:string");
		StaticFunctionMapO_VECS_C.annotationMap.put("getMedicineBookFeedback", "app:string");
		StaticFunctionMapO_VECS_C.annotationMap.put("doSearch", "app:string");
		StaticFunctionMapO_VECS_C.annotationMap.put("forwardDB", "app:string:data");
		StaticFunctionMapO_VECS_C.annotationMap.put("forwardVPC", "app:string:data");
		StaticFunctionMapO_VECS_C.annotationMap.put("forwardVPCBackEnd", "emotionMap:_A:string:data");
		StaticFunctionMapO_VECS_C.annotationMap.put("forwardVPCYangliaojing", "app:string:data");
		StaticFunctionMapO_VECS_C.annotationMap.put("getCode", "filePath");
		StaticFunctionMapO_VECS_C.annotationMap.put("getFilePath", "string");
		StaticFunctionMapO_VECS_C.annotationMap.put("E_pl_XA", "plSearch:mod:output");
		StaticFunctionMapO_VECS_C.annotationMap.put("E_pl_XA", "orm:b:output");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_AggregationLimitMap", "sets:output");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_PletlLimitMap", "sets:obj");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_PltcpLimitMap", "sets:output:object");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_Cache", "sets:output:tableName:object:condition");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_kernel"
				, "temp:readDBTableRowIndexCulumnFile:readDBTableRowIndexFile:reader:DBTableRowIndexPath:output:bufferRow:rowMap");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_kernel_search"
				, "temp:readDBTableRowIndexFile:rowId:huaRuiJiJtableCulumns:huaRuiJiJtable:output;bufferRow;rowMap");
		StaticFunctionMapO_VECS_C.annotationMap.put("rowToRowMap", "row");
		StaticFunctionMapO_VECS_C.annotationMap.put("rowMapToRow", "map");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_Map", "sets:output:tableName:object");
		StaticFunctionMapO_VECS_C.annotationMap.put("getCulumnsMapWithAs", "sets:row");
		StaticFunctionMapO_VECS_C.annotationMap.put("getCulumnsMap", "sets:row");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_getCulumnsMap", "obj:getCulumnsValueArray");
		
		StaticFunctionMapO_VECS_C.annotationMap.put("P_AndMap", "sets:obj:joinObj:object:newObj");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_OrMap", "sets:obj:joinObj:object:newObj:findinNewObj");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_SetRoot", "acknowledge:output");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_BaseName", "acknowledge:output");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_TableName", "acknowledge:output");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_ListNeedStart", "acknowledge:output");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_Join", "acknowledge:output");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_E", "acknowledge:output:mod");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_Check", "acknowledge:output:mod");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_StoreValues", "acknowledge:output");
		StaticFunctionMapO_VECS_C.annotationMap.put("P_fileOperations", "P_fileOperations");
		StaticFunctionMapO_VECS_C.annotationMap.put("replaceString", "fileDirectroyPath:searchString:needReplaceString");
		StaticFunctionMapO_VECS_C.annotationMap.put("replaceStringWithFileName", "fileDirectroyPath:searchString:conditions");
		StaticFunctionMapO_VECS_C.annotationMap.put("start", "void");
		StaticFunctionMapO_VECS_C.annotationMap.put("replaceStringWithFileName", "fileDirectroyPath:searchString:needReplaceString:fileName");
		StaticFunctionMapO_VECS_C.annotationMap.put("replaceStringWithFileType", "fileDirectroyPath:searchString:needReplaceString:fileName");
		StaticFunctionMapO_VECS_C.annotationMap.put("replaceStringWithFileSize", "fileDirectroyPath:searchString:needReplaceString:fileName");
		StaticFunctionMapO_VECS_C.annotationMap.put("replaceStringWithFileLines", "fileDirectroyPath:searchString:needReplaceString:beginLine:endLine");
		StaticFunctionMapO_VECS_C.annotationMap.put("mainShellReplace", "argv");
		StaticFunctionMapO_VECS_C.annotationMap.put("replaceStringWithLogRecording", "conditions");
	}
}
