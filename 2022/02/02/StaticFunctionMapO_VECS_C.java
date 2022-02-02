package SEM.bloom;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OSA.shell.PL_XA_E;
import OSA.shell.XA_ShellTable;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapO_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 

	public void SortStringDemo(); //稍后重命名
	//TransactionDelegate {逻辑型 应用接口略。
	public Map<String, Object> transactionLogin(String uEmail, String uPassword)throws Exception ;
	public Map<String, Object> transactionRegister(String uEmail, String uEmailEnsure
			, String uName, String uPassword, String uPassWDEnsure, String uAddress
			, String uPhone, String uWeChat, String uQq, String uAge,String uSex) throws Exception;

	//养疗经读表函数
	//DBReadMode{
	public void aCommonReadWay(App app) throws IOException ;
	public void readDBInTXTWay(App app) throws IOException;
	public void readDBInBaseWay(App app) throws IOException;
	public void readDBInWebWay(App app) ;

	public OPM.ESU.admin.PLSQLSectionPanel PLSQLSectionPanel(App app);
	public OPM.ESU.admin.VPCSRestPanel  VPCSRestPanel(App app);
	public OPM.ESU.admin.YouBiaoSectionPanel YouBiaoSectionPanel(App app);

	//plsearchShell
	public OSA.shell.PL_XA_C PL_XA_C();
	// XA_ShellQ_JoinRows_E {
	public Object selectRowsByAttributesOfJoinCondition(Map<String, Object> object) throws IOException;
	public Object selectRowsByAttributesOfJoinAggregation(Map<String, Object> object) 
			throws InstantiationException
			, IllegalAccessException, IOException;
	public Object selectRowsByAttributesOfJoinGetCulumns(Map<String, Object> object);
	public Object selectRowsByAttributesOfJoinRelation(Map<String, Object> object);

	//XA_ShellQ_NestRows_E {
	public Object selectRowsByAttributesOfNestCondition(Map<String, Object> object) throws IOException;
	public Object selectRowsByAttributesOfNestAggregation(Map<String, Object> object)
			throws InstantiationException
			, IllegalAccessException, IOException;
	public Object selectRowsByAttributesOfNestGetCulumns(Map<String, Object> object);
	public Object selectRowsByAttributesOfNestRelation(Map<String, Object> object);

	//XA_ShellQ_Rows_E {
	public List<Map<String, Object>> selectRowsByAttribute(String currentDB
			, String tableName, String culmnName, Object value) throws IOException;
	public void XA_ShellQ_Rows_E_main(String[] args);
	//今天看了下发现我的数据库 没有分页，以后会设计一个文件夹最大为3000 rows 
	//一页，先不管了，shell 用不到sheets逻辑。
	//罗瑶光20210927
	public Map<String, Object> selectRowsByTablePath(String tablePath, String pageBegin
			, String pageEnd, String direction) throws IOException;
	//db替换shell中 20210927
	public Object selectRowsByAttributesOfCondition(Map<String, Object> object) throws IOException;
	//20210927 注释下 稍后替换
	//先设计成 plsearch 语法和 plsql 语法通用， 方便我之后的plorm 统一一种方式扩展 pladmin
	public List<Map<String, Object>> selectRowsByAttributesOfAggregation(Map<String, Object> object)
			throws InstantiationException
			, IllegalAccessException, IOException;
	public Object selectRowsByAttributesOfGetCulumns(Map<String, Object> object);
	//PLETL命令一多，之后准备分出去
	//罗瑶光 20211010
	public Object selectRowsByAttributesOfPLETL(Map<String, Object> object) throws InstantiationException
	, IllegalAccessException
	, IOException;
	public Object selectRowsByAttributesOfPLTCP(Map<String, Object> object) throws IOException;

	//XA_ShellTables{
	public Map<String, XA_ShellTable> searchShellTables= new HashMap<>();
	//先把接口做足，罗瑶光20210925
	//将表变成表映射
	public boolean addNewSearchShellTable(String tableName, JTable jtable);

	//按sonar方式重复函数分离
	public Object[] getNewSearchShellTableSpecFromDefaultTableModel(DefaultTableModel defaultTableModel) ;

	//按sonar方式重复函数分离
	public Object[][] getNewSearchShellTableDataFromDefaultTableModel(DefaultTableModel defaultTableModel) ;

	//设计个row的结合表map内存结构 用于shell的表头搜索。
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec
			, DefaultTableModel defaultTableModel) ;

	//设计个row的结合表map内存结构 用于shell的表头搜索。
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, Object[][] tableData) ;

	//将表映射变成shell映射,接口VPCS 多样化，稍后做新陈代谢用。
	public boolean addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel) ;

	//将表映射变成shell映射,接口VPCS 多样化，稍后做新陈代谢用。 object data 稍后准备 用 _S_ 元基替换。
	public boolean addNewSearchShellTableWithObjectData(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData);

	//shell映射封装
	public boolean addNewSearchShellTable(String tableName, Object[][] defaultTableData
			, Object[] defaultTableDataSpec);

	//Reflection map 表头方式存储
	//将表映射变成shell映射,接口VPCS 多样化，稍后做新陈代谢用。 object data 稍后准备 用 _S_ 元基替换。
	public boolean addNewSearchShellTableWithObjectDataReflectionDBRows(String tableName
			, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData) ;

	//Reflection map 表头方式存储
	//shell映射封装
	public boolean addNewSearchShellTableReflectionDBRows(String tableName, Row[] rows
			, Object[] defaultTableDataSpec );

	//然后所有养疗经的jtable表全部基于这个文件函数 进行shell 封装。与数据库的内存映射分离。
	public boolean addInitSearchShellTable(App app);

	//PLETL_C{
	public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
			, String documentFlowAddress, HashMap<String, Object> inputMap);	
	//ReadChinese extends Thread implements Runnable{
	public OSI.AOP.neo.tts.ReadChinese ReadChinese(App app, A _A);

	//RestMedicinePort_E {	
	public App kernel(App app, String string);

	public Map<String, Object> getMedicineBookFeedbackZY(App app,String string);

	public Map<String, Object> getMedicineBookFeedbackXY(App app,String string) ;

	public Map<String, Object> getMedicineBookFeedbackZT(App app, String string) ;

	public Map<String, Object> getMedicineBookFeedbackXT(App app, String string) ;

	public Map<String, Object> getMedicineBookFeedbackYT(App app, String string);

	public Map<String, Object> getMedicineBookFeedback(App app, String string) ;
	public Object doSearch(App app, String string) ;


	//VPC extends ServerVPC_Standard {
	//逐步分离出来，方便vpcs 之后继承。
	public String forwardDB(App app, String string, Map<String, String> data) throws Exception ;
	public String forwardVPC(App app, String string, Map<String, String> data) throws Exception ;

	//VPCBackEnd {
	//public static RestLoginPort restLoginPort;
	public String forwardVPCBackEnd(EmotionMap emotionMap, CogsBinaryForest_AE _A
			, String string, Map<String, String> data) 
					throws Exception;

	//VPCYangliaojing {
	public String forwardVPCYangliaojing(App app, String string, Map<String, String> data)throws Exception;
	public String getCode(String filePath) throws IOException;
	public String getFilePath(String string) ;

	//OSI.AOP.VPC.server 启动例子

	//PL ETL shell
	//E_pl_XA_E { 
	public Map<String, Object> E_pl_XA(String plSearch, boolean mod, Map<String, Object> output) throws Exception;
	public Map<String, Object> E_pl_XA(PL_XA_E orm, boolean b, Map<String, Object> output) throws Exception;

	//P_AO_pl_XA {
	public void P_AggregationLimitMap(String[] sets, List<Map<String, Object>> output) throws InstantiationException
	, IllegalAccessException, IOException;

	//分出去
	public void P_PletlLimitMap(String[] sets, List<Map<String, Object>> obj);
	//P_AO_PLETL {
	public void P_PletlLimitMap(String[] sets, List<Map<String, Object>> output, Map<String, Object> object) 
			throws InstantiationException, IllegalAccessException, IOException;

	//P_AO_PLTCP {
	public void P_PltcpLimitMap(String[] sets, List<Map<String, Object>> output
			, Map<String, Object> object) throws IOException;
	//P_CO_pl_XA_XCDX_Cache extends P_CO_pl_XA_XCDX {
	public void P_Cache(String[] sets, List<Map<String, Object>> output, String tableName, Map<String, Object> object
			, String condition);

	//P_CO_pl_XA_XCDX_Kernel extends P_CO_pl_XA_XCDX {
	//比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
	//这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后朔源.
	//准备验算下20210406 罗瑶光
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
			, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException;
	//P_kernel等比复制过来的search shell组件， 我要替换的是数据库储值， jtable表做output 
	//把jtable数据表的数据 变成数据库的db映射， 传入参数是dma的每一行文件的集合，
	//DefaultTableModel 的 Object[][] huaRuiJiJtable 对应 DBTablePath
	//readDBTableRowIndexFile对应 row id
	//huaRuiJiJtableCulumns 对应 culumn
	//jtable  太上层，用它的spec 速度会很慢。所以用object[][]  先
	//罗瑶光 20210924
	//出现一个问题，我的table db是非线性map 结构， 自带表头key， 而data 是矩阵，下面逻辑要全部改掉
	public void P_kernel_search(String temp, File readDBTableRowIndexFile, int rowId, Object[] huaRuiJiJtableCulumns
			, Object[][] huaRuiJiJtable, List<Map<String, Object>> output, Row bufferRow, Map<String, Object> rowMap) 
					throws IOException;

	//P_CO_pl_XA_XCDX_Map extends P_CO_pl_XA_XCDX {
	//以后优化成统一对象输出，不需要再转换。2019-1-15 tin
	public   Map<String, Object> rowToRowMap(Row row);
	//将rowToRowMap 进行逆向 RowMapToRow 一来验证，2来找最小计算模型，方便下一步表格编译计算。
	//罗瑶光202109302339
	public Row rowMapToRow(Map<String, Object> map);

	//猫腻哥 把我pmap的output 都改了， 今天一查问题全出来了。20210927
	//懒得管，把P_Map 改成 shellP_Map
	public void P_Map(String[] sets, List<Map<String, Object>> output, String tableName
			, Map<String, Object> object); 

	//P_I_CulumnsPL_XA {
	public Object getCulumnsMapWithAs(String[] sets, Map<String, Object> row);
	public Object getCulumnsMap(String[] sets,  Map<String, Object> row);
	public Object P_GetCulumnsMap(List<Map<String, Object>> obj, String[] getCulumnsValueArray);
	//P_RelationPL_XA {
	public void P_AndMap(String[] sets, List<Map<String, Object>> obj
			, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj) ;

	public void P_OrMap(String[] sets, List<Map<String, Object>> obj
			, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj
			, Map<String, Boolean> findinNewObj);

	//Pl_XA_Command_E {
	public void P_SetRoot(String[] acknowledge, Map<String, Object> output) throws Exception;

	public void P_BaseName(String[] acknowledge, Map<String, Object> object) ;

	public void P_TableName(String[] acknowledge, Map<String, Object> object);


	public void P_ListNeedStart(String[] acknowledge, Map<String, Object> object) ;

	public void P_Join(String[] acknowledge, Map<String, Object> object) ;

	public void P_E(String[] acknowledge, Map<String, Object> object, boolean mod) throws Exception;
	//处理机中心, 别急, 准备验证 罗瑶光


	//plsql函数执行指令 正在检查中 罗瑶光 20210405
	public void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception;
	public void P_StoreValues(String[] acknowledge, Map<String, Object> output);
	//之后准备设计成工厂类 或者 单例类 bean
	public void P_fileOperations(String[] acknowledge, Map<String, Object> output);

	//ShellReplace {
	public void replaceString(String fileDirectroyPath, String searchString, String needReplaceString) 
			throws IOException ;

	//稍后设计成map来存储这些String条件变量。
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, Map<String, String> conditions) throws IOException ;
	//稍后变线程
	public void start() throws IOException ;

	//文件名对应筛选
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileName) throws IOException ;
	//文件后缀筛选
	public void replaceStringWithFileType(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileType) throws IOException;

	//文件大小筛选
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString
			, String needReplaceString, long filesize_KB) throws IOException ;
	//文件大小筛选
	public void replaceStringWithFileLines(String fileDirectroyPath, String searchString
			, String needReplaceString, long beginLine, long endLine) throws IOException ;
	public void mainShellReplace(String[] argv) throws IOException;
	//设计一种简单的log模式先。
	public void replaceStringWithLogRecording(Map<String, String> conditions) throws IOException;
}
