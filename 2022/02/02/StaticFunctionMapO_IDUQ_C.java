package SEM.bloom;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTextPane;

import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;

//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public interface StaticFunctionMapO_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	//SaveAnd_U_File{
	public void U_(String fileCurrentpath, LinkNode first);

	// SaveAs_I_File{
	//׼����ʼӦ�ò����¡�
	public Map<String, String> getRandomDNAkey(SessionValidation sessionValidation, String password)
			throws UnsupportedEncodingException;
	public void Save(LinkNode first) ;

	// BootNeroCell{
	public void bootCell(LinkNode linkNode, JTextPane rightBotJTextPane
			, ThisCanvas canvas) throws IOException, UnsupportedAudioFileException
	, InterruptedException, CloneNotSupportedException;	

	//BootNeroDoc extends Thread implements Runnable{
	public OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc BootNeroDoc(LinkList first
			, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas);

	// H_Keeper{
	public void vpcsRegister(LinkList first, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas);

	// Pillow{
	public void register(BootNeroDoc bootNeroDoc);
}

