package SEM.bloom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.swing.ImageIcon;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;
import OEU.LYG4DQS4D.LYG10DWCMSSort15D_XCDX_C_U_A;
import PEU.S.verbal.VerbalSource;
import SVQ.stable.StableFile;
//著作权人+作者= 罗瑶光
public interface StaticFunctionMapU_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 
	//Double_ESU
	public Map<Double, Map<String, Boolean>> getMapFromDoubleStringArray(Double[] score, String[] nameScore);
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray(int[] score, String[] nameScore);
	//稍后并到int array 新文件中
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray_ZhongYao(int[] score, String[] nameScore);

	//Array_ESU
	public String arrayToJson(Gson gson, Object[] object);
	public String arrayToXml(Gson gson, Object[] object);
	public Map<String, Object> arrayToMap(Gson gson, Object[] objects);
	public Vector<Object> arrayToVector(Gson gson, Object[] objects);
	public List<Object> arrayToList(Object[] objects);
	public Iterator<Object> arrayToIterator(Object[] objects);
	public Set<Object> arrayToSet(Object[] objects);
	public Object[][] arrayToMatrix(Object[] objects, int widthRange);
	public Object[][][] arrayToMatrix3D(Object[] objects, int widthRange, int heightRange);

	//CSV_ESU{
	public Object[][] xlsOrCsvFileToObjectMartix(String filePath, int pageSheetIndex) throws IOException;
	public List<Object[]> xlsOrCsvFileToListObject(String filePath, int pageSheetIndex) throws IOException;
	public List<Object[]> xlsOrCsvFileToRangedListObject(String filePath, int pageSheetIndex, Map<Integer, Boolean> rows
			, Map<Integer, Boolean> culumns) throws IOException;
	public Object[][] xlsOrCsvFileToRangedObjectMartix(String filePath, int pageSheetIndex, Map<Integer, Boolean> rows
			, Map<Integer, Boolean> culumns) throws IOException;

	//Date_ESU
	public String dateToGMTString(Date date);
	public String dateToYYYYMMDD(Date date);
	public String dateToHHMMSS(Date date);
	public String dateToMiliSeconds(Date date);
	public String getCurrentMiliSeconds(Date date);
	public Timestamp dateToTimeStamp(Date date);
	public long timeStampToMiliSeconds(Timestamp timestamp);
	public String timeStampToMiliSecondsWithSize(Timestamp timestamp, int size);	
	public String dateStringToMiliSeconds(String string);

	//Hash_ESU
	public String hashTableToJson(Gson gson, Hashtable<String, Object> hashtable);
	public String hashTableToXml(Gson gson, Hashtable<String, Object> hashtable);
	public List<Object> hashTableToList(Gson gson, Hashtable<String, Object> hashtable);
	public Object[] hashTableToObjectArray(Gson gson, Hashtable<String, Object> hashtable);

	// HttpUnicode{
	//这个函数在作者去年开发股市分析软件的时候从雪球等网站采样抓数据，发现有GBK 
	//utf-8 gb2312 ascii 等格式数据比较混乱，于是进行统一格式处理。
	public String getJson(String urlString, String jsonString) throws IOException;
	public String postXML(String urlString,String XMLString) throws IOException;
	public String postJsonWithSercurity(String urlString, String jsonString) throws IOException;
	public String postXMLWithSercurity(String urlString, String XMLString)throws IOException;
	public String getHTML(String urlString, Object object) throws IOException;

	//Image_ESU
	public void pixTableToFile(String pngOutputPath, int[][] pix, String fileType) throws IOException;
	public void pixRGBTableToFile(String pngOutputPath, int[][] pixRed, int[][] pixGreen, int[][] pixBlue, String fileType)
			throws IOException;
	public void bufferedImageToFile(String pngOutputPath, BufferedImage bufferedImage, String fileType) throws IOException;
	public void imageToFile(String pngOutputPath, Image image, String fileType)throws IOException;
	public void bufferedImageToScaleImageFile(String pngOutputPath, BufferedImage bufferedImage, String fileType
			, int scale) throws IOException;

	//ImageToList 
	//该函数用于股市等波形图片文件转换成数组。
	public List<Integer> waveImageFileToArrayWithBlack(String FilePath) throws IOException;
	//该函数用于股市等波形缓存转换成数组。
	public List<Integer> waveImageToArrayWithBlack(BufferedImage bufferedImage);
	//该函数用于股市等波形缓存转换成数组。根据特征颜色处理。
	public List<Integer> waveImageToArrayWithColor(BufferedImage bufferedImage, int colorRange);
	//该函数用于股市等波形图片文件转换成数组。根据特征颜色处理。
	public List<Integer> waveImageFileToArrayWithColor(String FilePath, int colorRange) throws IOException;
	//该函数用于股市等波形图片文件转换成相同颜色数组分类集合。
	public HashMap<Integer, List<Integer>> waveImageFileToArrayMapWithBlack(String FilePath) throws IOException;
	//该函数用于股市等波形缓存转换成数组。
	public HashMap<Integer, List<Integer>> waveImageToArrayMapWithBlack(BufferedImage bufferedImage);

	//ToolkitImageToBufferImage
	public BufferedImage toolkitImageIconToBufferImage(int positionX, int positionY, ImageIcon imageIcon);
	public BufferedImage toolkitImageToBufferImage(Image image, int positionX, int positionY, int width
			, int height, ImageObserver imageObserver) ;
	public BufferedImage toolkitImageToBufferImageAboutIconConfig(Image image, int positionX, int positionY);

	//Iterator_ESU
	public String iteratorToJsonString(Gson gson, Iterator<Object> iterator);
	public Object stringIteratorToJsonString(Gson gson, Iterator<String> iterator);
	public String iteratorToXml(Gson gson, Iterator<Object> iterator);
	public String iteratorToMap(Gson gson, Iterator<Object> iterator);
	public Object[] iteratorToObjectArray(Gson gson, Iterator<Object> iterator);
	public List<Object> iteratorToList(Gson gson, Iterator<Object> iterator);

	//Json_ESU
	//  剔除个人著作权 申请范围	
	//	public Map<String, Object> jsonObjectToMap(Gson gson
	//			, JSONObject jSONObject){
	//		return gson.fromJson(jSONObject.toString()
	//, new TypeToken<Map<String, Object>>(){}.getType()){  };
	//	}

	public List<Object> jsonArrayToList(JSONArray jSONArray);
	public String jsonObjectToString(JSONObject jSONObject);
	public Hashtable<String, Object> jsonObjectToHashtable(Gson gson,JSONObject jSONObject);
	public String jsonObjectToXml(JSONObject jSONObject);

	//List_ESU
	public String listToJsonString(Gson gson, List<Object> list);
	public Object stringListToJsonString(Gson gson, List<String> list) ;
	public String listToXml(Gson gson, List<Object> list);
	public String listToMap(Gson gson, List<Object> list);
	public Object[] listToObjectArray(List<Object> list);
	public String[] stringlistToStringArray(List<String> list);
	public Iterator<Object> listToIterator(List<Object> list);
	public Vector<Object> listToVector(List<Object> list);
	public Set<Object> listToSet(List<Object> list);
	public String[] listToArray(List<String> list);

	//Map_ESU{
	//  剔除个人著作权 申请范围	
	//	public String mapToJsonString(Gson gson, Map<String, Object> map){
	//		return gson.toJson(map);
	//	}
	//
	//	public String mapToXml(Gson gson, Map<String, Object> map){
	//		JSONObject jSONObject= new JSONObject(gson.toJson(map)){  };
	//		return XML.toString(jSONObject);	
	//	}

	public List<Map<String, Object>> mapToList(Map<String, Object> map);
	public Hashtable<String, Object> mapToHash(Map<String, Object> map);

	//LYG9DWithDoubleTopSort5D
	public double[] sort(double[] array, int range, int deeps);

	//LYG10DWithChineseMixStringSort12D
	public static void 笔画拼音排序稍后进行把传参设计下(String[] strings1D) throws IOException {		
		InputStream inputStreamp= new VerbalSource().getClass().getResourceAsStream(StableFile.PinYinCN_lyg);
		BufferedReader cReaderp= new BufferedReader(new InputStreamReader(inputStreamp, "GBK"));
		//index
		String cInputStringp;
		Map<String, String> map= new HashMap<>();
		HashMap<String, Integer> bihua= new HashMap<>();
		while ((cInputStringp= cReaderp.readLine())!= null) {
			String[] words= cInputStringp.split("->");
			if(words.length>1) {
				map.put(words[0], words[1]);
			}
		}
		InputStream inputStreamb= new VerbalSource().getClass().getResourceAsStream(StableFile.BiHuaCN_lyg);
		BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
		//index
		String cInputStringb;
		while ((cInputStringb= cReaderb.readLine())!= null) {
			String[] words= cInputStringb.split("->");
			if(words.length>1) {
				bihua.put(words[0], Integer.valueOf(words[1]));
			}
		}

		LYG10DWCMSSort15D_XCDX_C_U_A lYG10DWCMSSort15D_XCDX_C_U_A= new LYG10DWCMSSort15D_XCDX_C_U_A();
		lYG10DWCMSSort15D_XCDX_C_U_A.pinyin= map;
		lYG10DWCMSSort15D_XCDX_C_U_A.bihua= bihua;
		lYG10DWCMSSort15D_XCDX_C_U_A.processKernel(strings1D, 0, strings1D.length- 1, 30, 0);

		for(String string:strings1D) {
			System.out.println(string);
		}
		cReaderb.close();
		cReaderp.close();
	}

	// XML_ESU
	//  剔除个人著作权 申请范围
	//	public JSONObject xmlToJsonObject(String string){
	//		return XML.toJSONObject(string);
	//	}

	public List<Object> xmlToList(String string, String key) ;

	//  剔除个人著作权 申请范围
	//	public Map<String, Object> xmlToMap(Gson gson, String string){
	//		return gson.fromJson(XML.toJSONObject(string).toString()
	//, new TypeToken<Map<String, Object>>(){}.getType());
	//	}

	public Vector<Object> xmlToVector(String string, String key);
	public Set<Object> xmlToSets(String string, String key);
	public Hashtable<String, Object> xmlToHashtable(String xmlString, Gson gson);

	//TXT_ESU{
	//注意字节编码的读写正确
	public Object[][] txtFileToObjectMatrix(String filePath, String stopBy) throws IOException ;
	public Object[][] txtFileToObjectMatrixWithRange(String filePath, String stopBy, int rangeBegin
			, int rangeEnd) throws IOException;
	public List<String> txtFileToListStringWithRange(String filePath, String stopBy, int rangeBegin
			, int rangeEnd) throws IOException;
	public List<String> txtFileToListString(String filePath)throws IOException;
	public List<String[]> txtFileToListStringArray(String filePath, String stopBy) throws IOException ;

	//Vector_ESU
	public Map<String, Object> vectorToMap(Vector<Object> vector);
	public List<Object> vectorToList(Vector<Object> vector);
	public Object[] vectorToArray(Vector<Object> vector);
	public Iterator<Object> vectorToIterator(Vector<Object> vector);
	public String vectorToJsonString(Gson gson,Vector<Object> vector);
	public Set<Object> vectorToSet(Vector<Object> vector);

	//StringBuilder_ESU{
	public char[] stringBuilderToCharArray(StringBuilder stringBuilder);
	public String stringBuilderToString(StringBuilder stringBuilder);
	public String stringBuilderToJson(Gson gson, StringBuilder stringBuilder);
	public String stringBuilderToXml(Gson gson, StringBuilder stringBuilder);
	public String[] stringBuilderToSplitArray(String stopBy, StringBuilder stringBuilder);
	public Map<String, Object> stringBuilderToMap(Gson gson, StringBuilder stringBuilder);

	//String_ESU{
	public String[] stringToArray(String stopBy, String string);
	public String stringArrayToString(String[] strings);
	public String stringToURIencode(String string, String encoding)throws UnsupportedEncodingException;
	public String stringToURIencode(String string) throws UnsupportedEncodingException;
	public String uRIencodeToURIdecode(String string);
	public String uRIencodeToURIdecode(String string, String encode) throws UnsupportedEncodingException;
	public int[] stringToCharASCII(String string);
	public String charsetSwap(String string, String inputCharset
			, String outputCharset)throws UnsupportedEncodingException;

	//StockCode//正则处理，没有函数规则性，不添加先。
	//Object_ESU{
	public String objectToJsonString(Gson gson, Object object);
	//Matrix3D_ESU{
	public Object[][][] matrixShiftSwapXYZ(Object[][][] objects);
	public Object[][][] matrixInclineSwapXY(Object[][][] objects);
	public Object[][][] matrixInclineSwapXZ(Object[][][] objects);
	public Object[][][] matrixInclineSwapYZ(Object[][][] objects);
	public Object[][][] matrixReverseSwap(Object[][][] objects);
	public Object[][][] matrixReverseSwapXY(Object[][][] objects);
	public Object[][][] matrixReverseSwapXZ(Object[][][] objects);
	public Object[][][] matrixReverseSwapYZ(Object[][][] objects);
	public Object[] matrixToArray(Object[][][] objects);

	//Matrix_ESU{
	public Object[][] matrixInclineSwap(Object[][] objects);
	public Object[][] matrixPostSwap(Object[][] objects);
	public Object[][] matrixInSwap(Object[][] objects);
	public Object[][] matrixReverseSwap(Object[][] objects);
	public Object[] matrixToArray(Object[][] objects);
	//Flt 智能声诊接口， 不添加先。
}
