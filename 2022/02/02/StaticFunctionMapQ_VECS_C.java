package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.table.DefaultTableModel;
import ME.APM.VSQ.App;
//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapQ_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 

	public void searchFromTable(String key, DefaultTableModel newTableModel, Object[][] tableData_old
			, ArrayList<String> copy_xj, Map<String, String> dic_xj, App app) throws IOException;

	public List<Object[]> searchFromTablewithScale(String key, ArrayList<String> 标题
			, Map<String, String> 内容, double lookrot) throws IOException;
}	