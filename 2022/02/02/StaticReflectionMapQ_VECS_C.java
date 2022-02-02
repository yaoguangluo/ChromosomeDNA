package SEM.reflection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
import SEM.bloom.StaticFunctionMap;
import SEM.bloom.StaticFunctionMapQ_VECS_C;
import SEM.bloom.StaticFunctionMapQ_VECS_E;

//����Ȩ��+ ����= ������
public class StaticReflectionMapQ_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C
			, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("searchFromTable")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapQ_VECS_C.searchFromTable((String) inputValues.get(��������[����++])
						, (DefaultTableModel) inputValues.get(��������[����++])
						, (Object[][]) inputValues.get(��������[����++])
						, (ArrayList<String>) inputValues.get(��������[����++])
						, (Map<String, String>) inputValues.get(��������[����++])
						, (App) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("searchFromTablewithScale")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapQ_VECS_C.searchFromTablewithScale((String) inputValues.get(��������[����++])
						, (ArrayList<String>) inputValues.get(��������[����++])
						, (Map<String, String>) inputValues.get(��������[����++])
						, (double) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		StaticFunctionMapQ_VECS_C.annotationMap.put("searchFromTable", "newTableModel:tableData_old:copy_xj:dic_xj:app");
		StaticFunctionMapQ_VECS_C.annotationMap.put("searchFromTablewithScale", "key:����:����:lookrot");
	}
}
