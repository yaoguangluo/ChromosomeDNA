package SEM.register;

import SEM.bloom.StaticFunctionMapC_AOPM_C;
import SEM.bloom.StaticFunctionMapC_AOPM_E;

//����Ȩ��+ ����= ������
public class StaticRegisterC_AOPM_C {
	public static void load(StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		StaticFunctionMapC_AOPM_C.annotationMap.put("BootVPCSBackEnd", "app");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestIpFilter", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestLinkFilter", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_BlockList", "void");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestIpFix", "vPCSRequest:vPCSResponse");//��ʱ����Щ������ҪΨһ��������tinshell��ѯ���棬����������һ��
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestLinkFix", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestIpRecoder", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("requestLinkRecoder", "vPCSRequest:vPCSResponse");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IQ_ForwardType", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("forwardToRestMap", "socket");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_ServerInit_C_VPCSFrontEnd", "void");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_Server", "app");
		StaticFunctionMapC_AOPM_C.annotationMap.put("IV_Service", "jTextPane:ǰ�˽ӿ�Txt");
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
