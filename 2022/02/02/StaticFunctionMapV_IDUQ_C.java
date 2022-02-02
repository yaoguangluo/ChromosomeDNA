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

//����Ȩ��+ ����= ������
public interface StaticFunctionMapV_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	 

	public MakeContainerSJFX ��ʼETL(App app, Container jpanelSecond);
	public GUISample ������ʼETL(Object[][] tableData_old, JTextPane text, App app, CogsBinaryForest_AE _A, Map<String, String> pos);
	public void չʾETL() throws IOException;
	public void ETL�ĵ���ȡ();
	public void ETL�ĵ�ִ��();
	public void ETL�ĵ�����();

	// LoadFile{
	public String getOrigianlTextByLock(String inputString, String lockString);
	public LinkNode Load(LinkNode first, NodeShow nodeView, File file, LinkList thislist);
}
