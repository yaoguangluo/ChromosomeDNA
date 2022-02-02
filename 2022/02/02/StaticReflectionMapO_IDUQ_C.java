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

//����Ȩ��+ ����= ������
public class StaticReflectionMapO_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_C, Map<String, Object> output) throws IOException
	, UnsupportedAudioFileException, InterruptedException, CloneNotSupportedException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("U_")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				//java �������ȫ������ �����ʱ��object �Զ�ȥƥ��ɴ������͵ģ� ����ת��null 
				//����˹�ֹ���� ��дһ��exception ����ģ�顣�����Ҿ��ۡ�
				staticFunctionMapO_IDUQ_C.U_((String)inputValues.get(��������[����++])
						, (LinkNode)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getRandomDNAkey")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_IDUQ_C.getRandomDNAkey(
						(SessionValidation)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("Save")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.Save((LinkNode)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("bootCell")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.bootCell((LinkNode)inputValues.get(��������[����++])
						,(JTextPane)inputValues.get(��������[����++])
						,(ThisCanvas)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("BootNeroDoc")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_IDUQ_C.BootNeroDoc((LinkList)inputValues.get(��������[����++])
						, (String) inputValues.get(��������[����++])
						, (NodeShow) inputValues.get(��������[����++])
						, (JTextPane) inputValues.get(��������[����++]), (ThisCanvas) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("vpcsRegister")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.vpcsRegister((LinkList)inputValues.get(��������[����++])
						, (String) inputValues.get(��������[����++])
						, (NodeShow) inputValues.get(��������[����++])
						, (JTextPane) inputValues.get(��������[����++]), (ThisCanvas) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("register")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.register((BootNeroDoc)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		StaticFunctionMapO_IDUQ_C.annotationMap.put("U_", "fileCurrentpath:first");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("getRandomDNAkey", "sessionValidation:password");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("Save", "first");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("bootCell", "linkNode:rightBotJTextPane:canvas");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("BootNeroDoc", "first:fileCurrentpath:nodeView:rightBotJTextPane:canvas");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("vpcsRegister", "first:fileCurrentpath:nodeView:rightBotJTextPane:canvas");
		StaticFunctionMapO_IDUQ_C.annotationMap.put("register", "bootNeroDoc");
	}
}
