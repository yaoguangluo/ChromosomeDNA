package SEM.bloom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import VPC.transaction.PdeSwapFix;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapV_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
 
	//PdeSwap{
	public String PdeSwapPdcToPde(String pdc, String lock, String de, String ds, String ie, String is);
	public String PdeSwapPdcToPds(String pdc, String lock, String de, String ds, String ie, String is);
	//刚检查pds to pde 似乎被猫腻了，我测试下
	//罗瑶光 MPOASCEV
	public String PdeSwapPdeToPds(String pds, String lock, String de, String ds, String ie, String is);
	//把FullDNATokenPDI 类里 do_PDE_RNA_FullFormular_Back 函数中的 SCEV MPOA 注释的部分 分出来到在这里。
	//罗瑶光 VECSAOPM
	public String PdeSwapPdsToPde(String pds, String lock, String de, String ds, String ie, String is);
	//PdeSwapFix{
	public String PdeSwapFixpdcToPde(String pdc, String lock, String de, String ds, String ie, String is);
	public String PdeSwapFixpdcToPds(String pdc, String lock, String de, String ds, String ie, String is);

	//刚检查pds to pde 似乎被猫腻了，我测试下
	//罗瑶光 MPOASCEV
	public String PdeSwapFixpdeToPds(String pds, String lock, String de, String ds, String ie, String is);

	//把FullDNATokenPDI 类里 do_PDE_RNA_FullFormular_Back 函数中的 SCEV MPOA 注释的部分 分出来到在这里。
	//罗瑶光 VECSAOPM
	public String PdeSwapFixpdsToPde(String pds, String lock, String de, String ds, String ie, String is);
	public String PdeSwapFixtextToPdw(FullDNATokenPDI pDE_RNA_FullFormular, String password) ;
	public String PdeSwapFixpdwToPdc(FullDNATokenPDI pDE_RNA_FullFormular) ;
	//下面这个test demo 展示了 密码-> 肽文-> 肽锁+肽密码-> 密钥,pds和pde密码 -> pds转pde验证-> pde转pds验证
	//全部封装成函数
	//罗瑶光 20210830
	public static void main(String[] argv) {
		FullDNATokenPDI pDE_RNA_FullFormular= new FullDNATokenPDI();
		pDE_RNA_FullFormular.text= "控制吸收";
		pDE_RNA_FullFormular.pdw= PdeSwapFix.textToPdw(pDE_RNA_FullFormular, pDE_RNA_FullFormular.text);
		pDE_RNA_FullFormular.code= PdeSwapFix.pdwToPdc(pDE_RNA_FullFormular);
		System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
		System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
		System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
		////////////////////////////////////////////////////
		pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
		System.out.println("静态肽展降元概率钥匙E: "+ pDE_RNA_FullFormular.pdedeKey);
		System.out.println("静态肽展降元概率钥匙S: "+ pDE_RNA_FullFormular.pdedsKey);
		System.out.println("静态肽展降元: "+ pDE_RNA_FullFormular.pds);
		System.out.println("静态肽展增元概率钥匙E: "+ pDE_RNA_FullFormular.pdeieKey);
		System.out.println("静态肽展增元概率钥匙S: "+ pDE_RNA_FullFormular.pdeisKey);
		System.out.println("静态肽展增元: "+ pDE_RNA_FullFormular.pde);
		//////////////////////////////////////////////////////
		pDE_RNA_FullFormular.time= "" + System.currentTimeMillis();
		pDE_RNA_FullFormular.cacheId= "ID" + Math.random() + ":" + Math.random();
		System.out.println("时间:  " + pDE_RNA_FullFormular.time);
		System.out.println("账号随机缓存字符串:  " + pDE_RNA_FullFormular.cacheId);
		/////////////////////////////////////////////////////
		pDE_RNA_FullFormular.session_key= pDE_RNA_FullFormular.pde;
		System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
		System.out.println("=============================================================================");
		System.out.println("开始前序验证：");
		System.out.println("开始Session解析： " + pDE_RNA_FullFormular.session_key);
		System.out.println("开始概率钥匙解析：" + pDE_RNA_FullFormular.pdedeKey+ pDE_RNA_FullFormular.pdedsKey
				+ pDE_RNA_FullFormular.pdeieKey+ pDE_RNA_FullFormular.pdeisKey);
		/////////////////////////////////////////////////
		FullDNATokenPDI pDE_RNA_FullFormular1= new FullDNATokenPDI();
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

		/////////////////////////////////////////
		System.out.println("=======================================================================");
		System.out.println("开始pde降元验证：");
		FullDNATokenPDI pDE_RNA_FullFormular2= new FullDNATokenPDI();
		pDE_RNA_FullFormular2.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular2.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();
		System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormular1.pde);
		String pds= PdeSwapFix.pdeToPds(pDE_RNA_FullFormular1.pde, "",  pDE_RNA_FullFormular2.pdedeKey
				,  pDE_RNA_FullFormular2.pdedsKey
				,  pDE_RNA_FullFormular2.pdeieKey
				,  pDE_RNA_FullFormular2.pdeisKey);
		System.out.println("pds");
		System.out.println("pds");
		System.out.println(pDE_RNA_FullFormular1.pds);
		System.out.println(pds);
		//////////////////////////////////////////////////////////////////
		System.out.println("开始pds增元验证：");
		FullDNATokenPDI pDE_RNA_FullFormular3= new FullDNATokenPDI();
		pDE_RNA_FullFormular3.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular3.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();

		String pde= PdeSwapFix.pdsToPde(pDE_RNA_FullFormular1.pds, "",  pDE_RNA_FullFormular3.pdedeKey
				, pDE_RNA_FullFormular3.pdedsKey
				, pDE_RNA_FullFormular3.pdeieKey
				, pDE_RNA_FullFormular3.pdeisKey);
		System.out.println("pde");
		System.out.println("pde");
		System.out.println(pDE_RNA_FullFormular1.pde);
		System.out.println(pde);
	}

	//DetaDBUtil {
	public String DetaDBUtilDBRequest(String request) throws IOException ;
	public String DetaDBUtilbackEndRequest(String request) throws IOException ;
	public String DetaDBUtilcacheRequest(String request) throws IOException ;
	public void IV_CulumnNameType() ;
	public boolean withoutCulumnNameType(String culumnTypeString) ;

	// DetaFrontEndUtil {
	public String DetaFrontEndUtilbackEndRequest(String request) throws IOException;
	//先不动 稍后归纳 华瑞集rest走 前端还是后端还是数据库。
	public String DetaFrontEndUtilhuaRuiJiRequest(String request) throws IOException ;
	public String DetaFrontEndUtilcacheRequest(String request) throws IOException ;

	//DetaUtil {
	public void IV_DB(String dbConfigPath);

	//GzipUtil {
	// 压缩
	public byte[] compress(byte[] data) throws IOException;
	public byte[] compress(String str, String stringTypes) throws IOException;
	public byte[] uncompress(byte[] data) throws IOException;
	//jogl 画图略
}
