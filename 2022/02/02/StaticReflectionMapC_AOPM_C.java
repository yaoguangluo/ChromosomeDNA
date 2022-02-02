package SEM.reflection;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import MS.VPC.SH.Sleeper_H;
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapC_AOPM_C;
import SEM.bloom.StaticFunctionMapC_AOPM_E;

//著作权人+ 作者= 罗瑶光
public class StaticReflectionMapC_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_C, Map<String, Object> output) throws Exception {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("BootVPCSBackEnd")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.BootVPCSBackEnd((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestIpFilter")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestIpFilter((Socket)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestLinkFilter")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestLinkFilter((Socket)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestIpFix")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestIpFix((Socket)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestLinkFix")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestLinkFix((Socket)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_BlockList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_BlockList();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("requestLinkRecoder")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.requestLinkRecoder((VPCSRequest)inputValues.get(传参因子[因子++]), (VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IQ_ForwardType")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IQ_ForwardType((Socket)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("forwardToRestMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.forwardToRestMap((Socket)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_ServerInit_C_VPCSFrontEnd")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_ServerInit_C_VPCSFrontEnd();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_Server")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_Server((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("IV_Service")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_Service((JTextPane)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_ServerServerInit_C")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IV_ServerServerInit_C((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("IQ_Response")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.IQ_Response((Socket)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("returnResponse")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.returnResponse((Socket)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("P_Rest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_Rest((VPCSRequest)inputValues.get(传参因子[因子++])
						, (VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("P_View")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_View((VPCSRequest)inputValues.get(传参因子[因子++])
						, (VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("P_Bytes")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_Bytes((VPCSRequest)inputValues.get(传参因子[因子++])
						, (VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("P_Buffer")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_Buffer((VPCSRequest)inputValues.get(传参因子[因子++])
						, (VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("P_BufferBytes")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_BufferBytes((VPCSRequest)inputValues.get(传参因子[因子++])
						, (VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("P_BytesWithoutZip")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.P_BytesWithoutZip((VPCSRequest)inputValues.get(传参因子[因子++])
						, (VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("hugPillow")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapC_AOPM_C.hugPillow((Sleeper_H)inputValues.get(传参因子[因子++])
						, (Socket)inputValues.get(传参因子[因子++]), (int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("forward")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapC_AOPM_C.forward((String)inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getFilePath")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapC_AOPM_C.getFilePath((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCode")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapC_AOPM_C.getCode((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}

	public static void load(StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapC_AOPM_C.annotationMap.put("BootVPCSBackEnd", "app");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestIpFilter", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestLinkFilter", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_BlockList", "void");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestIpFix", "vPCSRequest:vPCSResponse");//到时候这些传参名要唯一化，方便tinshell查询缓存，不能这样单一。
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestLinkFix", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestIpRecoder", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestLinkRecoder", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IQ_ForwardType", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("forwardToRestMap", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_ServerInit_C_VPCSFrontEnd", "void");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_Server", "app");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_Service", "jTextPane:前端接口Txt");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_ServerServerInit_C", "app");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IQ_Response", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("returnResponse", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_Rest", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_View", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_Bytes", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_Buffer", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_BufferBytes", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("P_BytesWithoutZip", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("hugPillow", " sleeper_H:accept:hashCode");
		StaticFunctionMapC_AOPM_C.annotationMap.put("forward", "string:data");
		StaticFunctionMapC_AOPM_C.annotationMap.put("getFilePath", "string");
		StaticFunctionMapC_AOPM_C.annotationMap.put("getCode", "filePath");
	}
}
