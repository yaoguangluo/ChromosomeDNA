# ChromosomeDNA
## 该项目涉及源码 罗瑶光先生以 《GPL2.0 标准协议》 开源。     
                                           
第四修订版将包含 第三版所有内容 见： 国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)           
## 研发状态              
###### 1 元基索引花，（准备在映射map加个传参的字符串，把 变量名也标注下 20211230）。             
###### 2 听语系统，tinshell 002版本  神经元计算  <DNA元基索引ETL中文脚本编译机V0.0.2><已提交 知委流水号2021R11L2844054>	(中华人民共和国 国家版权登记中心)                            
###### 2.1 花语系统， tinshell 003版本  染色体计算 <TinShell插件_元基花模拟染色体组计算索引系统 V20211227> <已提交 知委流水号2021R11L3629232> (中华人民共和国 国家版权登记中心)          ###### 3 元基 DNN 早期计算2页，（费洛蒙更进研究略，元基声觉略，元基磁频略）。              
###### 3.1 费洛蒙计算的两页历史文件见 微信，小红书和2020年12月5日抖音 脉脉视频等媒体备份，git见 bitbucket coding gitee等lyg文件。更进研究略                           https://github.com/yaoguangluo/DNA_Chromosome_backup20210705/blob/codingbackup18801/2021/12/02/InitonPDEModel.lyg           
###### 4 十六元基进制 DCPE-THOS-MAXF-VIUQ 与元基计数器。              
###### 5 TVM 元基催化虚拟机                   
###### 6 DNA遗传元基花孢              
###### 7 元基数字电路模拟， PNP NPN 触发器设计   见第三版后序： 国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)                        
###### 8 十六进制的元基造字替换，（之前是十七进制）                    
。。。。等                             
              
最近申请的元基花的索引序列编码方式，准备下ppt，稍后我会设计个自动识别新增函数自动注册索引。 
## Demo 
#### 1 直接调用模式
##### 1.1 极速象契催化分词
##### 1.2 极速象契拼音笔画排序
##### 1.3 启动ETL
    //调通了下，不要使用老接口，建议写新的节点。参照已有的 image read节点即可。
    	GUISample gUISample= new GUISample();
	App app= new App();
	app.gUISample= gUISample;

	CogsBinaryForest_AE _A= new CogsBinaryForest_AE();
	_A.IV_Mixed();
	Map<String, String> pos= _A.getPosCnToCn();
	JTextPane text= new JTextPane();
	app.jTabbedpane= new DetabbedPane(0, 0, null);
	gUISample.IV_(new Object[10][10], text, app, _A, pos);
	gUISample.start();	
	gUISample.validate();

	JFrame jFrame= new JFrame();
	jFrame.add(gUISample);
	jFrame.setSize(1490, 980);
	jFrame.setVisible(true);	
##### 1.4 VPCS 服务器
###### 1.4.1 DNA 加密 TOKEN
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
				,  pDE_RNA_FullFormular3.pdedsKey
				,  pDE_RNA_FullFormular3.pdeieKey
				,  pDE_RNA_FullFormular3.pdeisKey);
		System.out.println("pde");
		System.out.println("pde");
		System.out.println(pDE_RNA_FullFormular1.pde);
		System.out.println(pde);
	}

##### 1.5 普通数据计算 
##### 1.6 带精度打分搜索

#### 2 元基花调用模式
##### 2.1 极速象契催化分词
##### 2.2 极速象契拼音笔画排序
##### 2.3 启动ETL
##### 2.4 VPCS 服务器                      
##### 2.5 普通数据计算                      
StaticRootMap.initMap();                      
String[] strings= new String[4];                      
strings[0]= "执行 U_VECS 下 main 接口, 参数是null";                      
strings[1]= "执行 U_VECS 下 main 接口, 参数是null";                      
Map<String, Object> output= new HashMap<>();                      
String[] 传参因子= new String[2];                      
Map<String, Object> inputValue= new HashMap<>();                       
double[] doubles= new double[5];                      
doubles[0]= 2.2222262;                      
doubles[1]= 3.2226222;                      
doubles[2]= 6.2622222;                      
doubles[3]= 4.6226222;                      
doubles[4]= 1.2222226;                      
double dou= 2.22;                      
传参因子[0]= "input";//像神一样的tin god                      
传参因子[1]= "scale";                      
inputValue.put(传参因子[0], doubles);                      
inputValue.put(传参因子[1], dou);                      
output.put("传参因子", 传参因子);                      
output.put("inputValues", inputValue);                      
strings[2]= "执行 U_AOPM 下 median1d 接口, 参数是 传参因子";                      
strings[3]= "执行 U_AOPM 下 fengTong1D 接口, 参数是 过程因子";                      
StaticRootMap.tinShellV003(strings, output);                      

##### 2.6 带精度打分搜索                       

             
罗瑶光             
             
