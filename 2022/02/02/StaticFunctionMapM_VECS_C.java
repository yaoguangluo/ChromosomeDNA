package SEM.bloom;

import java.io.BufferedReader; 
import java.io.File;
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

import org.json.JSONObject;
import com.sun.java.accessibility.util.Translator;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ME.APM.VSQ.App;
import MVQ.button.CfxButton;
import MVQ.label.DetaLabel;
import MVQ.tableRender.ColorTableRender;
import MVQ.textpane.CfxTextPane;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OEI.ME.analysis.E.CogsBinaryForest_AE; 
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row; 
import OSI.AOP.MEC.SIQ.plorm.PLORM_C; 
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse; 
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts; 
//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapM_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	//database
	//static
	//U_JoinRows_E {
	public Object updateRowsByAttributesOfJoinCondition(Map<String, Object> object
			, boolean mod) throws IOException;
	public Object updateRowsByAttributesOfJoinAggregation(Map<String, Object> object, boolean mod);
	public Object updateRowsByAttributesOfJoinGetCulumns(Map<String, Object> object);
	public Object updateRowsByAttributesOfJoinRelation(Map<String, Object> object, boolean mod);

	//Q_JoinRows_E {
	public Object selectRowsByAttributesOfJoinCondition(Map<String, Object> object) throws IOException ;
	public Object selectRowsByAttributesOfJoinAggregation(Map<String, Object> object) ;
	public Object selectRowsByAttributesOfJoinGetCulumns(Map<String, Object> object) ;
	public Object selectRowsByAttributesOfJoinRelation(Map<String, Object> object) ;

	//IU_Rows_E {
	public Map<String, Object> insertRowByTablePathAndIndex(String tablePath, String pageIndex
			, JSONObject culumnOfNewRow) throws FileNotFoundException, IOException;
	public Map<String, Object> insertRowByBaseName(String baseName, String tableName
			, JSONObject jsobj, boolean mod) throws Exception;
	public void IU_RowByAttributes(Map<String, Object> object, boolean mod) throws Exception;

	//I_Tables_E {
	public void I_Table(Map<String, Object> object, boolean mod) throws Exception;

	//D_Rows_E {
	public Map<String, Object> deleteRowByTablePathAndIndex(String tablePath, String pageIndex
			, boolean mod)throws FileNotFoundException, IOException;
	public void D_RowByAttributesOfCondition(Map<String, Object> object, boolean mod) throws IOException;


	//U_Rows_E {
	public Map<String, Object> updateRowByTablePathAndIndex(String tablePath, String pageIndex
			,JSONObject jaculumnOfUpdateRow) throws FileNotFoundException, IOException;
	public Map<String, Object> updateRowByTablePathAndAttribute(String tablePath, String culumnName
			, String culumnValue, JSONObject jobj) throws IOException;
	public Object updateRowsByRecordConditions(Map<String, Object> object, boolean mod) throws IOException;
	public Object updateRowsByAttributesOfCondition(Map<String, Object> object, boolean mod) throws IOException;
	public List<Map<String, Object>> updateRowsByAttributesOfAggregation(Map<String, Object> object, boolean mod);
	public Object updateRowsByAttributesOfGetCulumns(Map<String, Object> object) ;

	//E_PLSQL_E {
	public Map<String, Object> E_PLSQL(String plsql, boolean mod) throws Exception;
	public Map<String, Object> E_PLORM(PLORM_C orm, boolean b) throws Exception;

	//P_AggregationPLSQL {
	public void P_AggregationLimitMap(String[] sets, List<Map<String, Object>> output);

	//P_ConditionPLSQL_XCDX_Cache extends P_ConditionPLSQL_XCDX {
	public void P_Cache(String[] sets, List<Map<String, Object>> output, String tableName
			, String baseName, Map<String, Object> object);

	//P_ConditionPLSQL_XCDX_Kernel extends P_ConditionPLSQL_XCDX {
	//比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
	//这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后朔源.
	//准备验算下20210406 罗瑶光
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile
			, File readDBTableRowIndexFile, BufferedReader reader, String DBTableRowIndexPath
			, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException;

	//P_ConditionPLSQL_XCDX_Map extends P_ConditionPLSQL_XCDX {
	//以后优化成统一对象输出，不需要再转换。2019-1-15 tin
	public Map<String, Object> rowToRowMap(Row row);
	public void P_Map(String[] sets, List<Map<String, Object>> output, String dBTablePath);

	//P_ConditionPLSQL_XCDX_Table extends P_ConditionPLSQL_XCDX {
	//plsql引擎函数获取表开始检查 罗瑶光 20210405  //奇怪了 这是一个没有读 缓存的plsql引擎,我准备对比下history
	//object 指令堆栈
	//output 数据行
	public void P_Table(String[] sets, List<Map<String, Object>> output, String DBTablePath
			, Map<String, Object> object) throws IOException;

	//P_GetCulumnsPLSQL {
	public Object getCulumnsMapWithAs(String[] sets, Map<String, Object> row);
	public Object getCulumnsMap(String[] sets,  Map<String, Object> row);
	public Object P_GetCulumnsMap(List<Map<String, Object>> obj, String[] getCulumnsValueArray);

	//P_RelationPLSQL {
	public void P_AndMap(String[] sets, List<Map<String, Object>> obj, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj);

	public void P_OrMap(String[] sets, List<Map<String, Object>> obj, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj, Map<String, Boolean> findinNewObj);

	//PLSQLCommand_E {
	public void P_SetRoot(String[] acknowledge, Map<String, Object> output) throws Exception;
	public void P_BaseName(String[] acknowledge, Map<String, Object> object);
	public void P_TableName(String[] acknowledge, Map<String, Object> object);
	public void P_ListNeedStart(String[] acknowledge, Map<String, Object> object);
	public void P_Join(String[] acknowledge, Map<String, Object> object);
	public void P_E(String[] acknowledge, Map<String, Object> object, boolean mod) throws Exception;
	//plsql函数执行指令 正在检查中 罗瑶光 20210405
	public void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception;

	//WordForestUtil {
	public void wordsForestNotContainsKey(Map<String, WordFrequency> outputList
			, String countWordNode, StringBuilder[] prefixWord);
	public void prefixWordEqualZero(Map<String, WordFrequency> outputList
			,String countWordNode, StringBuilder[] prefixWord);
	public void wordsForestContainsKey(Map<String, WordFrequency> outputList
			,String countWordNode, StringBuilder[] prefixWord);

	//WordFrequencyUtil {
	public void WordFrequencyFindCheck(Map<String, WordFrequency> outputList
			,StringBuilder[] fixWords) ;
	public void WordFrequencyCompareCheck(Map<String, WordFrequency> outputList
			, StringBuilder[] fixWords, String countWordNode) ;

	//SessionValidation{
	//序列检查, 用于并发条件下又没有缓存服务器额情况下.
	//用户注意, FullDNATokenPDI 是我目的用来做DNA搜索的, 在dna加密这里也可以用, 但是, 如果要用, 请谨慎修改.
	public boolean sessionCheck(Token token, TokenCerts tokenCerts);

	//序列使用一次便更新重置
	public Token sessionTokenUpdateByDNA(String password);

	//序列初始生成
	//可以将密码和时间都加载在这个humanWordsPassword中, 这样时间就不需要比对了.
	//我建议是码农别偷懒.
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(String humanWordsPassword
			, boolean bys, String lockBys);
	//区别上面非etl，稍后去重 罗瑶光20211107 用到initonETLSect;
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA_ETL(String humanWordsPassword
			, boolean bys, String lockBys) ;

	//序列PDI初始生成走非Util函数
	public Token sessionInitByTokenPDICertsDNA(TokenCerts tokenCerts);
	//序列初始生成
	public Token sessionInitByTokenCertsDNA(TokenCerts tokenCerts) ;

	//序列 正序密文检查
	public boolean sessionCheckWithOrderPDSKey(Token token, TokenCerts tokenCerts) ;

	//序列 反序密文检查
	public boolean sessionCheckWithPostPDSKey(Token token, TokenCerts tokenCerts);

	//ArrayValidation{
	//以后 validation大体包括 check和fix， 2个部分。
	public boolean arrayIntCheck(int[] array, int min, int max);
	public int[] arrayIntFix(int[] array, int min, int max);
	public boolean arrayLongCheck(long[] array, long min, long max);
	public long[] arrayLongFix(long[] array, long min, long max);
	public boolean arrayDoubleCheck(double[] array, double min, double max);
	public double[] arrayDoubleFix(double[] array, double min, double max);
	public boolean arrayFloatCheck(float[] array, float min, float max);
	public float[] arrayFloatFix(float[] array, float min, float max);

	//DateValidation{
	public boolean currentSystemTimeCheck(long offsetUTC8, long miliSecondsDistinction) throws IOException;
	public long currentSystemTimeToUTC(long offsetUTC8);

	//Translator
	public Translator getTranslator();

	//ListValidation{
	public boolean ListSetsCheck(List<Object> list, String setsType) ;
	public List<Object> ListSetsFix(List<Object> list, String setsType);

	//MatrixValidation{
	public boolean matrixCheck(Object[][] objects, String attribute);
	public Object[][] matrixFix(Object[][] objects, String attribute);

	//NullObject{
	public String checkNULL(Object object);
	public CfxButton getCfxButton(String string, final int x, final int y, java.awt.Color c);

	//今天描述下这个文件，早期张新杰给我一个csharp的按钮边框闪烁波纹，
	//我在美国被 卡拉森让牛怡然 给我把联想电脑格了，我在2014年设计etl的 分割按钮界面的时候
	//谷歌搜索的stackoverflow 有 甲骨文sun的官方 demo怎么设计 动态画组件。
	//于是我设计了最早的detasplit 组件，那时候我肋感神经剧烈疼痛,搞了2个月就停止了
	//一停止我就不痛了，莫名前妻那时候让我去波音面试还//后来在画板中画节点的边缘画了比较丑的边缘。
	//，后来2016-7年之后我开始设计这个组件。, 最后一次和张新杰说话是201几年
	//一次我问 在国内普通ip怎么发布网站，他回我一句 花生壳，就把我给删了。
	public MVQ.button.DetaButton DetaButton(String string, final int x, final int y, java.awt.Color c);
	public MVQ.button.YLJShowButton YLJShowButton(String string, final int x, final int y, java.awt.Color c);

	//DetaIndexLabel extends JLabel implements MouseListener{
	public MVQ.label.DetaIndexLabel DetaIndexLabel(String name, List<DetaLabel> jFrameList);
	//DetaLabel extends JLabel{

	public MVQ.label.DetaLabel DetaLabel(String name);

	//DetaSlider extends JSlider{
	public MVQ.slider.DetaSlider DetaSlider(final int x, final int y); 

	//MVQ.tabbedpane 
	public MVQ.tabbedpane.DetabbedPane DetabbedPane(final int x, final int y, java.awt.Color c);

	//ColorTableRender
	public ColorTableRender getColorTableRender();

	//CfxTextArea extends JTextArea {
	public MVQ.textarea.CfxTextArea CfxTextArea(String string, final int x, final int y, java.awt.Color c);


	//MVQ.textfield;
	public MVQ.textfield.CfxTextField CfxTextField(String string, final int x, final int y, java.awt.Color c);

	//MVQ.textpane;
	public CfxTextPane CfxTextPane(String string, final int x, final int y, java.awt.Color c); 

	//vpcs

	//Forward_V extends ServerForward_Standard{
	public void forwardToRestMap(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception;

	//RestMap_V extends ServerRestMap_Standard {
	public void P_Rest(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception;	
	public void P_RestDB(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception;

	//RestMap extends ServerForward_Standard{
	public void P(String[] type, Socket socket, CogsBinaryForest_AE _A, EmotionMap emotionMap) throws IOException;

	//un static
}
