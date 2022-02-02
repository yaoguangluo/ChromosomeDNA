package SEM.bloom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//著作权人+作者=罗瑶光
public interface StaticFunctionMapS_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 
	//s 组的记录
	// D_CellStandard{	

	//	delete samples
	//	tableName:test:delete;
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;

	public Map<String, Object> DeleteCellORM(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException;

	public Map<String, Object> DeleteCellPLSQL(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException;

	//D_Standard{	

	//	drop samples
	//	tableName:test:drop; 

	public Map<String, Object> DropCellORM(String rootPath, String baseName
			, String tabKey) throws Exception;

	public Map<String, Object> DropCellPLSQL(String rootPath, String baseName
			, String tabKey) throws IOException;


	//IU_CellStandard{	
	public Map<String, Object> InsertCellORM(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException;

	public Map<String, Object> InsertCellPLSQL(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException;

	// U_CellStandard{	


	//  稍后我会把下面这个2个模式变成ORM UNSQL, 函数是很好写, 但是我在思考 
	//or and 太多 怎么进行规范传参..
	//  我的动机很简单, 就是养疗经数据表可以直接数据库操作修改.
	//  见DNA编码与计算第一卷 308页
	//	update samples 
	//	tableName:test:update; 
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire; 
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;
	//	
	//	update samples tableName:test:update; 
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	join:backend:utest;
	//	condition:and:uCulumn3|<|20; 
	//	relation:and:testCulumn1|==|uCulumn1:testCulumn2|!=|uCulumn2; 
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;

	public Map<String, Object> UpdateCellORM(String tabKey, String rowId
			, String cellName, String cellValue) throws IOException;
	public Map<String, Object> UpdateCellORMByRowId(String rootPath
			, String baseName, boolean unTest, String tabKey, String rowId
			, String cellName, String cellValue) throws IOException;

	public Map<String, Object> UpdateCellORMByEquals(String rootPath
			, String baseName, boolean unTest, String tabKey, String conditionSubject
			, String conditionObject, String cellName, String cellValue) throws IOException;

	//	update samples tableName:test:update; 
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	join:backend:utest;
	//	condition:and:uCulumn3|<|20; 
	//	relation:and:testCulumn1|==|uCulumn1:testCulumn2|!=|uCulumn2; 
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;


	//	String plsql= "setRoot:C:/DetaDB1;" + 
	//	"baseName:ZYY;" + 
	//	"tableName:"+ tabKey+ ":update;" +
	//	"condition:or:ID|==|rowId;" +
	//	"culumnValue:cellName:cellValue;";
	//
	//  condition:"我似乎没有设计rowid culumnid的数字选项 函数,稍后补充下":19850526;
	//  condition 可以用uid in 或者 uid== 来实现.这样会导致计算变慢,所以 设计rowid culumnid的数字比较选项是有必要的.

	public Map<String, Object> UpdateCellPLSQL(String tabKey, String rowId
			, String cellName, String cellValue) throws IOException;


	//S 接口的应用
	public void creatMap() throws Exception;
}
