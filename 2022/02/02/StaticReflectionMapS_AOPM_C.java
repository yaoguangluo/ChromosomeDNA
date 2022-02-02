package SEM.reflection;

import java.util.HashMap;
import java.util.Map;

import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapS_AOPM_C;
import SEM.bloom.StaticFunctionMapS_AOPM_E;

//����Ȩ��+ ����= ������
public class StaticReflectionMapS_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_C
			, Map<String, Object> output) throws Exception {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("DropCellPLSQL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.DropCellPLSQL((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DropCellORM")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.DropCellORM((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DeleteCellORM")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.DeleteCellORM((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++])
						, (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DeleteCellPLSQL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.DeleteCellPLSQL((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++])
						, (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("InsertCellORM")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.InsertCellORM((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++])
						, (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("InsertCellPLSQL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.InsertCellPLSQL((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++])
						, (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("UpdateCellORM")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.UpdateCellORM((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("UpdateCellORMByRowId")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.UpdateCellORMByRowId((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(boolean)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("UpdateCellORMByEquals")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.UpdateCellORMByEquals((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(boolean)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("UpdateCellPLSQL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.UpdateCellPLSQL((String)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("creatMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapS_AOPM_C.creatMap();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}

	public static void load(StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		StaticFunctionMapS_AOPM_C.annotationMap.put("DeleteCellORM", "rootPath:baseName:tabKey:rowCells:initonEncrypt");
		StaticFunctionMapS_AOPM_C.annotationMap.put("DeleteCellPLSQL", "rootPath:baseName:tabKey:rowCells:initonEncrypt");
		StaticFunctionMapS_AOPM_C.annotationMap.put("DropCellORM", "rootPath:baseName:tabKey");
		StaticFunctionMapS_AOPM_C.annotationMap.put("DropCellPLSQL", "rootPath:baseName:tabKey");
		StaticFunctionMapS_AOPM_C.annotationMap.put("InsertCellORM", "rootPath:baseName:tabKey:rowCells:initonEncrypt");
		StaticFunctionMapS_AOPM_C.annotationMap.put("InsertCellPLSQL", "rootPath:baseName:tabKey:rowCells:initonEncrypt");
		StaticFunctionMapS_AOPM_C.annotationMap.put("UpdateCellORM", "tabKey:rowId:cellName:cellValue");
		StaticFunctionMapS_AOPM_C.annotationMap.put("UpdateCellORMByRowId", "rootPath:baseName:unTest:tabKey:rowId:cellName:cellValue");
		StaticFunctionMapS_AOPM_C.annotationMap.put("UpdateCellORMByEquals"
				, "rootPath:baseName:unTest:tabKey:conditionSubject:conditionObject:cellName:cellValue");
		StaticFunctionMapS_AOPM_C.annotationMap.put("UpdateCellPLSQL", "tabKey:rowId:cellName:cellValue");
		StaticFunctionMapS_AOPM_C.annotationMap.put("creatMap", "void");

	}
}
