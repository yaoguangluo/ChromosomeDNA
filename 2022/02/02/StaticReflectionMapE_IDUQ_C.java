package SEM.reflection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapE_IDUQ_C;
import SEM.bloom.StaticFunctionMapE_IDUQ_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapE_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_C, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getNodeInfo")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getNodeInfo();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getNodeProject")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getNodeProject();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCheckRange")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getCheckRange();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getChooseCheck")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getChooseCheck();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDrawArrow")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDrawArrow();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDynamicLine_U")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDynamicLine_U();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getU_RelatedLine")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getU_RelatedLine();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getU_RelatedLine")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getU_RelatedLine();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getLinkOSGI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getLinkOSGI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getNodeOSGI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getNodeOSGI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C._OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C._OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("_OSU_AVQ_ASQ_OPE_OPC_ECI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C._OSU_AVQ_ASQ_OPE_OPC_ECI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornJSplitPane")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornJSplitPane();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornSplitPaneUI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornSplitPaneUI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornScrollBarUI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornScrollBarUI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornTreeCellRenderer")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornTreeCellRenderer();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornTreeUI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornTreeUI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCacuString")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getCacuString();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornSplitPaneUI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornSplitPaneUI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCheckRangeVPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getCheckRangeVPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getChooseQ_VPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getChooseQ_VPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDrawArrowVPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDrawArrowVPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDrawFlashSide")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDrawFlashSide();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDrawSinLineVPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDrawSinLineVPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDynamicLineU_VPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDynamicLineU_VPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getLinkList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getLinkList();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getLinkNode")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getLinkNode();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getSort")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getSort();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getU_RelatedLineVPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getU_RelatedLineVPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getOSGI_chansfer")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getOSGI_chansfer((LinkNode)inputValues.get(传参因子[因子++])
						, (LinkNode)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C._OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(
						(Object[][])inputValues.get(传参因子[因子++])
						, (JTextPane)inputValues.get(传参因子[因子++]), (App)inputValues.get(传参因子[因子++])
						, (A)inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getNodeInfo", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getNodeProject", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getCheckRange", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getChooseCheck", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDrawArrow", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDynamicLine_U", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getU_RelatedLine", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getLinkOSGI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getNodeOSGI", "void");//之后变量名通通都会进行元基肽化
		StaticFunctionMapE_IDUQ_C.annotationMap.put("_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("_OSU_AVQ_ASQ_OPE_OPC_ECI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornJSplitPane", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornScrollBarUI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornSplitPaneUI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornTreeCellRenderer", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getUnicornTreeUI", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getCacuString", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getNodeShow", "gUISample:tableData_old:text:popupMenu:app:_A:pos");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getCheckRangeVPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getChooseQ_VPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDrawArrowVPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDrawFlashSide", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDrawSinLineVPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getDynamicLineU_VPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getLinkList", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getLinkNode", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getSort", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getU_RelatedLineVPS", "void");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("getOSGI_chansfer", "node:first");
		StaticFunctionMapE_IDUQ_C.annotationMap.put("_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register", "tableData_old:text:app:_A:pos");
	}
}
