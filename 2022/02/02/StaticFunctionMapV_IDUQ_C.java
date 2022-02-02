package SEM.bloom;

import java.awt.Container;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.GUISample;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import PEI.thread.MakeContainerSJFX;

//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapV_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 

	public MakeContainerSJFX 初始ETL(App app, Container jpanelSecond);
	public GUISample 仅仅初始ETL(Object[][] tableData_old, JTextPane text, App app, CogsBinaryForest_AE _A, Map<String, String> pos);
	public void 展示ETL() throws IOException;
	public void ETL文档读取();
	public void ETL文档执行();
	public void ETL文档保存();

	// LoadFile{
	public String getOrigianlTextByLock(String inputString, String lockString);
	public LinkNode Load(LinkNode first, NodeShow nodeView, File file, LinkList thislist);
}
