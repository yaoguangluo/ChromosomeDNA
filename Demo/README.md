##### 权限申明

	1 前六章（分词， 排序 ，卷积 ，路径， 数据库， ETL， 变换）早期著作权版本是apache2.0开源，需要严谨的refer 即可使用。                    

	2 一切涉及元基索引的技术 （元基非卷积腐蚀视觉，元基罗盘，肽展公式，元基加密，元基编码解码，元基花，一次新陈代谢，二次新陈代谢等，PLETL shell）使用都要 GPL2.0 开源。                   

	3 如果 前六章 使用 元基索引 GPL2.0 技术，又不想 开源代码，可以插件模式调用华瑞集 jar。                     

	4 一切涉及元基索引的 GPL2.0 技术翻译成C， c++，go，python等计算机语言使用， 需要查询版权，在先权归属，严谨的refer，并告知作者请求授权。并 GPL2.0 开源。  
	
	5举个例子，比如分词V 10.6.1 版本，早期我用APACHE2.0开源，之后我改成了GPL2.0（commit时间戳记录标识）：       
	5.1 早期的 直接下了改 商业用 没问题。 要公开严谨refer 告知作者。否则视为侵权。  之后的 按GPL2.0来。                  
	5.2 早期的 直接下了改商业用 并翻译成其他计算机语言也 没问题。 要公开严谨refer 告知作者。否则视为侵权。  之后的 按GPL2.0来。 
	5.2.1 早期的 已申请的著作权的闭源产品，在之后的时间出现新的著作权产品发布，改编，升级依旧含有分词，必须GPL2.0开源，告知作者。否则视为侵权。          
	5.3 直接下了改商业用 并用元基催化技术改， 就得GPL2.0开源。要公开严谨refer 告知作者。否则视为侵权。                     
	5.4 直接下了改商业用 并用元基催化技术改， 又不想GPL2.0开源 。 就只能用华瑞集染色体插件包import方式。 要公开严谨refer 告知作者。否则视为侵权。                 
	5.5 直接下了改商业用 并用元基催化技术改， 还翻译成其他计算机语言， 属于著作权销售转让租用范畴。请求作者授权，同时GPL2.0开源。否则视为侵权。                  


##### 文件资源
	1 jar： https://github.com/yaoguangluo/ChromosomeDNA/blob/main/BloomChromosome_V19001_20220108.jar
	2 book 《DNA元基催化与肽计算 第四修订版 V00919》上下册
	https://github.com/yaoguangluo/ChromosomeDNA/tree/main/元基催化与肽计算第四修订版本整理

	3 函数在git的存储地址：demos
	Github：https://github.com/yaoguangluo/ChromosomeDNA/
	Coding：https://yaoguangluo.coding.net/public/YangLiaoJingHuaRuiJi/YangliaojingHuaruiji/
	Bitbucket：https://bitbucket.org/luoyaoguang/yangliaojing/
	Gitee：https://gitee.com/DetaChina/

#### 使用方法
	Demo真实例子 基于 https://github.com/yaoguangluo/ChromosomeDNA/blob/main/BloomChromosome_V19001_20220108.jar 使用举例。 
  
#### 注意
	1 注意看下工程 SETTING文件，避免乱码。作者ECLIPSE IDE 仅仅涉及 UTF8 和 GBK 2种字符集编码 。
	2 工程与源码部署 开发文档 都清晰的归纳在 api 对应的 docx 文件中，见其目录。
 
#### 1 直接调用模式
##### 1.1 极速微分催化排序 top5代
	//已经测试通过 联想Y7000 单机 排序每秒double 1150万峰值数组。
	private int partition(double[] array, int leftPoint, int rightPoint) {
		double x= array[leftPoint]<= array[rightPoint]? array[leftPoint]: array[rightPoint];
		int leftPointReflection= leftPoint;
		while(leftPointReflection< rightPoint){
			while(!(array[leftPointReflection]> x|| leftPointReflection++ >= rightPoint)) {}
			while(array[rightPoint--]> x) {}
			if(leftPointReflection< ++rightPoint){
				double temp= array[rightPoint];
				array[rightPoint]= array[leftPointReflection];
				array[leftPointReflection]= temp;
			}
		}
		array[leftPoint]= array[rightPoint];
		array[rightPoint]= x;
		return rightPoint;
	}
###### 1.1.1 极速中文催化分词
	//已经测试通过 联想Y7000 单机 每秒分词 1630万峰值 中文字。 
	CogsBinaryForest_AE _A= new CogsBinaryForest_AE();//获取分词引擎
	_A.IV_Mixed();
	List<String> sets= new ArrayList<>();
	sets= _A.parserMixedString("你好，世界！");//分词
	Iterator<String> iterator= sets.iterator(); //得到分词的Iterator数列
	//... ...
###### 1.1.1.1 极速中文催化分词	 繁体字混合的例子
	//已经测试通过 联想Y7000 单机
	public static void main(String[] argv) throws IOException {
		CogsBinaryForest_AE _A= new CogsBinaryForest_AE();//获取分词引擎
		_A.IV_All();//函数里面有注释，按着简体中文，繁体中文 的例子 加其他的语言扩展。切词方法要注意，源码是4字长度MAx
		List<String> sets= new ArrayList<>();
		sets= _A.parserMixedString("你好，世界！請在這輸入廣告詞優化");//带繁体字的混合分词
		Iterator<String> iterator= sets.iterator(); //得到分词的Iterator数列
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
###### 1.1.2  词频 词性分析
	//已经测试通过
	public static void main(String[] argv) throws IOException {	
		List<String> list= new StaticFunctionMapA_VECS_E().frequencyReader("君不见黄河之水天上来，奔流到海不复还");
		Iterator<String> iterator= list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		list= new StaticFunctionMapA_VECS_E().posReader("君不见黄河之水天上来，奔流到海不复还");
		iteraor= list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}	
	} 
##### 1.2 极速象契拼音笔画排序
	//已经测试通过 联想Y7000 单机
	public static void main(String[] argv) throws IOException {
		String[] strings1D= new String[16];
		strings1D[0]= "dh罗31韵律";
		strings1D[1]= "dh罗11瑶林";
		strings1D[2]= "dh罗2瑶光";
		strings1D[3]= "dh罗4韵律";
		strings1D[2]= "dh罗2尧光";
		strings1D[3]= "dh罗4运律";
		strings1D[4]= "dh罗6瑶d林";
		strings1D[5]= "dh罗瑶0.6光";
		strings1D[6]= "dh罗瑶0.3f光";
		strings1D[7]= "dh罗瑶0.61e7光";
		strings1D[8]= "dh罗瑶0.3e61光";
		strings1D[9]= "dh罗瑶0.3e6光";
		strings1D[10]= "dh罗瑶0.6e2光";
		strings1D[11]= "dh罗瑶0.3e1光";
		strings1D[12]= "dh罗韵111.21律";
		strings1D[13]= "dh罗韵15.21律";
		strings1D[14]= "dh罗瑶g林";
		strings1D[15]= "dhv罗1.09瑶光";
		StaticFunctionMapU_VECS_C.笔画拼音排序稍后进行把传参设计下(strings1D);

		/*输出结果
		 * 
		 *
	dh罗瑶0.3e1光
	dh罗瑶0.3e6光
	dh罗瑶0.3e61光
	dh罗瑶0.3f光
	dh罗瑶0.6光
	dh罗瑶0.61e7光
	dh罗瑶0.6e2光
	dh罗瑶g林
	dh罗韵111.21律
	dh罗韵15.21律
	dh罗11瑶林
	dh罗2尧光
	dh罗31韵律
	dh罗4运律
	dh罗6瑶d林
	dhv罗1.09瑶光

		 * 
		 * */
	}

##### 1.3 启动ETL
    	//调通了下，不要使用老接口，建议写新的节点。参照已有的 image read节点即可。
    	GUISample gUISample= new GUISample();
	App app= new App();
	app.gUISample= gUISample;
	//
	CogsBinaryForest_AE _A= new CogsBinaryForest_AE();
	_A.IV_Mixed();
	Map<String, String> pos= _A.getPosCnToCn();
	JTextPane text= new JTextPane();
	app.jTabbedpane= new DetabbedPane(0, 0, null);
	gUISample.IV_(new Object[10][10], text, app, _A, pos);
	gUISample.start();	
	gUISample.validate();
	//
	JFrame jFrame= new JFrame();
	jFrame.add(gUISample);
	jFrame.setSize(1490, 980);
	jFrame.setVisible(true);
	
##### 1.4 VPCS 服务器见 StaticFunctionMapC_AOPM_E 文件，含有丰富的启动集 。
###### 1.4.1 DNA 加密 TOKEN
	//已经测试通过 联想Y7000 单机
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
	
###### 1.4.2 DNA 非对称加密 前中后序 PDS 验证示例。
	//已经测试通过 联想Y7000 单机
	@SuppressWarnings("unused")
	public static void main(String[] argv) {
		String string= "罗瑶光";
		String pdw=  StaticFunctionMapA_IDUQ_C.getPDW(string);
		String lock= StaticFunctionMapA_IDUQ_C.getLock();
		String code= StaticFunctionMapA_IDUQ_C.getCode(pdw, lock);
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular= new FullDNATokenPDI_XCDX();
		pDE_RNA_FullFormular.pdw= pdw.toString();
		pDE_RNA_FullFormular.lock= lock.toString();
		pDE_RNA_FullFormular.code= code.toString();
		pDE_RNA_FullFormular= StaticFunctionMapA_IDUQ_C.doPDE(pDE_RNA_FullFormular);
		FullDNATokenPDI_XCDX pDE_RNA_FullFormularNew= StaticFunctionMapA_IDUQ_C.doPrefixPDE(pDE_RNA_FullFormular);
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular2= StaticFunctionMapA_IDUQ_C.doPostfixPDE(pDE_RNA_FullFormular
				, pDE_RNA_FullFormularNew);
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular3= StaticFunctionMapA_IDUQ_C.doSurffixPDE(pDE_RNA_FullFormular
				, pDE_RNA_FullFormularNew);
	}

##### 1.5 普通数据计算  函数太多 见 SEM.bloom 下 StaticClassMap 文件，有上千函数的分类索引对应地址描述如 《卷积计算集》，《坐标计算集》，《数据变换集》。
###### 1.5.1 DNN 读心术
	//测试成功了，稍后优化。
	@SuppressWarnings("unused")
	public static void main(String[] argv) throws InstantiationException, IllegalAccessException, IOException {
		String string= StableString.text1;
		String[][] string1= new StaticFunctionMapP_VECS_E().aNNTest(string);	
		String[][] string2= new StaticFunctionMapP_VECS_E().dNNTest(string);	
		String[][] string3= new StaticFunctionMapP_VECS_E().rNNTest(string);	
		String[][] string4= new StaticFunctionMapP_VECS_E().sensingTest(string);	

		String[] strings= new String[3];
		strings[0]= StableString.text1;
		strings[1]= StableString.text2;
		strings[2]= StableString.text3;
		new StaticFunctionMapP_VECS_E().educationLevelTest(strings);	
		new StaticFunctionMapP_VECS_E().literarinessLevelTest(strings);	
		new StaticFunctionMapP_VECS_E().successICATest(strings);	
	}
	
###### 1.5.1 非卷积图片识别
	//已经测试通过 联想Y7000 单机
	//需要设计采样图片数据生成。
	public static void main(String[] argv) throws IOException {
		String[] string= new String[5];
		string[0]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt";
		string[1]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt";
		string[2]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_jian_17.txt";
		string[3]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_suan_17.txt";
		string[4]= "C:\\Users\\Lenovo\\Desktop\\deciphering\\线状苔藓-结节性硬化症叶状白斑_脏数据.jpg";
		new StaticFunctionMapI_VECS_E().staticMain(string);
	}
	
##### 1.6 带精度打分搜索
	//已测试， 结果正确
	public static void main(String[] argv) throws IOException {	
		ArrayList<String> 标题= new ArrayList<String>();
		Map<String, String> 内容= new HashMap<>();
		double lookrot= 0;
		标题.add("罗瑶光");
		标题.add("罗瑶林");
		标题.add("罗韵律");
		标题.add("罗振友");
		标题.add("罗振兴");
		
		内容.put("罗瑶光","罗瑶光luoyaoguang");
		内容.put("罗瑶林","罗瑶林luoyaolin");
		内容.put("罗韵律","罗韵律luoyunlv");
		内容.put("罗振友","罗振友luozhenyou");
		内容.put("罗振兴","罗振兴luozhenxin");
		
		String searchkey= "罗瑶光";
		List<Object[]> outputList = new StaticFunctionMapQ_VECS_E().searchFromTablewithScale(searchkey, 标题, 内容, lookrot);
		Iterator<Object[]> iterator= outputList.iterator();
		while(iterator.hasNext()) {
			Object[] object= iterator.next();
			for(int i= 0; i<object.length; i++) {
				System.out.println(object[i].toString());
			}
		}
		searchkey= "罗瑶";
		outputList = new StaticFunctionMapQ_VECS_E().searchFromTablewithScale(searchkey, 标题, 内容, lookrot);
		iterator= outputList.iterator();
		while(iterator.hasNext()) {
			Object[] object= iterator.next();
			for(int i= 0; i<object.length; i++) {
				System.out.println(object[i].toString());
			}
		}
		
		searchkey= "罗振";
		outputList = new StaticFunctionMapQ_VECS_E().searchFromTablewithScale(searchkey, 标题, 内容, lookrot);
		iterator= outputList.iterator();
		while(iterator.hasNext()) {
			Object[] object= iterator.next();
			for(int i= 0; i<object.length; i++) {
				System.out.println(object[i].toString());
			}
		}
	}

#### 2 元基花调用模式 真实用例
	//已经测试通过 联想Y7000 单机
	public class App_XCDX {	
		public App app;
		public void IV_(App app) {
			this.app= app;
		}
	
	public JTextField nameFeelFilter() throws Exception {	
	//传参因子[0]= "string";//准备传参索引调用模式来记忆编码。
		//传参因子[1]= "x";
		//传参因子[2]= "y";
		//传参因子[3]= "c";
		String callFunctionKey= "CfxTextField";
		StaticRootMap.initMap();
		String[] strings= new String[1];
		Map<String, Object> output= new HashMap<>();
		Map<String, Object> inputValue= new HashMap<>(); 
	//稍后准备将staticClassMap 移到 StaticFunctionMapM_VECS_C 下， 24组相关配置全部改下。这样代码就少了，就快了。
		String[] 传参因子= StaticFunctionMapM_VECS_C.annotationMap.get(callFunctionKey).split(":");
		inputValue.put(传参因子[0], null);
		inputValue.put(传参因子[1], 0);
		inputValue.put(传参因子[2], 0);
		inputValue.put(传参因子[3], null);
		output.put("传参因子", 传参因子);
		output.put("inputValues", inputValue);	
		strings[0]= "执行 M_VECS 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
		StaticRootMap.tinShellV003(strings, output);
	//取花语计算数据	
		@SuppressWarnings("unchecked")
		Map<String, Object> map= (Map<String, Object>) output.get(callFunctionKey);
		map.get("interfaceReturn");
	//数据对接
		app.nameFeelFilter= (CfxTextField) map.get("interfaceReturn");;  
		app.nameFeelFilter.setBounds(180-50, 50, 380, 80);
		app.nameFeelFilter.setBackground(Color.white);
		app.nameFeelFilter.setText(StableTag.STRING_SPACE);
		app.nameFeelFilter.addKeyListener(app);
		return app.nameFeelFilter;
	}
##### 2.1 极速象契催化分词
##### 2.2 极速象契拼音笔画排序
##### 2.3 启动ETL
##### 2.4 VPCS 服务器                      
##### 2.5 普通数据计算，将上面的 main 对应的接口 通过   tinShellV003 接口调用即可。  如下面的实例。               
	//已经测试通过 联想Y7000 单机
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
             
