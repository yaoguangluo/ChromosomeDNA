package SEM.bloom;

import java.util.HashMap;
import java.util.Map;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI_XCDX;
import SVQ.stable.StableCommon;

//��dna���ܵ� main test ���з�װ�ɺ�����׼���Ż��¡�
//����Ȩ��+ ����= ������
public class StaticFunctionMapA_IDUQ_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	//����
	public static String  getPDW(String string) {
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular= new FullDNATokenPDI_XCDX();
		pDE_RNA_FullFormular.text= string.toString();
		pDE_RNA_FullFormular.pdw= pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
		return pDE_RNA_FullFormular.pdw;
	}

	//����
	public static String getLock() {
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular= new FullDNATokenPDI_XCDX();
		String[] lock= new String[12];
		lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
		lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
		lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
		int i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		return   pDE_RNA_FullFormular.lock;
	}

	//ɢ������ // �ڶ�������������vpcs �ӿڶ������� ������
	public static String getCode(String lock, String pdw) {
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular= new FullDNATokenPDI_XCDX();
		for(int i= 0; i< pdw.length(); i++) {
			pDE_RNA_FullFormular.code+= lock + pdw.charAt(i);
		}
		return  pDE_RNA_FullFormular.code;
	}

	//pde���� ȷ��pDE_RNA_FullFormular ������Ҫ�� ���� ���� ɢ�� ������ֵ��
	public static FullDNATokenPDI_XCDX doPDE(FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		System.out.println("����: "+ pDE_RNA_FullFormular.pdw);
		System.out.println("����: "+ pDE_RNA_FullFormular.lock);
		System.out.println("ɢ������:"+ pDE_RNA_FullFormular.code);
		//pDE_RNA_FullFormular.bys= "0.6/0.3/0.5/0.632";
		System.out.println("��̬��Կ: "+ pDE_RNA_FullFormular.bys);
		pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
		System.out.println("��̬��չ��Ԫ����Կ��E: "+ pDE_RNA_FullFormular.pdedeKey);
		System.out.println("��̬��չ��Ԫ����Կ��S: "+ pDE_RNA_FullFormular.pdedsKey);
		System.out.println("��̬��չ��Ԫ: "+ pDE_RNA_FullFormular.pds);
		System.out.println("��̬��չ��Ԫ����Կ��E: "+ pDE_RNA_FullFormular.pdeieKey);
		System.out.println("��̬��չ��Ԫ����Կ��S: "+ pDE_RNA_FullFormular.pdeisKey);
		System.out.println("��̬��չ��Ԫ: "+ pDE_RNA_FullFormular.pde);
		return pDE_RNA_FullFormular;
	}

	//ǰ�����  ȷ��pDE_RNA_FullFormular ������Ҫ�� ���� ���� ɢ�� ����Կ�� ���������ֵ��
	public static FullDNATokenPDI_XCDX doPrefixPDE(FullDNATokenPDI_XCDX pDE_RNA_FullFormular) {
		pDE_RNA_FullFormular.time= "" + System.currentTimeMillis();
		pDE_RNA_FullFormular.cacheId= "ID" + Math.random() + StableCommon.STRING_SYMBOL_PER + Math.random();
		System.out.println("ʱ��:  " + pDE_RNA_FullFormular.time);
		System.out.println("�˺���������ַ���:  " + pDE_RNA_FullFormular.cacheId);
		pDE_RNA_FullFormular.session_key= pDE_RNA_FullFormular.pde;
		System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
		System.out.println("=============================================================================");
		System.out.println("��ʼǰ����֤��");
		System.out.println("��ʼSession������ " + pDE_RNA_FullFormular.session_key);
		System.out.println("��ʼ����Կ�׽�����" + pDE_RNA_FullFormular.pdedeKey+ pDE_RNA_FullFormular.pdedsKey
				+ pDE_RNA_FullFormular.pdeieKey+ pDE_RNA_FullFormular.pdeisKey);

		FullDNATokenPDI_XCDX pDE_RNA_FullFormular1= new FullDNATokenPDI_XCDX();
		pDE_RNA_FullFormular1.pdedeKey= pDE_RNA_FullFormular.pdedeKey.toString();
		pDE_RNA_FullFormular1.pdedsKey= pDE_RNA_FullFormular.pdedsKey.toString();
		pDE_RNA_FullFormular1.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular1.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();

		pDE_RNA_FullFormular.doKeyUnPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular1, true);
		System.out.println();
		System.out.println("�õ�ԭ��ԪԪ��DNA���У�"+ pDE_RNA_FullFormular.pds);
		System.out.println("�õ��½�ԪԪ��DNA���У�"+ pDE_RNA_FullFormular1.pds);
		System.out.println("�õ�ԭԪ��DNA���У�"+ pDE_RNA_FullFormular.pde);
		System.out.println("�õ���Ԫ��DNA���У�"+ pDE_RNA_FullFormular1.pde);
		System.out.println("��֤��ȷ��");
		System.out.println(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde)? "��ȷ": "ʧ��");
		return pDE_RNA_FullFormular1;
	}

	//�������  ȷ��pDE_RNA_FullFormular �� pDE_RNA_FullFormular1 ������Ҫ�� ���� ���� ɢ�� ����Կ�� ���������ֵ��
	public static FullDNATokenPDI_XCDX doPostfixPDE(FullDNATokenPDI_XCDX pDE_RNA_FullFormular
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormularNew) {
		System.out.println("=======================================================================");
		System.out.println("��ʼ������֤��");
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular2= new FullDNATokenPDI_XCDX();
		pDE_RNA_FullFormular2.pdeieKey= pDE_RNA_FullFormular.pdedeKey.toString();
		pDE_RNA_FullFormular2.pdeisKey= pDE_RNA_FullFormular.pdedsKey.toString();
		pDE_RNA_FullFormular2.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();
		System.out.println("׼������Ԫ��DNA���У�"+ pDE_RNA_FullFormularNew.pde);
		pDE_RNA_FullFormular2.doSessionKeyUnPress(pDE_RNA_FullFormularNew.pde, pDE_RNA_FullFormular2, true);
		System.out.println();
		System.out.println("�õ�ԭ����ԪԪ��DNA���У�"+ pDE_RNA_FullFormularNew.pds);
		System.out.println("�õ�������ԪԪ��DNA���У�"+ pDE_RNA_FullFormular2.pds);
		System.out.println("��֤��ȷ��");
		System.out.println(pDE_RNA_FullFormularNew.pds.equals(pDE_RNA_FullFormular2.pds)? "��ȷ": "ʧ��");	

		return pDE_RNA_FullFormular2;
	}

	//������� ȷ��pDE_RNA_FullFormular�� pDE_RNA_FullFormular1 ������Ҫ�� ���� ���� ɢ�� ����Կ�� ���������ֵ��
	public static FullDNATokenPDI_XCDX doSurffixPDE(FullDNATokenPDI_XCDX pDE_RNA_FullFormular
			, FullDNATokenPDI_XCDX pDE_RNA_FullFormularNew) {
		System.out.println("=========================================================================");
		System.out.println("��ʼ������֤��");
		FullDNATokenPDI_XCDX pDE_RNA_FullFormular3= new FullDNATokenPDI_XCDX();

		pDE_RNA_FullFormular3.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular3.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();	

		System.out.println("׼������Ԫ��DNA���У�"+ pDE_RNA_FullFormularNew.pde);//pde�ӳ�
		pDE_RNA_FullFormular3.doFullSessionKeyUnPress(pDE_RNA_FullFormularNew.pde, pDE_RNA_FullFormular3, true);
		System.out.println();
		System.out.println("�õ�ԭ����ԪԪ��DNA���У�"+ pDE_RNA_FullFormularNew.pds);
		System.out.println("�õ�������ԪԪ��DNA���У�"+ pDE_RNA_FullFormular3.pds);
		System.out.println("��֤��ȷ��");
		System.out.println(pDE_RNA_FullFormularNew.pds.equals(pDE_RNA_FullFormular3.pds)? "��ȷ": "ʧ��");	
		System.out.println("׼���������Ԫ��DNA���У�"+ pDE_RNA_FullFormularNew.pde);
		System.out.println("׼���������Ԫ��DNA���У�"+ pDE_RNA_FullFormular3.pde);
		System.out.println(pDE_RNA_FullFormularNew.pde.equals(pDE_RNA_FullFormular3.pde)? "��ȷ": "ʧ��");		
		return pDE_RNA_FullFormular3;
	}
}
