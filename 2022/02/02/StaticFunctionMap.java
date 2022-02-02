package SEM.bloom;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.UnsupportedAudioFileException;

import SEM.reflection.StaticReflectionMapA_IDUQ_C;
import SEM.reflection.StaticReflectionMapA_VECS_C;
import SEM.reflection.StaticReflectionMapC_AOPM_C;
import SEM.reflection.StaticReflectionMapC_IDUQ_C;
import SEM.reflection.StaticReflectionMapD_AOPM_C;
import SEM.reflection.StaticReflectionMapD_VECS_C;
import SEM.reflection.StaticReflectionMapE_AOPM_C;
import SEM.reflection.StaticReflectionMapE_IDUQ_C;
import SEM.reflection.StaticReflectionMapI_AOPM_C;
import SEM.reflection.StaticReflectionMapI_VECS_C;
import SEM.reflection.StaticReflectionMapM_IDUQ_C;
import SEM.reflection.StaticReflectionMapM_VECS_C;
import SEM.reflection.StaticReflectionMapO_IDUQ_C;
import SEM.reflection.StaticReflectionMapO_VECS_C;
import SEM.reflection.StaticReflectionMapP_IDUQ_C;
import SEM.reflection.StaticReflectionMapP_VECS_C;
import SEM.reflection.StaticReflectionMapQ_AOPM_C;
import SEM.reflection.StaticReflectionMapQ_VECS_C;
import SEM.reflection.StaticReflectionMapS_AOPM_C;
import SEM.reflection.StaticReflectionMapS_IDUQ_C;
import SEM.reflection.StaticReflectionMapU_AOPM_C;
import SEM.reflection.StaticReflectionMapU_VECS_C;
import SEM.reflection.StaticReflectionMapV_AOPM_C;
import SEM.reflection.StaticReflectionMapV_IDUQ_C;

//用来索引函数 注册类
//罗瑶光
public class StaticFunctionMap{
	public static void doA_VECS_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_C, Map<String, Object> output) throws IOException {
		if(callFunctionKey.equalsIgnoreCase("main")) {
			//....
		}
		StaticReflectionMapA_VECS_C.callFunction(callFunctionKey, staticFunctionMapA_VECS_C, output);
	}
	public static void doA_IDUQ_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapA_IDUQ_C.callFunction(callFunctionKey, staticFunctionMapA_IDUQ_C, output);
	}
	public static void doO_VECS_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_C, Map<String, Object> output) throws Exception {
		StaticReflectionMapO_VECS_C.callFunction(callFunctionKey, staticFunctionMapO_VECS_C, output);
	}
	public static void doO_IDUQ_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_C, Map<String, Object> output) throws IOException
	, UnsupportedAudioFileException, InterruptedException, CloneNotSupportedException {
		StaticReflectionMapO_IDUQ_C.callFunction(callFunctionKey, staticFunctionMapO_IDUQ_C, output);
	}
	public static void doP_VECS_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_C, Map<String, Object> output) throws IOException
	, InstantiationException, IllegalAccessException {
		StaticReflectionMapP_VECS_C.callFunction(callFunctionKey, staticFunctionMapP_VECS_C, output);
	}
	public static void doP_IDUQ_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapP_IDUQ_C.callFunction(callFunctionKey, staticFunctionMapP_IDUQ_C, output);
	}
	public static void doM_VECS_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_C, Map<String, Object> output) throws Exception {
		StaticReflectionMapM_VECS_C.callFunction(callFunctionKey, staticFunctionMapM_VECS_C, output);
	}
	public static void doM_IDUQ_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapM_IDUQ_C.callFunction(callFunctionKey, staticFunctionMapM_IDUQ_C, output);
	}
	public static void doV_AOPM_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapV_AOPM_C.callFunction(callFunctionKey, staticFunctionMapV_AOPM_C, output);
	}
	public static void doV_IDUQ_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapV_IDUQ_C.callFunction(callFunctionKey, staticFunctionMapV_IDUQ_C, output);
	}
	public static void doE_AOPM_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapE_AOPM_C.callFunction(callFunctionKey, staticFunctionMapE_AOPM_C, output);
	}
	public static void doE_IDUQ_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapE_IDUQ_C.callFunction(callFunctionKey, staticFunctionMapE_IDUQ_C, output);
	}
	public static void doC_AOPM_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_C, Map<String, Object> output) throws Exception {
		StaticReflectionMapC_AOPM_C.callFunction(callFunctionKey, staticFunctionMapC_AOPM_C, output);
	}

	public static void doC_IDUQ_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapC_IDUQ_E staticFunctionMapC_IDUQ_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapC_IDUQ_C.callFunction(callFunctionKey, staticFunctionMapC_IDUQ_C, output);
	}
	public static void doS_AOPM_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_C, Map<String, Object> output) throws Exception {
		StaticReflectionMapS_AOPM_C.callFunction(callFunctionKey, staticFunctionMapS_AOPM_C, output);
	}
	public static void doS_IDUQ_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapS_IDUQ_E staticFunctionMapS_IDUQ_C, Map<String, Object> output) throws IOException
	, CloneNotSupportedException {
		StaticReflectionMapS_IDUQ_C.callFunction(callFunctionKey, staticFunctionMapS_IDUQ_C, output);
	}
	public static void doI_AOPM_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_C, Map<String, Object> output) throws IOException
	, HeadlessException, InterruptedException {
		StaticReflectionMapI_AOPM_C.callFunction(callFunctionKey, staticFunctionMapI_AOPM_C, output);
	}
	public static void doI_VECS_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapI_VECS_C.callFunction(callFunctionKey, staticFunctionMapI_VECS_C, output);
	}
	public static void doD_AOPM_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapD_AOPM_E staticFunctionMapD_AOPM_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapD_AOPM_C.callFunction(callFunctionKey, staticFunctionMapD_AOPM_C, output);
	}
	public static void doD_VECS_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapD_VECS_E staticFunctionMapD_VECS_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapD_VECS_C.callFunction(callFunctionKey, staticFunctionMapD_VECS_C, output);
	}
	public static void doU_AOPM_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_C, Map<String, Object> output) throws Exception {
		StaticReflectionMapU_AOPM_C.callFunction(callFunctionKey, staticFunctionMapU_AOPM_C, output);
	}

	@SuppressWarnings("static-access")
	public static void doU_VECS_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_C, Map<String, Object> output) throws IOException {
		//		if(callFunctionKey.equalsIgnoreCase("main")) {//稍后分出去
		//			//写法1
		//			//case 参数
		//			if(string.contains("null")) {
		//				//其他参数可用object， json 都可以
		//				staticFunctionMapU_VECS_C.main(null);//稍后分出去
		//				output.put("U_VECS_main", "void");//非void接口就直接put进去即可。
		//			}
		//			//写法2
		//			//可以插件遍历，可以 接口遍历，可以web的outowire 遍历，
		//			//无数种方法遍历
		//		}

		//写法2
		//我准备设计一种callFunctionKey对应的接口call模式
		StaticReflectionMapU_VECS_C.callFunction(callFunctionKey, staticFunctionMapU_VECS_C, output);
	}
	public static void doQ_AOPM_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapQ_AOPM_E staticFunctionMapQ_AOPM_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapQ_AOPM_C.callFunction(callFunctionKey, staticFunctionMapQ_AOPM_C, output);
	}
	public static void doQ_VECS_CaseFunction(String callFunctionKey, String string
			, StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C, Map<String, Object> output) throws IOException {
		StaticReflectionMapQ_VECS_C.callFunction(callFunctionKey, staticFunctionMapQ_VECS_C, output);
	}

	//中间传参的过程是前面的 interfaceReturn要变成传参因子数据，而接口只识别传参因子变量名和 传参map，
	//这时候返回值的替换 传参map，和传参因子的改变出现了，我要做的就是添加 新的return因子，
	
	@SuppressWarnings("unchecked")
	public static Map<String, Object> preValues(Map<String, Object> output, String[] 传参因子) {
		boolean find= false;
		Map<String, Object> inputValues = null;
		//取值方法, 先检查上一个接口
		if(null!= output.get("lastInterfaceBackfeed")) {
			if(output.get("lastInterfaceBackfeed").toString().equalsIgnoreCase("success")) {
				String lastInterfaceReturn= (String) output.get("lastInterfaceName");//取 上一次运行接口名
				if(null!= lastInterfaceReturn) {
					Map<String, Object> lastReturns= (Map<String, Object>) output.get(lastInterfaceReturn);
					//取上一次运行接口的返回结果。
					//inputValues= (Map<String, Object>) lastReturns.get("interfaceReturn");//
					//因为java的return是唯一值，所以很好确定位置为第一个
					inputValues= new HashMap<>();
					inputValues.put(传参因子[0], lastReturns.get("interfaceReturn"));
					find= true;
				}	
			}
		}
		//检查上一个接口是否匹配;
		if(find) {
			//if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
			//	find= true;
			//}else {
			//	find= false;
			//}
			for(int i= 0; i< 传参因子.length; i++) {//轮训传参 string i++
				if(!inputValues.containsKey(传参因子[i])){
					find= false;
				}
			}
		}
		//////////////////////////////////////////////////////////////////////////////////////	

		//操作方法,就检查全局传参
		if(!find) {//当上一个接口没有返回这个接口需要的数据时，就检查全局传参
			inputValues= (Map<String, Object>) output.get("inputValues");//取存储值
		}
		//检查特定输入参数是否匹配
		if(null!= inputValues) {
			//if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
			//	find= true;
			//}	
			find= true;
			for(int i= 0; i< 传参因子.length; i++) {//轮训传参 string i++
				if(!inputValues.containsKey(传参因子[i])){
					find= false;
				}
			}
		}//本来想设计成插件模式，但是速度降低100倍不止，先不考虑，
		/////////////////////////////////////////////////////////////////////////////////////////////////	
		inputValues.put("find", find);
		return inputValues;
	}
	public static void postValues(Map<String, Object> output, boolean find, Object map, String callFunctionKey) {
		if(find) {
			//存储方法
			Map<String, Object> returnValue= new HashMap<>();
			returnValue.put("interfaceReturn", map);
			//输出
			output.put(callFunctionKey, returnValue);
			output.put("lastInterfaceName", callFunctionKey);//稍后设计成可 理论完美并行的模式。
			output.put("lastInterfaceBackfeed", "success");
		}else {
			output.put("lastInterfaceName", callFunctionKey);
			output.put("lastInterfaceBackfeed", "faild");
		}
	}
}