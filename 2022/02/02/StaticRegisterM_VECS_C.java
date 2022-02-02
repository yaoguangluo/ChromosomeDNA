package SEM.register;

import SEM.bloom.StaticFunctionMapM_VECS_C;
import SEM.bloom.StaticFunctionMapM_VECS_E;

//著作权人+ 作者= 罗瑶光
public class StaticRegisterM_VECS_C {
	public static void load(StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowsByAttributesOfJoinCondition", "object:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowsByAttributesOfJoinAggregation", "object:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowsByAttributesOfJoinGetCulumns", "object");
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowsByAttributesOfJoinRelation", "object:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("selectRowsByAttributesOfJoinCondition", "object");
		StaticFunctionMapM_VECS_C.annotationMap.put("selectRowsByAttributesOfJoinAggregation", "object");
		StaticFunctionMapM_VECS_C.annotationMap.put("selectRowsByAttributesOfJoinGetCulumns", "object");
		StaticFunctionMapM_VECS_C.annotationMap.put("selectRowsByAttributesOfJoinRelation", "object");
		StaticFunctionMapM_VECS_C.annotationMap.put("insertRowByTablePathAndIndex", "tablePath:pageIndex:culumnOfNewRow");
		StaticFunctionMapM_VECS_C.annotationMap.put("insertRowByBaseName", "baseName:tableName:jsobj:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("IU_RowByAttributes", "object:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("I_Table", "object:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("deleteRowByTablePathAndIndex", "tablePath:pageIndex:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("D_RowByAttributesOfCondition", "object:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowByTablePathAndIndex", "tablePath:pageIndex:jaculumnOfUpdateRow");
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowByTablePathAndAttribute", "tablePath:culumnName:culumnValue:jobj");
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowsByRecordConditions", "object:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowsByAttributesOfCondition", "object:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowsByAttributesOfAggregation", "object:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("updateRowsByAttributesOfGetCulumns", "object");
		StaticFunctionMapM_VECS_C.annotationMap.put("E_PLSQL", "plslq:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("E_PLORM", "orm:b");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_AggregationLimitMap", "sets:output");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_Cache", "sets:output:tableName:baseName:object");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_kernel"
				, "temp:readDBTableRowIndexCulumnFile:readDBTableRowIndexFile:reader:DBTableRowIndexPath:output:bufferRow:rowMap");
		StaticFunctionMapM_VECS_C.annotationMap.put("rowToRowMap", "row");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_Map", "sets:output:dBTablePath");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_Table", "sets:output:DBTablePath:object");
		StaticFunctionMapM_VECS_C.annotationMap.put("getCulumnsMapWithAs", "sets:row");
		StaticFunctionMapM_VECS_C.annotationMap.put("getCulumnsMap", "sets:row");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_GetCulumnsMap", "obj:getCulumnsValueArray");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_AndMap", "sets:obj:joinObj:object:newObj");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_OrMap", "sets:obj:joinObj:object:newObj:findinNewObj");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_SetRoot", "acknowledge:output");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_BaseName", "acknowledge:output");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_TableName", "acknowledge:output");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_ListNeedStart", "acknowledge:output");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_Join", "acknowledge:output");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_E", "acknowledge:output:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_Check", "acknowledge:output:mod");
		StaticFunctionMapM_VECS_C.annotationMap.put("wordsForestNotContainsKey", "outputList:countWordNode:prefixWord");
		StaticFunctionMapM_VECS_C.annotationMap.put("prefixWordEqualZero", "outputList:countWordNode:prefixWord");
		StaticFunctionMapM_VECS_C.annotationMap.put("wordsForestContainsKey", "outputList:countWordNode:prefixWord");
		
		StaticFunctionMapM_VECS_C.annotationMap.put("WordFrequencyFindCheck", "outputList:fixWords");
		StaticFunctionMapM_VECS_C.annotationMap.put("WordFrequencyCompareCheck", "outputList:fixWords:countWordNode");
		StaticFunctionMapM_VECS_C.annotationMap.put("sessionCheck", "token:tokenCerts");
		StaticFunctionMapM_VECS_C.annotationMap.put("sessionTokenUpdateByDNA", "password");
		StaticFunctionMapM_VECS_C.annotationMap.put("sessionTokenCertsInitWithHumanWordsByDNA", "humanWordsPassword:bys:lockBys");
		StaticFunctionMapM_VECS_C.annotationMap.put("sessionTokenCertsInitWithHumanWordsByDNA_ETL", "humanWordsPassword:bys:lockBys");
		StaticFunctionMapM_VECS_C.annotationMap.put("sessionInitByTokenPDICertsDNA", "tokenCerts");
		
		StaticFunctionMapM_VECS_C.annotationMap.put("sessionInitByTokenCertsDNA", "tokenCerts");
		StaticFunctionMapM_VECS_C.annotationMap.put("sessionCheckWithOrderPDSKey", "token:tokenCerts");
		StaticFunctionMapM_VECS_C.annotationMap.put("sessionCheckWithPostPDSKey", "token:tokenCerts");
		StaticFunctionMapM_VECS_C.annotationMap.put("arrayIntCheck", "array:min:max");
		StaticFunctionMapM_VECS_C.annotationMap.put("arrayIntFix", "array:min:max");
		StaticFunctionMapM_VECS_C.annotationMap.put("arrayLongCheck", "array:min:max");
		StaticFunctionMapM_VECS_C.annotationMap.put("arrayLongFix", "array:min:max");
		StaticFunctionMapM_VECS_C.annotationMap.put("arrayDoubleCheck", "array:min:max");
		StaticFunctionMapM_VECS_C.annotationMap.put("arrayDoubleFix", "array:min:max");
		StaticFunctionMapM_VECS_C.annotationMap.put("arrayFloatCheck", "array:min:max");
		StaticFunctionMapM_VECS_C.annotationMap.put("arrayFloatFix", "array:min:max");
		StaticFunctionMapM_VECS_C.annotationMap.put("currentSystemTimeCheck", "offsetUTC8:miliSecondsDistinction");
		StaticFunctionMapM_VECS_C.annotationMap.put("currentSystemTimeToUTC", "offsetUTC8");
		StaticFunctionMapM_VECS_C.annotationMap.put("getTranslator", "void");
		StaticFunctionMapM_VECS_C.annotationMap.put("ListSetsCheck", "list:setsType");
		StaticFunctionMapM_VECS_C.annotationMap.put("ListSetsFix", "list:setsType");
		StaticFunctionMapM_VECS_C.annotationMap.put("matrixCheck", "objects:attribute");
		StaticFunctionMapM_VECS_C.annotationMap.put("matrixFix", "objects:attribute");
		StaticFunctionMapM_VECS_C.annotationMap.put("checkNULL", "object");
		StaticFunctionMapM_VECS_C.annotationMap.put("getCfxButton", "string:x:y:c");
		StaticFunctionMapM_VECS_C.annotationMap.put("DetaButton", "string:x:y:c");
		StaticFunctionMapM_VECS_C.annotationMap.put("YLJShowButton", "string:x:y:c");
		StaticFunctionMapM_VECS_C.annotationMap.put("DetaIndexLabel", "name:jFrameList");
		StaticFunctionMapM_VECS_C.annotationMap.put("DetaLabel", "name");
		StaticFunctionMapM_VECS_C.annotationMap.put("DetaSlider", "x:y");
		StaticFunctionMapM_VECS_C.annotationMap.put("DetabbedPane", "x:y:c");
		StaticFunctionMapM_VECS_C.annotationMap.put("getColorTableRender", "void");
		StaticFunctionMapM_VECS_C.annotationMap.put("CfxTextArea", "string:x:y:c");
		StaticFunctionMapM_VECS_C.annotationMap.put("CfxTextField", "string:x:y:c");
		StaticFunctionMapM_VECS_C.annotationMap.put("CfxTextPane", "string:x:y:c");
		StaticFunctionMapM_VECS_C.annotationMap.put("forwardToRestMap", "app:vPCSRequest:vPCSResponse");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_Rest", "app:vPCSRequest:vPCSResponse");
		StaticFunctionMapM_VECS_C.annotationMap.put("P_RestDB", "app:vPCSRequest:vPCSResponse");
		StaticFunctionMapM_VECS_C.annotationMap.put("P", "type:socket:_A:emotionMap");
	}
}
