package SEM.reflection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTextPane;

import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapO_IDUQ_C;
import SEM.bloom.StaticFunctionMapO_IDUQ_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapO_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_C, Map<String, Object> output) throws IOException
	, UnsupportedAudioFileException, InterruptedException, CloneNotSupportedException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("U_")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				//java 虚拟机完全可以在 代入的时候将object 自动去匹配成传参类型的， 不能转就null 
				//，高斯林故意的 不写一个exception 处理模块。所以我就累。
				staticFunctionMapO_IDUQ_C.U_((String)inputValues.get(传参因子[因子++])
						, (LinkNode)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getRandomDNAkey")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_IDUQ_C.getRandomDNAkey(
						(SessionValidation)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("Save")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.Save((LinkNode)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("bootCell")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.bootCell((LinkNode)inputValues.get(传参因子[因子++])
						,(JTextPane)inputValues.get(传参因子[因子++])
						,(ThisCanvas)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("BootNeroDoc")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_IDUQ_C.BootNeroDoc((LinkList)inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (NodeShow) inputValues.get(传参因子[因子++])
						, (JTextPane) inputValues.get(传参因子[因子++]), (ThisCanvas) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("vpcsRegister")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.vpcsRegister((LinkList)inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (NodeShow) inputValues.get(传参因子[因子++])
						, (JTextPane) inputValues.get(传参因子[因子++]), (ThisCanvas) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("register")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.register((BootNeroDoc)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapO_IDUQ_C.annotationMap.put("U_", "fileCurrentpath:first");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("getRandomDNAkey", "sessionValidation:password");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("Save", "first");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("bootCell", "linkNode:rightBotJTextPane:canvas");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("BootNeroDoc", "first:fileCurrentpath:nodeView:rightBotJTextPane:canvas");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("vpcsRegister", "first:fileCurrentpath:nodeView:rightBotJTextPane:canvas");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("register", "bootNeroDoc");
	}
}
