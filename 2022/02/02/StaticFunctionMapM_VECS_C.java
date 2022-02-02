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
//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
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
	//�Ƚ��Ƿ�������ȡ���б���� ������ ������ 20210405
	//�����Ӳ�̲�ѯ��������ʶ��, ������������ݻ����ѯ�������� ���û�ù���, ʱ�������2019��1�º�, ���ȵ�ͨ��, ֮��˷Դ.
	//׼��������20210406 ������
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile
			, File readDBTableRowIndexFile, BufferedReader reader, String DBTableRowIndexPath
			, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException;

	//P_ConditionPLSQL_XCDX_Map extends P_ConditionPLSQL_XCDX {
	//�Ժ��Ż���ͳһ�������������Ҫ��ת����2019-1-15 tin
	public Map<String, Object> rowToRowMap(Row row);
	public void P_Map(String[] sets, List<Map<String, Object>> output, String dBTablePath);

	//P_ConditionPLSQL_XCDX_Table extends P_ConditionPLSQL_XCDX {
	//plsql���溯����ȡ��ʼ��� ������ 20210405  //����� ����һ��û�ж� �����plsql����,��׼���Ա���history
	//object ָ���ջ
	//output ������
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
	//plsql����ִ��ָ�� ���ڼ���� ������ 20210405
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
	//���м��, ���ڲ�����������û�л���������������.
	//�û�ע��, FullDNATokenPDI ����Ŀ��������DNA������, ��dna��������Ҳ������, ����, ���Ҫ��, ������޸�.
	public boolean sessionCheck(Token token, TokenCerts tokenCerts);

	//����ʹ��һ�α��������
	public Token sessionTokenUpdateByDNA(String password);

	//���г�ʼ����
	//���Խ������ʱ�䶼���������humanWordsPassword��, ����ʱ��Ͳ���Ҫ�ȶ���.
	//�ҽ�������ũ��͵��.
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(String humanWordsPassword
			, boolean bys, String lockBys);
	//���������etl���Ժ�ȥ�� ������20211107 �õ�initonETLSect;
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA_ETL(String humanWordsPassword
			, boolean bys, String lockBys) ;

	//����PDI��ʼ�����߷�Util����
	public Token sessionInitByTokenPDICertsDNA(TokenCerts tokenCerts);
	//���г�ʼ����
	public Token sessionInitByTokenCertsDNA(TokenCerts tokenCerts) ;

	//���� �������ļ��
	public boolean sessionCheckWithOrderPDSKey(Token token, TokenCerts tokenCerts) ;

	//���� �������ļ��
	public boolean sessionCheckWithPostPDSKey(Token token, TokenCerts tokenCerts);

	//ArrayValidation{
	//�Ժ� validation������� check��fix�� 2�����֡�
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

	//��������������ļ����������½ܸ���һ��csharp�İ�ť�߿���˸���ƣ�
	//���������� ����ɭ��ţ��Ȼ ���Ұ�������Ը��ˣ�����2014�����etl�� �ָť�����ʱ��
	//�ȸ�������stackoverflow �� �׹���sun�Ĺٷ� demo��ô��� ��̬�������
	//����������������detasplit �������ʱ�����߸��񾭾�����ʹ,����2���¾�ֹͣ��
	//һֹͣ�ҾͲ�ʹ�ˣ�Ī��ǰ����ʱ������ȥ�������Ի�//�����ڻ����л��ڵ�ı�Ե���˱Ƚϳ�ı�Ե��
	//������2016-7��֮���ҿ�ʼ�����������, ���һ�κ����½�˵����201����
	//һ������ �ڹ�����ͨip��ô������վ��������һ�� �����ǣ��Ͱ��Ҹ�ɾ�ˡ�
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
