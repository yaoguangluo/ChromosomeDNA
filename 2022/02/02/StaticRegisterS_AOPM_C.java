package SEM.register;

import SEM.bloom.StaticFunctionMapS_AOPM_C;
import SEM.bloom.StaticFunctionMapS_AOPM_E;

//著作权人+ 作者= 罗瑶光
public class StaticRegisterS_AOPM_C {
	public static void load(StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
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
