package SEM.register;

import SEM.bloom.StaticFunctionMapP_IDUQ_C;
import SEM.bloom.StaticFunctionMapP_IDUQ_E;

//����Ȩ��+ ����= ������
public class StaticRegisterP_IDUQ_C {
	public static void load(StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ

		StaticFunctionMapP_IDUQ_C.annotationMap.put("copy", "dna");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("copyMap", "functionLineDeque");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("mask", "originDeque:newDeque:maskOutput");
		StaticFunctionMapP_IDUQ_C.annotationMap.put("copy", "maskLineDeque");

		StaticFunctionMapP_IDUQ_C.annotationMap.put("mutationCopy", "dna");	
		StaticFunctionMapP_IDUQ_C.annotationMap.put("dating", "father:mother");	
		StaticFunctionMapP_IDUQ_C.annotationMap.put("inheritance", "father:mother");	
		StaticFunctionMapP_IDUQ_C.annotationMap.put("born", "void");	
		StaticFunctionMapP_IDUQ_C.annotationMap.put("mutation", "father:mother");	
		StaticFunctionMapP_IDUQ_C.annotationMap.put("separater", "original");	
		StaticFunctionMapP_IDUQ_C.annotationMap.put("swap", "original");	
	}
}
