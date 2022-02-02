package SEM.bloom;

import java.util.HashMap;
import java.util.Map;

import OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OCI.ME.analysis.C.A_XCDX_Map;
import OCI.ME.analysis.C.BinaryForest_A;
import OCI.ME.analysis.C.CogsBinaryForest_A;
import OCI.ME.euclid.C.Euclid_C;
import OCI.ME.liner.C.Quick6DLuoYaoguangSort;
import OCI.ME.nero.C.NERO_C;
import OCI.ME.nero.C.NERO_C_OneTime;
import OCI.ME.nlp.C.NLP_C;
import OCI.ME.nlp.C.Nlp_C_XCDX_A;
import OCI.ME.nlp.C.Nlp_C_XCDX_S;
import OCI.ME.pos.C.Pos_C_XCDX_E;
import OCI.ME.pos.C.Pos_C_XCDX_O;
import OCI.ME.pos.C.Pos_C_XCDX_P;
import OCI.OPM.VEC.SVQ.MPC.fhmm.C.BehaviorMap;
import OCI.SVQ.MPC.fhmm.C.FMHMMList;
//���쿴�� ������ԭ�����³´�л���� ��Ƭ���̳У����ǽ�������Ϊ�ຯ��class�ӿ�
//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public interface StaticFunctionMapE_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();

	//SensingMap, 
	public SensingMap getSensingMap();
	//EmotionMap, 
	public EmotionMap getEmotionMap();
	//CogsBinaryForest_A, 
	public CogsBinaryForest_A getCogsBinaryForest_A();
	//Euclid_C, 
	public Euclid_C getEuclid_C();
	//Quick6DLuoYaoguangSort, 
	public Quick6DLuoYaoguangSort getQuick6DLuoYaoguangSort();
	//NERO_C_OneTime, 
	public NERO_C_OneTime getNERO_C_OneTime();
	//NERO_C
	public NERO_C getNERO_C();
	//NLP_C, 
	public NLP_C getNLP_C();
	//BehaviorMap, 
	public BehaviorMap getBehaviorMap();
	//FMHMMList
	public FMHMMList getFMHMMList();
	
	//Pos_C_XCDX_P
	public Pos_C_XCDX_P getPos_C_XCDX_P();
	//Pos_C_XCDX_E
	public Pos_C_XCDX_E getPos_C_XCDX_E();
	//Pos_C_XCDX_O
	public Pos_C_XCDX_O getPos_C_XCDX_O();
	//Nlp_C_XCDX_S
	public Nlp_C_XCDX_S getNlp_C_XCDX_S();
	//Nlp_C_XCDX_A
	public Nlp_C_XCDX_A getNlp_C_XCDX_A();
	//A_XCDX_Map
	public A_XCDX_Map getA_XCDX_Map();
	//A
	public A getA();
	//BinaryForest_A
	public BinaryForest_A getBinaryForest_A();
}
