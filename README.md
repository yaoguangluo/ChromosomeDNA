# 《ChromosomeDNA》， 商业名称《华瑞集》， 工程名称 《元基花》，公司开源项目代号 《女娲计算》，作者喜欢称呼它为 《绽放的染色体》。
## 作者的研发动机：通过设计这个生命软件， 满足工业，农业，服务业的 大数据类 智慧计算 需求。
## 该项目涉及源码 罗瑶光先生以 《GPL2.0 标准协议》 开源。                                              
#### 研发状态
	第四修订版将包含 第三版所有内容 见： 国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)    
	1 元基索引花，（准备在映射map加个传参的字符串，把 变量名也标注下 20211230）。             
	2 听语系统，tinshell 002版本  神经元计算  <DNA元基索引ETL中文脚本编译机V0.0.2><已提交 知委流水号2021R11L2844054> (中华人民共和国 国家版权登记中心)                       
	2.1 花语系统， tinshell 003版本  染色体计算 <TinShell插件_元基花模拟染色体组计算索引系统 V20211227> <已提交 知委流水号2021R11L3629232> (中华人民共和国 国家版权登记中心)          	      3 元基 DNN 早期计算2页，（费洛蒙更进研究略，元基声觉略，元基磁频略）。              
	3.1 费洛蒙计算的两页历史文件见 微信，小红书和2020年12月5日抖音 脉脉视频等媒体备份，git见 bitbucket coding gitee等lyg文件。更进研究略                           	                       https://github.com/yaoguangluo/DNA_Chromosome_backup20210705/blob/codingbackup18801/2021/12/02/InitonPDEModel.lyg           
	4 十六元基进制 DCPE-THOS-MAXF-VIUQ 与元基计数器。              
	5 TVM 元基催化虚拟机                   
	6 DNA遗传元基花孢              
	7 元基数字电路模拟， PNP NPN 触发器设计 (如全嘌呤F 与 变嘧啶U 的 数字锁存逻辑应用)   见第三版后序： 国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)                     
	8 十六进制的元基造字替换，（之前是十七进制）                    
	9 一些细节略。 最近申请的元基花的索引序列编码方式，准备下ppt，稍后我会设计个自动识别新增函数自动注册索引。 
## Demo真实例子 基于 https://github.com/yaoguangluo/ChromosomeDNA/blob/main/BloomChromosome_V19001_20220104.jar 使用举例。 
#### 1 直接调用模式
##### 1.1 极速微分催化排序
	//已经测试通过 联想Y7000 单机 排序每秒double 1150万峰值数组。
	private int partition(double[] array, int leftPoint, int rightPoint) {
		double x= array[leftPoint]<= array[rightPoint]? array[leftPoint]: array[rightPoint];//等于号不能省，见从大到小的老版本，> 的非为 <=，已经在养疗经中测试通过。罗瑶光
		int leftPointReflection= leftPoint;
		while(leftPointReflection< rightPoint){
			//我设立个top2D , --细节竟然没有一个人关注这些细节...20210716
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
	
###### 1.1.2  词频 词性分析
	//已经测试通过
	public static void main(String[] argv) throws IOException {	
		List<String> list= new StaticFunctionMapA_VECS_E().frequencyReader("君不见黄河之水天上来，奔流到海不复还");
		Iterator<String> iteraor= list.iterator();
		while(iteraor.hasNext()) {
			System.out.println(iteraor.next());
		}
	
		list= new StaticFunctionMapA_VECS_E().posReader("君不见黄河之水天上来，奔流到海不复还");
		iteraor= list.iterator();
		while(iteraor.hasNext()) {
			System.out.println(iteraor.next());
		}	
	} 
##### 1.2 极速象契拼音笔画排序
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
	
##### 1.4 VPCS 服务器见 StaticFunctionMapC_AOPM_E 文件，含有丰富的启动集 。
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
	
###### 1.4.2 DNA 非对称加密 前中后序 PDS 验证示例。
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

#### 2 元基花调用模式
##### 2.1 极速象契催化分词
##### 2.2 极速象契拼音笔画排序
##### 2.3 启动ETL
##### 2.4 VPCS 服务器                      
##### 2.5 普通数据计算，将上面的 main 对应的接口 通过   tinShellV003 接口调用即可。  如下面的实例。               
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

## 著作权标识 & Refer      
	1.罗瑶光，罗荣武. 《DNA 元基催化与肽计算 第三修订版V039010912》. 中华人民共和国国家版权局，国作登字-2021-L-00268255. 2021.
	2.罗瑶光. 《德塔数据结构变量快速转换 V1.0》. 中华人民共和国国家版权局，软著登字第4607950号. 2019.
	3.罗瑶光. 《德塔 Socket流可编程数据库语言引擎系统 V1.0.0》. 中华人民共和国国家版权局，软著登字第4317518号. 2019.
	4.罗瑶光. 《德塔ETL人工智能可视化数据流分析引擎系统 V1.0.2》. 中华人民共和国国家版权局， 软著登字第4240558号. 2019.
	5.罗瑶光. 《德塔自然语言图灵系统 V10.6.1》. 中华人民共和国国家版权局，软著登字第3951366号. 2019.
	6.类人数据生命的DNA计算思想 Github [引用日期2020-03-05] https://github.com/yaoguangluo/Deta_Resource
	7.罗瑶光. 《Java数据分析算法引擎系统 V1.0.0》. 中华人民共和国国家版权局，软著登字第4584594号. 2014.
	8.罗瑶光. 《数据预测引擎系统 V1.0.0》. 中华人民共和国国家版权局，软著登字第5447819号. 2020.
	9.罗瑶光. 《肽展公式推导与元基编码进化计算以及它的应用发现》. 中华人民共和国国家版权局，国作登字-2021-A-00042587. 2021.
	10.罗瑶光. 《DNA催化与肽展计算和AOPM-TXH-VECS-IDUQ元基解码013026中文版本》. 中华人民共和国国家版权局，国作登字-2021-A-00042586. 2021.
	11.罗瑶光，罗荣武. 《类人DNA与 神经元基于催化算子映射编码方式 V_1.2.2》. 中华人民共和国国家版权局，国作登字-2021-A-00097017. 2021.
	12.罗瑶光，罗荣武. 《DNA元基催化与肽计算第二卷养疗经应用研究20210305》. 中华人民共和国国家版权局，国作登字-2021-L-00103660. 2021.
	13.罗瑶光. 《DNA元基索引ETL中文脚本编译机V0.0.2》. 中华人民共和国国家版权局，SD-2021R11L2844054. 2021.
	14.罗瑶光. 《TinShell插件_元基花模拟染色体组计算索引系统 V20211227》. 中华人民共和国国家版权局，SD-2021R11L3629232. 2022.



罗瑶光             
             
