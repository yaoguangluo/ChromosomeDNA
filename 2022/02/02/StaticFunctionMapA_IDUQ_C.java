package SEM.bloom;

import java.util.HashMap;
import java.util.Map;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI_XCDX;
import SVQ.stable.StableCommon;

//将dna加密的 main test 进行封装成函数。准备优化下。
//著作权人+ 作者= 罗瑶光
public class StaticFunctionMapA_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	//肽语
	public static String  getPDW(String string) {
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular= new FullDNATokenPDI_XCDX();
		pDE_RNA_FullFormular.text= string.toString();
		pDE_RNA_FullFormular.pdw= pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
		return pDE_RNA_FullFormular.pdw;
	}

	//肽锁
	public static String getLock() {
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular= new FullDNATokenPDI_XCDX();
		String[] lock= new String[12];
		lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
		lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
		lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
		int i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		return   pDE_RNA_FullFormular.lock;
	}

	//散列肽语 // 第二次修正会增加vpcs 接口多样化。 罗瑶光
	public static String getCode(String lock, String pdw) {
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular= new FullDNATokenPDI_XCDX();
		for(int i= 0; i< pdw.length(); i++) {
			pDE_RNA_FullFormular.code+= lock + pdw.charAt(i);
		}
		return  pDE_RNA_FullFormular.code;
	}

	//pde计算 确定pDE_RNA_FullFormular 变量中要有 肽语 肽锁 散列 的输入值。
	public static FullDNATokenPDI_XCDX doPDE(FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
		System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
		System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
		//pDE_RNA_FullFormular.bys= "0.6/0.3/0.5/0.632";
		System.out.println("静态密钥: "+ pDE_RNA_FullFormular.bys);
		pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
		System.out.println("静态肽展降元概率钥匙E: "+ pDE_RNA_FullFormular.pdedeKey);
		System.out.println("静态肽展降元概率钥匙S: "+ pDE_RNA_FullFormular.pdedsKey);
		System.out.println("静态肽展降元: "+ pDE_RNA_FullFormular.pds);
		System.out.println("静态肽展增元概率钥匙E: "+ pDE_RNA_FullFormular.pdeieKey);
		System.out.println("静态肽展增元概率钥匙S: "+ pDE_RNA_FullFormular.pdeisKey);
		System.out.println("静态肽展增元: "+ pDE_RNA_FullFormular.pde);
		return pDE_RNA_FullFormular;
	}

	//前序计算  确定pDE_RNA_FullFormular 变量中要有 肽语 肽锁 散列 概率钥匙 等相关输入值。
	public static FullDNATokenPDI_XCDX doPrefixPDE(FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		pDE_RNA_FullFormular.time= "" + System.currentTimeMillis();
		pDE_RNA_FullFormular.cacheId= "ID" + Math.random() + StableCommon.STRING_SYMBOL_PER + Math.random();
		System.out.println("时间:  " + pDE_RNA_FullFormular.time);
		System.out.println("账号随机缓存字符串:  " + pDE_RNA_FullFormular.cacheId);
		pDE_RNA_FullFormular.session_key= pDE_RNA_FullFormular.pde;
		System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
		System.out.println("=============================================================================");
		System.out.println("开始前序验证：");
		System.out.println("开始Session解析： " + pDE_RNA_FullFormular.session_key);
		System.out.println("开始概率钥匙解析：" + pDE_RNA_FullFormular.pdedeKey+ pDE_RNA_FullFormular.pdedsKey
				+ pDE_RNA_FullFormular.pdeieKey+ pDE_RNA_FullFormular.pdeisKey);

		FullDNATokenPDI_XCDX pDE_RNA_FullFormular1= new FullDNATokenPDI_XCDX();
		pDE_RNA_FullFormular1.pdedeKey= pDE_RNA_FullFormular.pdedeKey.toString();
		pDE_RNA_FullFormular1.pdedsKey= pDE_RNA_FullFormular.pdedsKey.toString();
		pDE_RNA_FullFormular1.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular1.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();

		pDE_RNA_FullFormular.doKeyUnPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular1, true);
		System.out.println();
		System.out.println("得到原降元元基DNA序列："+ pDE_RNA_FullFormular.pds);
		System.out.println("得到新降元元基DNA序列："+ pDE_RNA_FullFormular1.pds);
		System.out.println("得到原元基DNA序列："+ pDE_RNA_FullFormular.pde);
		System.out.println("得到新元基DNA序列："+ pDE_RNA_FullFormular1.pde);
		System.out.println("验证正确？");
		System.out.println(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde)? "正确": "失败");
		return pDE_RNA_FullFormular1;
	}

	//后序计算  确定pDE_RNA_FullFormular 和 pDE_RNA_FullFormular1 变量中要有 肽语 肽锁 散列 概率钥匙 等相关输入值。
	public static FullDNATokenPDI_XCDX doPostfixPDE(FullDNATokenPDI_XCDX pDE_RNA_FullFormular
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormularNew) {
		System.out.println("=======================================================================");
		System.out.println("开始后序验证：");
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular2= new FullDNATokenPDI_XCDX();
		pDE_RNA_FullFormular2.pdeieKey= pDE_RNA_FullFormular.pdedeKey.toString();
		pDE_RNA_FullFormular2.pdeisKey= pDE_RNA_FullFormular.pdedsKey.toString();
		pDE_RNA_FullFormular2.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();
		System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormularNew.pde);
		pDE_RNA_FullFormular2.doSessionKeyUnPress(pDE_RNA_FullFormularNew.pde, pDE_RNA_FullFormular2, true);
		System.out.println();
		System.out.println("得到原续降元元基DNA序列："+ pDE_RNA_FullFormularNew.pds);
		System.out.println("得到后续降元元基DNA序列："+ pDE_RNA_FullFormular2.pds);
		System.out.println("验证正确？");
		System.out.println(pDE_RNA_FullFormularNew.pds.equals(pDE_RNA_FullFormular2.pds)? "正确": "失败");	

		return pDE_RNA_FullFormular2;
	}

	//整序计算 确定pDE_RNA_FullFormular， pDE_RNA_FullFormular1 变量中要有 肽语 肽锁 散列 概率钥匙 等相关输入值。
	public static FullDNATokenPDI_XCDX doSurffixPDE(FullDNATokenPDI_XCDX pDE_RNA_FullFormular
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormularNew) {
		System.out.println("=========================================================================");
		System.out.println("开始整序验证：");
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular3= new FullDNATokenPDI_XCDX();

		pDE_RNA_FullFormular3.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular3.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();	

		System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormularNew.pde);//pde加成
		pDE_RNA_FullFormular3.doFullSessionKeyUnPress(pDE_RNA_FullFormularNew.pde, pDE_RNA_FullFormular3, true);
		System.out.println();
		System.out.println("得到原续降元元基DNA序列："+ pDE_RNA_FullFormularNew.pds);
		System.out.println("得到后续降元元基DNA序列："+ pDE_RNA_FullFormular3.pds);
		System.out.println("验证正确？");
		System.out.println(pDE_RNA_FullFormularNew.pds.equals(pDE_RNA_FullFormular3.pds)? "正确": "失败");	
		System.out.println("准备整序计算元基DNA序列："+ pDE_RNA_FullFormularNew.pde);
		System.out.println("准备整序计算元基DNA序列："+ pDE_RNA_FullFormular3.pde);
		System.out.println(pDE_RNA_FullFormularNew.pde.equals(pDE_RNA_FullFormular3.pde)? "正确": "失败");		
		return pDE_RNA_FullFormular3;
	}
}
