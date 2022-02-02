package SEM.bloom;
import java.io.IOException;
import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Map;

import SEM.register.StaticRegisterA_IDUQ_C;
import SEM.register.StaticRegisterA_VECS_C;
import SEM.register.StaticRegisterC_AOPM_C;
import SEM.register.StaticRegisterC_IDUQ_C;
import SEM.register.StaticRegisterD_AOPM_C;
import SEM.register.StaticRegisterD_VECS_C;
import SEM.register.StaticRegisterE_AOPM_C;
import SEM.register.StaticRegisterE_IDUQ_C;
import SEM.register.StaticRegisterI_AOPM_C;
import SEM.register.StaticRegisterI_VECS_C;
import SEM.register.StaticRegisterM_IDUQ_C;
import SEM.register.StaticRegisterM_VECS_C;
import SEM.register.StaticRegisterO_IDUQ_C;
import SEM.register.StaticRegisterO_VECS_C;
import SEM.register.StaticRegisterP_IDUQ_C;
import SEM.register.StaticRegisterP_VECS_C;
import SEM.register.StaticRegisterQ_AOPM_C;
import SEM.register.StaticRegisterQ_VECS_C;
import SEM.register.StaticRegisterS_AOPM_C;
import SEM.register.StaticRegisterS_IDUQ_C;
import SEM.register.StaticRegisterU_AOPM_C;
import SEM.register.StaticRegisterU_VECS_C;
import SEM.register.StaticRegisterV_AOPM_C;
import SEM.register.StaticRegisterV_IDUQ_C;
//用来索引文件。
//罗瑶光
//流程，1先工程归纳，然后2分类，最后3统计执行接口的相关java文件，4进行map索引。
public class StaticClassMap{
	public static Map<String, Object>  staticClassMap= new HashMap<>();
	public StaticClassMap(String string) throws IOException {
		if("A_VECS".equals(string)) {
			//..遍历工程文件。。。导入注册函数。
			//分词 读心术 情感分析，教育分析，文本分析，视觉动画
			//分词
			StaticFunctionMapA_VECS_E staticFunctionMapA_VECS_E =new StaticFunctionMapA_VECS_E();
			staticClassMap.put("A_VECS", staticFunctionMapA_VECS_E);//CE接口热化
			StaticRegisterA_VECS_C.load(staticFunctionMapA_VECS_E);//static 检查

		}
		if("A_IDUQ".equals(string)) {
			//..肽展公式， dna加密，vpcs服务器， 
			StaticFunctionMapA_IDUQ_E staticFunctionMapA_IDUQ_E =new StaticFunctionMapA_IDUQ_E();
			staticClassMap.put("A_IDUQ", staticFunctionMapA_IDUQ_E);//CE接口热化
			StaticRegisterA_IDUQ_C.load(staticFunctionMapA_IDUQ_E);//static 检查
		}

		if("O_VECS".equals(string)) {
			//..tinshell， 中文发音，数据库语言，离散余弦变换，
			StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_E =new StaticFunctionMapO_VECS_E();
			staticClassMap.put("O_VECS", staticFunctionMapO_VECS_E);//CE接口热化
			StaticRegisterO_VECS_C.load(staticFunctionMapO_VECS_E);//static 检查
		}
		if("O_IDUQ".equals(string)) {
			//..etl 文档流执行， 保存。
			StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_E =new StaticFunctionMapO_IDUQ_E();
			staticClassMap.put("O_IDUQ",  staticFunctionMapO_IDUQ_E);//CE接口热化
			StaticRegisterO_IDUQ_C.load(staticFunctionMapO_IDUQ_E);//static 检查
		}

		if("P_VECS".equals(string)) {
			//..数据预测完整包。
			StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_E =new StaticFunctionMapP_VECS_E();
			staticClassMap.put("P_VECS",  staticFunctionMapP_VECS_E);//CE接口热化
			StaticRegisterP_VECS_C.load(staticFunctionMapP_VECS_E);//static 检查
		}
		if("P_IDUQ".equals(string)) {
			//..dna遗传杂交组件
			StaticFunctionMapP_IDUQ_E staticFunctionMapP_IDUQ_E =new StaticFunctionMapP_IDUQ_E();
			staticClassMap.put("P_IDUQ",  staticFunctionMapP_IDUQ_E);//CE接口热化
			StaticRegisterP_IDUQ_C.load(staticFunctionMapP_IDUQ_E);//static 检查
		}

		if("M_VECS".equals(string)) {
			//..数据库 增删改查。界面控件，打印插件，三维词花组件
			StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_E =new StaticFunctionMapM_VECS_E();
			staticClassMap.put("M_VECS",  staticFunctionMapM_VECS_E);//CE接口热化
			StaticRegisterM_VECS_C.load(staticFunctionMapM_VECS_E);//static 检查
		}
		if("M_IDUQ".equals(string)) {
			//..欧拉 元基进制环路， 元基进制变换。
			StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_E =new StaticFunctionMapM_IDUQ_E();
			staticClassMap.put("M_IDUQ",  staticFunctionMapM_IDUQ_E);//CE接口热化
			StaticRegisterM_IDUQ_C.load(staticFunctionMapM_IDUQ_E);//static 检查
		}

		if("V_AOPM".equals(string)) {
			//..dna 概率钥匙非对称变换加密， 缓存，三维视觉，
			StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_E =new StaticFunctionMapV_AOPM_E();
			staticClassMap.put("V_AOPM",  staticFunctionMapV_AOPM_E);//CE接口热化
			StaticRegisterV_AOPM_C.load(staticFunctionMapV_AOPM_E);//static 检查
		}
		if("V_IDUQ".equals(string)) {
			//..etl核心组件，界面，etl读取文档，
			StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_E =new StaticFunctionMapV_IDUQ_E();
			staticClassMap.put("V_IDUQ",  staticFunctionMapV_IDUQ_E);//CE接口热化
			StaticRegisterV_IDUQ_C.load(staticFunctionMapV_IDUQ_E);//static 检查
		}

		if("E_AOPM".equals(string)) {
			//..德塔分词核心组件。
			StaticFunctionMapE_AOPM_E staticFunctionMapE_AOPM_E =new StaticFunctionMapE_AOPM_E();
			staticClassMap.put("E_AOPM",  staticFunctionMapE_AOPM_E);//CE接口热化
			StaticRegisterE_AOPM_C.load(staticFunctionMapE_AOPM_E);//static 检查
		}
		if("E_IDUQ".equals(string)) {
			//..etl 界面操作组件，类 osgi 插件注册组件
			StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_E= new StaticFunctionMapE_IDUQ_E();
			staticClassMap.put("E_IDUQ", staticFunctionMapE_IDUQ_E);//CE接口热化
			StaticRegisterE_IDUQ_C.load(staticFunctionMapE_IDUQ_E);//static 检查
		}

		if("C_AOPM".equals(string)) {
			//..vpcs服务器中心， 自然语言处理组件
			StaticFunctionMapC_AOPM_E staticFunctionMapC_AOPM_E= new StaticFunctionMapC_AOPM_E();
			staticClassMap.put("C_AOPM", staticFunctionMapC_AOPM_E);//CE接口热化
			StaticRegisterC_AOPM_C.load(staticFunctionMapC_AOPM_E);//static 检查
		}
		if("C_IDUQ".equals(string)) {
			//..自然语言 控制中心
			StaticFunctionMapC_IDUQ_E staticFunctionMapC_IDUQ_E= new StaticFunctionMapC_IDUQ_E();
			staticClassMap.put("C_IDUQ", staticFunctionMapC_IDUQ_E);//CE接口热化
			StaticRegisterC_IDUQ_C.load(staticFunctionMapC_IDUQ_E);//static 检查
		}

		if("S_AOPM".equals(string)) {
			//..数据记录中心
			StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_E=new StaticFunctionMapS_AOPM_E();
			staticClassMap.put("S_AOPM", staticFunctionMapS_AOPM_E);//CE接口热化
			StaticRegisterS_AOPM_C.load(staticFunctionMapS_AOPM_E);//static 检查
		}
		if("S_IDUQ".equals(string)) {
			//..线性，非线性数据操作中心
			StaticFunctionMapS_IDUQ_E staticFunctionMapS_IDUQ_E=new StaticFunctionMapS_IDUQ_E();
			staticClassMap.put("S_IDUQ", staticFunctionMapS_IDUQ_E);//CE接口热化
			StaticRegisterS_IDUQ_C.load(staticFunctionMapS_IDUQ_E);//static 检查
		}

		if("I_AOPM".equals(string)) {
			//..语音记录，三维数据分析登记
			StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_E= new StaticFunctionMapI_AOPM_E();
			staticClassMap.put("I_AOPM", staticFunctionMapI_AOPM_E);//CE接口热化
			StaticRegisterI_AOPM_C.load(staticFunctionMapI_AOPM_E);//static 检查
		}
		if("I_VECS".equals(string)) {
			//..肽腐蚀， 非卷积视觉，图片读脏
			StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_E=new StaticFunctionMapI_VECS_E();
			staticClassMap.put("I_VECS", staticFunctionMapI_VECS_E);//CE接口热化
			StaticRegisterI_VECS_C.load(staticFunctionMapI_VECS_E);//static 检查
		}

		if("D_AOPM".equals(string)) {
			//..数据异常处理，
			StaticFunctionMapD_AOPM_E staticFunctionMapD_AOPM_E= new StaticFunctionMapD_AOPM_E();
			staticClassMap.put("D_AOPM",staticFunctionMapD_AOPM_E);//CE接口热化
			StaticRegisterD_AOPM_C.load(staticFunctionMapD_AOPM_E);//static 检查
		}
		if("D_VECS".equals(string)) {
			//..数据异常处理，，稍后把功能是 删除的 移到这里来。
			StaticFunctionMapD_VECS_E staticFunctionMapD_VECS_E= new StaticFunctionMapD_VECS_E();
			staticClassMap.put("D_VECS", staticFunctionMapD_VECS_E);//CE接口热化
			StaticRegisterD_VECS_C.load(staticFunctionMapD_VECS_E);//static 检查
		}

		if("U_AOPM".equals(string)) {
			//..卷积变换处理
			StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_E= new StaticFunctionMapU_AOPM_E();
			staticClassMap.put("U_AOPM",staticFunctionMapU_AOPM_E);//CE接口热化
			StaticRegisterU_AOPM_C.load(staticFunctionMapU_AOPM_E);//static 检查
		}
		if("U_VECS".equals(string)) {
			//..数据变换处理
			StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_E= new StaticFunctionMapU_VECS_E();
			staticClassMap.put("U_VECS", staticFunctionMapU_VECS_E);//CE接口热化
			StaticRegisterU_VECS_C.load(staticFunctionMapU_VECS_E);//static 检查
			//。。..继续注册。。
			//。。
		}

		if("Q_AOPM".equals(string)) {
			//..六元dna杂交计算框架
			StaticFunctionMapQ_AOPM_E staticFunctionMapQ_AOPM_E= new StaticFunctionMapQ_AOPM_E();
			staticClassMap.put("Q_AOPM",staticFunctionMapQ_AOPM_E);//CE接口热化
			StaticRegisterQ_AOPM_C.load(staticFunctionMapQ_AOPM_E);//static 检查
		}
		if("Q_VECS".equals(string)) {
			//..dna搜索， 数据库orm， 函数语言
			StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_E= new StaticFunctionMapQ_VECS_E();
			staticClassMap.put("Q_VECS",staticFunctionMapQ_VECS_E);//CE接口热化
			StaticRegisterQ_VECS_C.load(staticFunctionMapQ_VECS_E);//static 检查
		}
		// TODO Auto-generated constructor stub
	}
}