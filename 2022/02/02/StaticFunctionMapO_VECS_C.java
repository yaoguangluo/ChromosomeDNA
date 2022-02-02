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
//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public interface StaticFunctionMapO_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 

	public void SortStringDemo(); //�Ժ�������
	//TransactionDelegate {�߼��� Ӧ�ýӿ��ԡ�
	public Map<String, Object> transactionLogin(String uEmail, String uPassword)throws Exception ;
	public Map<String, Object> transactionRegister(String uEmail, String uEmailEnsure
			, String uName, String uPassword, String uPassWDEnsure, String uAddress
			, String uPhone, String uWeChat, String uQq, String uAge,String uSex) throws Exception;

	//���ƾ�������
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
	//���쿴���·����ҵ����ݿ� û�з�ҳ���Ժ�����һ���ļ������Ϊ3000 rows 
	//һҳ���Ȳ����ˣ�shell �ò���sheets�߼���
	//������20210927
	public Map<String, Object> selectRowsByTablePath(String tablePath, String pageBegin
			, String pageEnd, String direction) throws IOException;
	//db�滻shell�� 20210927
	public Object selectRowsByAttributesOfCondition(Map<String, Object> object) throws IOException;
	//20210927 ע���� �Ժ��滻
	//����Ƴ� plsearch �﷨�� plsql �﷨ͨ�ã� ������֮���plorm ͳһһ�ַ�ʽ��չ pladmin
	public List<Map<String, Object>> selectRowsByAttributesOfAggregation(Map<String, Object> object)
			throws InstantiationException
			, IllegalAccessException, IOException;
	public Object selectRowsByAttributesOfGetCulumns(Map<String, Object> object);
	//PLETL����һ�֮࣬��׼���ֳ�ȥ
	//������ 20211010
	public Object selectRowsByAttributesOfPLETL(Map<String, Object> object) throws InstantiationException
	, IllegalAccessException
	, IOException;
	public Object selectRowsByAttributesOfPLTCP(Map<String, Object> object) throws IOException;

	//XA_ShellTables{
	public Map<String, XA_ShellTable> searchShellTables= new HashMap<>();
	//�Ȱѽӿ����㣬������20210925
	//�����ɱ�ӳ��
	public boolean addNewSearchShellTable(String tableName, JTable jtable);

	//��sonar��ʽ�ظ���������
	public Object[] getNewSearchShellTableSpecFromDefaultTableModel(DefaultTableModel defaultTableModel) ;

	//��sonar��ʽ�ظ���������
	public Object[][] getNewSearchShellTableDataFromDefaultTableModel(DefaultTableModel defaultTableModel) ;

	//��Ƹ�row�Ľ�ϱ�map�ڴ�ṹ ����shell�ı�ͷ������
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec
			, DefaultTableModel defaultTableModel) ;

	//��Ƹ�row�Ľ�ϱ�map�ڴ�ṹ ����shell�ı�ͷ������
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, Object[][] tableData) ;

	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á�
	public boolean addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel) ;

	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á� object data �Ժ�׼�� �� _S_ Ԫ���滻��
	public boolean addNewSearchShellTableWithObjectData(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData);

	//shellӳ���װ
	public boolean addNewSearchShellTable(String tableName, Object[][] defaultTableData
			, Object[] defaultTableDataSpec);

	//Reflection map ��ͷ��ʽ�洢
	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á� object data �Ժ�׼�� �� _S_ Ԫ���滻��
	public boolean addNewSearchShellTableWithObjectDataReflectionDBRows(String tableName
			, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData) ;

	//Reflection map ��ͷ��ʽ�洢
	//shellӳ���װ
	public boolean addNewSearchShellTableReflectionDBRows(String tableName, Row[] rows
			, Object[] defaultTableDataSpec );

	//Ȼ���������ƾ���jtable��ȫ����������ļ����� ����shell ��װ�������ݿ���ڴ�ӳ����롣
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
	//�𲽷������������vpcs ֮��̳С�
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

	//OSI.AOP.VPC.server ��������

	//PL ETL shell
	//E_pl_XA_E { 
	public Map<String, Object> E_pl_XA(String plSearch, boolean mod, Map<String, Object> output) throws Exception;
	public Map<String, Object> E_pl_XA(PL_XA_E orm, boolean b, Map<String, Object> output) throws Exception;

	//P_AO_pl_XA {
	public void P_AggregationLimitMap(String[] sets, List<Map<String, Object>> output) throws InstantiationException
	, IllegalAccessException, IOException;

	//�ֳ�ȥ
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
	//�Ƚ��Ƿ�������ȡ���б���� ������ ������ 20210405
	//�����Ӳ�̲�ѯ��������ʶ��, ������������ݻ����ѯ�������� ���û�ù���, ʱ�������2019��1�º�, ���ȵ�ͨ��, ֮��˷Դ.
	//׼��������20210406 ������
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
			, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException;
	//P_kernel�ȱȸ��ƹ�����search shell����� ��Ҫ�滻�������ݿⴢֵ�� jtable����output 
	//��jtable���ݱ������ ������ݿ��dbӳ�䣬 ���������dma��ÿһ���ļ��ļ��ϣ�
	//DefaultTableModel �� Object[][] huaRuiJiJtable ��Ӧ DBTablePath
	//readDBTableRowIndexFile��Ӧ row id
	//huaRuiJiJtableCulumns ��Ӧ culumn
	//jtable  ̫�ϲ㣬������spec �ٶȻ������������object[][]  ��
	//������ 20210924
	//����һ�����⣬�ҵ�table db�Ƿ�����map �ṹ�� �Դ���ͷkey�� ��data �Ǿ��������߼�Ҫȫ���ĵ�
	public void P_kernel_search(String temp, File readDBTableRowIndexFile, int rowId, Object[] huaRuiJiJtableCulumns
			, Object[][] huaRuiJiJtable, List<Map<String, Object>> output, Row bufferRow, Map<String, Object> rowMap) 
					throws IOException;

	//P_CO_pl_XA_XCDX_Map extends P_CO_pl_XA_XCDX {
	//�Ժ��Ż���ͳһ�������������Ҫ��ת����2019-1-15 tin
	public   Map<String, Object> rowToRowMap(Row row);
	//��rowToRowMap �������� RowMapToRow һ����֤��2������С����ģ�ͣ�������һ����������㡣
	//������202109302339
	public Row rowMapToRow(Map<String, Object> map);

	//è��� ����pmap��output �����ˣ� ����һ������ȫ�����ˡ�20210927
	//���ùܣ���P_Map �ĳ� shellP_Map
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
	//���������, ��, ׼����֤ ������


	//plsql����ִ��ָ�� ���ڼ���� ������ 20210405
	public void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception;
	public void P_StoreValues(String[] acknowledge, Map<String, Object> output);
	//֮��׼����Ƴɹ����� ���� ������ bean
	public void P_fileOperations(String[] acknowledge, Map<String, Object> output);

	//ShellReplace {
	public void replaceString(String fileDirectroyPath, String searchString, String needReplaceString) 
			throws IOException ;

	//�Ժ���Ƴ�map���洢��ЩString����������
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, Map<String, String> conditions) throws IOException ;
	//�Ժ���߳�
	public void start() throws IOException ;

	//�ļ�����Ӧɸѡ
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileName) throws IOException ;
	//�ļ���׺ɸѡ
	public void replaceStringWithFileType(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileType) throws IOException;

	//�ļ���Сɸѡ
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString
			, String needReplaceString, long filesize_KB) throws IOException ;
	//�ļ���Сɸѡ
	public void replaceStringWithFileLines(String fileDirectroyPath, String searchString
			, String needReplaceString, long beginLine, long endLine) throws IOException ;
	public void mainShellReplace(String[] argv) throws IOException;
	//���һ�ּ򵥵�logģʽ�ȡ�
	public void replaceStringWithLogRecording(Map<String, String> conditions) throws IOException;
}
