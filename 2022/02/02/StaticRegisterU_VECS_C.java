package SEM.register;

import SEM.bloom.StaticFunctionMapU_VECS_C;
import SEM.bloom.StaticFunctionMapU_VECS_E;

//著作权人+ 作者= 罗瑶光
public class StaticRegisterU_VECS_C {
	public static void load(StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_E) {
		// TODO Auto-generated method stub
		StaticFunctionMapU_VECS_C.annotationMap.put("main", "main");//注册一个main接口
		StaticFunctionMapU_VECS_C.annotationMap.put("getMapFromDoubleStringArray", "score:nameScore");//注册一个main接口
		StaticFunctionMapU_VECS_C.annotationMap.put("getMapFromIntStringArray", "score:nameScore");
		StaticFunctionMapU_VECS_C.annotationMap.put("getMapFromIntStringArray_ZhongYao", "score:nameScore");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToJson", "gson:object");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToXml", "gson:object");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToMap", "gson:objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToVector", "gson:objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToList", "gson:objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToIterator", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToSet", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToMatrix", "objects:widthRange");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToMatrix3D", "objects:widthRange:heightRange");
		StaticFunctionMapU_VECS_C.annotationMap.put("xlsOrCsvFileToObjectMartix", "filePath:pageSheetIndex");
		StaticFunctionMapU_VECS_C.annotationMap.put("xlsOrCsvFileToListObject", "filePath:pageSheetIndex");
		StaticFunctionMapU_VECS_C.annotationMap.put("xlsOrCsvFileToRangedListObject", "filePath:pageSheetIndex:rows:culumns");
		StaticFunctionMapU_VECS_C.annotationMap.put("xlsOrCsvFileToRangedObjectMartix", "filePath:pageSheetIndex:rows:culumns");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToGMTString", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToYYYYMMDD", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToHHMMSS", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToMiliSeconds", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("getCurrentMiliSeconds", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToTimeStamp", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("timeStampToMiliSeconds", "timestamp");
		StaticFunctionMapU_VECS_C.annotationMap.put("timeStampToMiliSecondsWithSize", "timestamp:size");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateStringToMiliSeconds", "string");
		StaticFunctionMapU_VECS_C.annotationMap.put("hashTableToJson", "gson:hashtable");
		StaticFunctionMapU_VECS_C.annotationMap.put("hashTableToXml", " gson:hashtable");
		StaticFunctionMapU_VECS_C.annotationMap.put("hashTableToList", "gson:hashtable");
		StaticFunctionMapU_VECS_C.annotationMap.put("hashTableToObjectArray", "gson:hashtable");
		StaticFunctionMapU_VECS_C.annotationMap.put("getJson", "urlString:jsonString");
		StaticFunctionMapU_VECS_C.annotationMap.put("postXML", "urlString:XMLString");
		StaticFunctionMapU_VECS_C.annotationMap.put("postJsonWithSercurity", "urlString:jsonString");
		StaticFunctionMapU_VECS_C.annotationMap.put("postXMLWithSercurity", "urlString:XMLString");
		StaticFunctionMapU_VECS_C.annotationMap.put("getHTML", "urlString:object");
		StaticFunctionMapU_VECS_C.annotationMap.put("pixTableToFile", "pngOutputPath:pix:fileType");
		StaticFunctionMapU_VECS_C.annotationMap.put("pixRGBTableToFile", "pngOutputPath:pixRed:pixGreen:pixBlue:fileType");
		StaticFunctionMapU_VECS_C.annotationMap.put("bufferedImageToFile", "pngOutputPath:bufferedImage:fileType");
		StaticFunctionMapU_VECS_C.annotationMap.put("imageToFile", "pngOutputPath:image:fileType");
		StaticFunctionMapU_VECS_C.annotationMap.put("bufferedImageToScaleImageFile", "pngOutputPath:bufferedImage:fileType:scale");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageFileToArrayWithBlack", "FilePath");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageToArrayWithBlack", "bufferedImage");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageToArrayWithColor", "bufferedImage:colorRange");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageFileToArrayWithColor", "FilePath:colorRange");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageFileToArrayMapWithBlack", "FilePath");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageToArrayMapWithBlack", "bufferedImage");
		StaticFunctionMapU_VECS_C.annotationMap.put("toolkitImageIconToBufferImage", "positionX:positionY:imageIcon");
		StaticFunctionMapU_VECS_C.annotationMap.put("toolkitImageToBufferImage", "image:positionX:positionY:width:height:imageObserver");
		StaticFunctionMapU_VECS_C.annotationMap.put("toolkitImageToBufferImageAboutIconConfig", "image:positionX:positionY");
		
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToJsonString", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringIteratorToJsonString", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToXml", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToMap", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToObjectArray", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToList", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("jsonArrayToList", "jSONArray");
		StaticFunctionMapU_VECS_C.annotationMap.put("jsonObjectToString", "jSONArray");
		StaticFunctionMapU_VECS_C.annotationMap.put("jsonObjectToHashtable", "gson:jSONObject");
		StaticFunctionMapU_VECS_C.annotationMap.put("jsonObjectToXml", "jSONObject");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToJsonString", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringListToJsonString", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToXml", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToMap", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToObjectArray", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringlistToStringArray", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToIterator", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToVector", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToSet", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToArray", "gson:list");
		
		StaticFunctionMapU_VECS_C.annotationMap.put("mapToList", "map");
		StaticFunctionMapU_VECS_C.annotationMap.put("mapToHash", "map");
		StaticFunctionMapU_VECS_C.annotationMap.put("sort", "array:range:deeps");
		StaticFunctionMapU_VECS_C.annotationMap.put("xmlToList", "string:key");
		StaticFunctionMapU_VECS_C.annotationMap.put("xmlToVector", "string:key");
		StaticFunctionMapU_VECS_C.annotationMap.put("xmlToSets", "string:key");
		StaticFunctionMapU_VECS_C.annotationMap.put("xmlToHashtable", "xmlString:gson");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToObjectMatrix", "filePath:stopBy");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToObjectMatrixWithRange", "filePath:stopBy:rangeBegin:rangeEnd");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToListStringWithRange", "filePath:stopBy:rangeBegin:rangeEnd");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToListString", "filePath");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToListStringArray", "filePath, String stopBy");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToMap", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToList", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToArray", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToIterator", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToJsonString", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToSet", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToCharArray", "stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToString", "stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToJson", "gson:stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToXml", "gson:stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToSplitArray", "stopBy:stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToMap", "gson:stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringToArray", "stopBy:string");
		
		StaticFunctionMapU_VECS_C.annotationMap.put("stringArrayToString", "strings");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringToURIencode", "string:encoding");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringToURIencode", "string");
		StaticFunctionMapU_VECS_C.annotationMap.put("uRIencodeToURIdecode", "string");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringToCharASCII", "string");
		StaticFunctionMapU_VECS_C.annotationMap.put("charsetSwap", "string:inputCharset:outputCharset");
		StaticFunctionMapU_VECS_C.annotationMap.put("objectToJsonString", "gson:object");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixShiftSwapXYZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInclineSwapXY", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInclineSwapXZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInclineSwapYZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwapXY", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwapXZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwapYZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixToArray", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInclineSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixPostSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixToArray", "objects");	
	}
}
